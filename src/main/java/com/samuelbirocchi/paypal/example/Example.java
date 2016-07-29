package com.samuelbirocchi.paypal.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.samuelbirocchi.paypal.client.PaypalSTCClient;
import com.samuelbirocchi.paypal.model.PaypalRiskRequest;

import java.io.IOException;

/**
 * @author Samuel Birocchi (samuelbirocchi@gmail.com)
 */
public class Example {

    public static void main(String[] args) throws IOException {
        PaypalSTCClient.access_key = "access_key";
        PaypalSTCClient.secret_key = "secret_key";
        PaypalSTCClient.merchant_id = "merchant_id";
        PaypalSTCClient.test = true;

        PaypalRiskRequest paypalRiskRequest =
                new ObjectMapper().setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE)
                        .readValue(
                                "{\"tracking_id\": \"trackingId20131029\",\"ip_address_info\": {\"ip_address\": \"173.0.84.34\",\"first_seen\": \"2012-12-09T19:14:55.277-08:00\",\"last_seen\": \"2012-12-09T19:14:55.277-08:00\",\"seen_count\": \"1\"}}",
                                PaypalRiskRequest.class);

        System.out.println(PaypalSTCClient.sendInfomation("trackingId20131029", paypalRiskRequest));
    }

}
