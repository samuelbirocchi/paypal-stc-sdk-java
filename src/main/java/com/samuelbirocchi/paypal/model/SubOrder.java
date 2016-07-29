package com.samuelbirocchi.paypal.model;

import java.util.List;

public class SubOrder {

    private List<Item> lineItems;
    private ShippingInfo shippingInfo;
    private String delivery;

    public List<Item> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<Item> lineItems) {
        this.lineItems = lineItems;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

}
