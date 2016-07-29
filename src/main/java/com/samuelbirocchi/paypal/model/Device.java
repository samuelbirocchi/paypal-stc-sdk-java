package com.samuelbirocchi.paypal.model;

public class Device {

    private IpAddressInfo lastSeenIpAddress;
    private String id;
    private String type;
    private String operatingSystem;
    private String userAgent;
    private String firstSeen;
    private String lastSeen;
    private String seenCount;

    public IpAddressInfo getLastSeenIpAddress() {
        return lastSeenIpAddress;
    }

    public void setLastSeenIpAddress(IpAddressInfo lastSeenIpAddress) {
        this.lastSeenIpAddress = lastSeenIpAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(String firstSeen) {
        this.firstSeen = firstSeen;
    }

    public String getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(String lastSeen) {
        this.lastSeen = lastSeen;
    }

    public String getSeenCount() {
        return seenCount;
    }

    public void setSeenCount(String seenCount) {
        this.seenCount = seenCount;
    }

}
