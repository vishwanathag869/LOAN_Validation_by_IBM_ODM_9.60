# LOAN_Validation_by_IBM_ODM_9.60


# Loan Application UI

Spring Boot 3.5 / Java 21 loan-application builder intended for IBM ODM demonstrations. The UI binds a Thymeleaf form to `LoanForm`; the controller maps it to XOM-style POJOs, and Jackson writes `generated-json/loan-application.json`.

## Run

```bash
mvn spring-boot:run
```

Visit `http://localhost:8080`. Submit the application, then download the persisted JSON from the success screen.

## ODM extension point

`LoanController#submit` retains the populated `LoanApplication` object. Add an HTTP client call there after `jsonService.save(application)` to send precisely the same payload to an ODM RuleApp / decision service.

## IBM ODM SOAP Decision Service

`OdmSoapDecisionService` implements the supplied `DecConfigDecOpsDecisionService.wsdl`: SOAP 1.1, document/literal operation `DecOps`, and SOAPAction `DecOps`. It uses Java 21's standard `HttpClient`—no generated stubs or SOAP libraries are required.

Configure the real service endpoint and credentials outside source control:

```powershell
$env:ODM_SOAP_ENDPOINT = 'https://your-odm-host/DecisionService/ws/DecConfig/1.0/DecOps/1.0/v75'
$env:ODM_SOAP_USERNAME = 'user'   # omit for no Basic authentication
$env:ODM_SOAP_PASSWORD = 'password'
```

Invoke it from application code with the object already created by the form:

```java
OdmSoapDecisionResponse response = odmSoapDecisionService.execute(loanApplication, "YOUR_DECISION_ID");
```

The WSDL requires applicant age plus loan amount, interest rate, and tenure. It also defines required primitive values for any populated optional nested object (such as `income` or `creditHistory`), so provide those fields before invoking the service.
