package com.samuelbirocchi.paypal.model;

public class ShippingInfo {

    private String firstName;
    private String lastName;
    private Address address;
    private String createdAt;
    private String newAddress;
    private String previousChargeback;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getPreviousChargeback() {
        return previousChargeback;
    }

    public void setPreviousChargeback(String previousChargeback) {
        this.previousChargeback = previousChargeback;
    }
}
