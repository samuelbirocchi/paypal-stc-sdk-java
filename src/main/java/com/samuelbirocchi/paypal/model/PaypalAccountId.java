package com.samuelbirocchi.paypal.model;

public class PaypalAccountId {

    private String payerId;

    public PaypalAccountId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }
}
