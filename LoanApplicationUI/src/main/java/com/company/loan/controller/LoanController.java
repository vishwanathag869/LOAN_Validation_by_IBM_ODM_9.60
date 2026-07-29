package com.company.loan.controller;

import com.company.loan.model.*;
import com.company.loan.service.JsonService;
import com.company.loan.service.OdmRestDecisionResponse;
import com.company.loan.service.OdmRestDecisionService;
import jakarta.validation.Valid;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.time.Year;

@Controller
public class LoanController {
 private final JsonService jsonService;
 private final OdmRestDecisionService odmRestDecisionService;
 private final boolean invokeOdmOnSubmit;
 private final String odmDecisionId;
 public LoanController(JsonService jsonService, OdmRestDecisionService odmRestDecisionService,
                       @Value("${odm.rest.invoke-on-submit:true}") boolean invokeOdmOnSubmit,
                       @Value("${odm.rest.decision-id:string1}") String odmDecisionId){
   this.jsonService=jsonService; this.odmRestDecisionService=odmRestDecisionService;
   this.invokeOdmOnSubmit=invokeOdmOnSubmit; this.odmDecisionId=odmDecisionId;
 }
 @GetMapping("/") public String index(Model model){ LoanForm f=new LoanForm(); f.setApplicantId("A"+(1000+(int)(Math.random()*9000))); f.setLoanId("L"+(1000+(int)(Math.random()*9000))); f.setAge(30); f.setGender("Male"); f.setMonthlyIncome(85000L); f.setAnnualIncome(1020000L); f.setLoanType("HOME"); f.setLoanAmount(5000000L); f.setTenureMonths(240); f.setInterestRate(8.5); model.addAttribute("form",f); return "index"; }
 @PostMapping("/applications") public String submit(@Valid @ModelAttribute("form") LoanForm form, BindingResult result, Model model) throws IOException {
   if(result.hasErrors()) return "index";
   LoanApplication application=toApplication(form);
   OdmRestDecisionResponse odmResponse=null;
   String odmError=null;
   if(invokeOdmOnSubmit){
     try { odmResponse=odmRestDecisionService.execute(application); }
     catch(IllegalStateException ex){ odmError=ex.getMessage(); }
   }
   jsonService.save(application);
   model.addAttribute("json",jsonService.toJson(application)); model.addAttribute("application",application);
   model.addAttribute("odmResponse",odmResponse); model.addAttribute("odmError",odmError); model.addAttribute("odmInvocationEnabled",invokeOdmOnSubmit);
   return "success";
 }
 @GetMapping("/applications/latest/download") public ResponseEntity<ByteArrayResource> download() throws IOException { if(!jsonService.exists()) return ResponseEntity.notFound().build(); return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=loan-application.json").contentType(MediaType.APPLICATION_JSON).body(new ByteArrayResource(jsonService.latest())); }
 private LoanApplication toApplication(LoanForm f){
   Applicant a=new Applicant(); a.setApplicantId(f.getApplicantId());a.setFirstName(f.getFirstName());a.setLastName(f.getLastName());a.setAge(f.getAge());a.setGender(f.getGender());
   ApplicantDetails ad=new ApplicantDetails();ad.setPan(f.getPan());ad.setAadhaar(f.getAadhaar());ad.setMaritalStatus(f.getMaritalStatus());ad.setDependents(f.getDependents());ad.setExistingCustomer(f.getExistingCustomer());a.setDetails(ad);
   Employment e=new Employment();e.setEmployer(f.getEmployer());e.setEmploymentType(f.getEmploymentType());e.setExperienceYears(f.getExperienceYears());e.setDesignation(f.getDesignation());e.setSalaried(f.getSalaried());a.setEmployment(e);
   Income i=new Income();i.setMonthlyIncome(f.getMonthlyIncome());i.setAnnualIncome(f.getAnnualIncome());i.setOtherIncome(f.getOtherIncome());a.setIncome(i);
   Address addr=new Address();addr.setHouseNo(f.getHouseNo());addr.setStreet(f.getStreet());addr.setCity(f.getCity());addr.setState(f.getState());addr.setCountry(f.getCountry());addr.setPostalCode(f.getPostalCode());a.setAddress(addr);
   CreditHistory ch=new CreditHistory();ch.setCreditScore(f.getCreditScore());ch.setActiveLoans(f.getActiveLoans());ch.setOutstandingAmount(f.getOutstandingAmount());ch.setLoanDefault(f.getLoanDefault());a.setCreditHistory(ch);
   BankDetails b=new BankDetails();b.setBankName(f.getBankName());b.setAccountNumber(f.getAccountNumber());b.setAccountType(f.getAccountType());b.setBalance(f.getBalance());a.setBankDetails(b);
   Loan l=new Loan();l.setLoanId(f.getLoanId());l.setLoanType(f.getLoanType());LoanDetails ld=new LoanDetails();ld.setLoanAmount(f.getLoanAmount());ld.setTenureMonths(f.getTenureMonths());ld.setInterestRate(f.getInterestRate());ld.setPurpose(f.getPurpose());ld.setRepaymentType(f.getRepaymentType());l.setDetails(ld);Collateral c=new Collateral();c.setCollateralType(f.getCollateralType());c.setMarketValue(f.getMarketValue());c.setVerified(f.getVerified());l.setCollateral(c);
   LoanApplication app=new LoanApplication();app.setApplicant(a);app.setLoan(l);return app;
 }
}
