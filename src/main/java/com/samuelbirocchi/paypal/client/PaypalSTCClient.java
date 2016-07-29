package com.samuelbirocchi.paypal.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.samuelbirocchi.paypal.model.OAuth2Response;
import com.samuelbirocchi.paypal.model.PaypalRiskRequest;
import org.apache.http.HttpHeaders;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Samuel Birocchi (samuelbirocchi@gmail.com)
 */
public class PaypalSTCClient {

    public static String access_key;
    public static String secret_key;
    public static String merchant_id;
    public static Boolean test;
    public static String access_token;

    static {
        Unirest.setObjectMapper(new com.mashape.unirest.http.ObjectMapper() {
            private ObjectMapper targetMapper = new ObjectMapper();

            @Override
            public <T> T readValue(String s, Class<T> aClass) {
                try {
                    return targetMapper.readValue(s, aClass);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
            }

            @Override
            public String writeValue(Object o) {
                try {
                    return targetMapper.writeValueAsString(o);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException();
                }
            }
        });
    }

    public static Boolean sendInfomation(String merchantTransactionId, PaypalRiskRequest paypalRiskRequest) {
        String oAuthUrl =
                test ? "https://api.sandbox.paypal.com/v1/oauth2/token" : "https://api.paypal.com/v1/oauth2/token";

        Map<String, Object> params = new HashMap<>();
        params.put("grant_type", "client_credentials");
        params.put("response_type", "token");


        if (Strings.isNullOrEmpty(access_token)) {
            OAuth2Response oAuth2Response;
            try {
                oAuth2Response = Unirest.post(oAuthUrl)
                        .basicAuth(access_key, secret_key)
                        .fields(params)
                        .asObject(OAuth2Response.class)
                        .getBody();
            } catch (UnirestException e) {
                e.printStackTrace();
                return false;
            }

            access_token = oAuth2Response.getAccessToken();
        }

        String url = test
                ? "https://api.sandbox.paypal.com/v1/risk/transaction-contexts/%s/%s"
                : "https://api.paypal.com/v1/risk/transaction-contexts/%s/%s";
        url = String.format(url, merchant_id, merchantTransactionId);
        try {
            Unirest.put(url)
                    .header(HttpHeaders.AUTHORIZATION, "Bearer" + access_token)
                    .body(paypalRiskRequest)
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
            access_token = null;
            return false;
        }

        return true;
    }

}
