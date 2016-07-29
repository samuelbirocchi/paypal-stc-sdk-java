package com.samuelbirocchi.paypal.model;

public class CustomerChargebackInfo {

    private Long totalChargebacks;
    private Long totalTransactions;

    public Long getTotalChargebacks() {
        return totalChargebacks;
    }

    public void setTotalChargebacks(Long totalChargebacks) {
        this.totalChargebacks = totalChargebacks;
    }

    public Long getTotalTransactions() {
        return totalTransactions;
    }

    public void setTotalTransactions(Long totalTransactions) {
        this.totalTransactions = totalTransactions;
    }

}
