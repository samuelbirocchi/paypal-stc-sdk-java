package com.samuelbirocchi.paypal.model;

public class PaypalAccountDetails {

    private String accountId;
    private String email;
    private String phone;
    private String firstname;
    private String lastName;
    private String dateOfBirth;
    private Address mailingAddress;
    private String createDate;
    private String lastGoodTransactionDate;
    private String transactionCountTotal;
    private String chargebackCountTotal;
    private String transactionCountThreeMonths;
    private String chargebackCountThreeMonths;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastGoodTransactionDate() {
        return lastGoodTransactionDate;
    }

    public void setLastGoodTransactionDate(String lastGoodTransactionDate) {
        this.lastGoodTransactionDate = lastGoodTransactionDate;
    }

    public String getTransactionCountTotal() {
        return transactionCountTotal;
    }

    public void setTransactionCountTotal(String transactionCountTotal) {
        this.transactionCountTotal = transactionCountTotal;
    }

    public String getChargebackCountTotal() {
        return chargebackCountTotal;
    }

    public void setChargebackCountTotal(String chargebackCountTotal) {
        this.chargebackCountTotal = chargebackCountTotal;
    }

    public String getTransactionCountThreeMonths() {
        return transactionCountThreeMonths;
    }

    public void setTransactionCountThreeMonths(String transactionCountThreeMonths) {
        this.transactionCountThreeMonths = transactionCountThreeMonths;
    }

    public String getChargebackCountThreeMonths() {
        return chargebackCountThreeMonths;
    }

    public void setChargebackCountThreeMonths(String chargebackCountThreeMonths) {
        this.chargebackCountThreeMonths = chargebackCountThreeMonths;
    }

}
