package com.samuelbirocchi.paypal.model;

import java.util.List;

/**
 * Class used for the PayPal Risk Request
 */
public class PaypalRiskRequest {

    private PaypalAccount senderAccount;
    private List<SubOrder> subOrders;
    private Device device;
    private IpAddressInfo ipAddressInfo;
    private List<KeyValuePair> additionalData;
    private String trackingId;

    public PaypalAccount getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(PaypalAccount senderAccount) {
        this.senderAccount = senderAccount;
    }

    public List<SubOrder> getSubOrders() {
        return subOrders;
    }

    public void setSubOrders(List<SubOrder> subOrders) {
        this.subOrders = subOrders;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public IpAddressInfo getIpAddressInfo() {
        return ipAddressInfo;
    }

    public void setIpAddressInfo(IpAddressInfo ipAddressInfo) {
        this.ipAddressInfo = ipAddressInfo;
    }

    public List<KeyValuePair> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List<KeyValuePair> additionalData) {
        this.additionalData = additionalData;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }
}
