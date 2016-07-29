package com.samuelbirocchi.paypal.model;

public class PaypalAccount {

    private PaypalAccountId paypalAccountId;
    private PaypalAccountDetails partnerAccount;

    public PaypalAccountId getPaypalAccountId() {
        return paypalAccountId;
    }

    public void setPaypalAccountId(PaypalAccountId paypalAccountId) {
        this.paypalAccountId = paypalAccountId;
    }

    public PaypalAccountDetails getPartnerAccount() {
        return partnerAccount;
    }

    public void setPartnerAccount(PaypalAccountDetails partnerAccount) {
        this.partnerAccount = partnerAccount;
    }

}
