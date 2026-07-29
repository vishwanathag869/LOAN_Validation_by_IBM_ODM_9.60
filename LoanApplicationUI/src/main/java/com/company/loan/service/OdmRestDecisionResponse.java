package com.company.loan.service;
public class OdmRestDecisionResponse {
    private final int statusCode; private final String requestJson; private final String responseJson;
    public OdmRestDecisionResponse(int statusCode,String requestJson,String responseJson){this.statusCode=statusCode;this.requestJson=requestJson;this.responseJson=responseJson;}
    public int getStatusCode(){return statusCode;} public String getRequestJson(){return requestJson;} public String getResponseJson(){return responseJson;} public boolean isSuccessful(){return statusCode>=200&&statusCode<300;}
}
