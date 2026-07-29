package com.company.loan.service;

import com.company.loan.model.LoanApplication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.*;

@Service
public class JsonService {
 private final ObjectMapper mapper; private final Path outputFile;
 public JsonService(ObjectMapper mapper, @Value("${loan.json.output-dir:generated-json}") String outputDir) { this.mapper=mapper; this.outputFile=Paths.get(outputDir).resolve("loan-application.json"); }
 public Path save(LoanApplication application) throws IOException { Files.createDirectories(outputFile.getParent()); mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile.toFile(), application); return outputFile; }
 public String toJson(LoanApplication application) throws IOException { return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(application); }
 public byte[] latest() throws IOException { return Files.readAllBytes(outputFile); }
 public boolean exists() { return Files.exists(outputFile); }
}
