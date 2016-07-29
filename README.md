# paypal-stc-sdk-java
Java SDK for PayPal STC integration

[![Build Status](https://travis-ci.org/samuelbirocchi/paypal-stc-sdk-java.svg?branch=master)](https://travis-ci.org/samuelbirocchi/paypal-stc-sdk-java)

## Maven
```xml
<dependency>
    <groupId>com.samuelbirocchi</groupId>
        <artifactId>paypal-stc-sdk-java</artifactId>
    <version>1.0</version>
</dependency>
```

## Usage

```java
PaypalSTCClient.access_key = "access_key";
PaypalSTCClient.secret_key = "secret_key";
PaypalSTCClient.merchant_id = "merchant_id";
PaypalSTCClient.test = true;

PaypalRiskRequest paypalRiskRequest = new PaypalRiskRequest();
paypalRiskRequest.setTrackingId("tracking_id");

PaypalAccountDetails paypalAccountDetails = new PaypalAccountDetails();
paypalAccountDetails.setFirstName("Name");

...

PaypalAccount senderAccount = new PaypalAccount();
senderAccount.setPartnerAccount(paypalAccountDetails);
paypalRiskRequest.setSenderAccount(senderAccount);

PaypalSTCClient.sendInfomation("tracking_id", paypalRiskRequest);
```
