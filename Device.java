package com.device.management.model;

public class Device {

    private final Long deviceId;

    private final String deviceName;

    private final Date lastRegisteredDate;

    private final Date lastDeRegisteredDate;

    private final boolean status;

    public Date getLastRegisteredDate() {
        return lastRegisteredDate;
    }

    public Date getLastDeRegisteredDate() {
        return lastDeRegisteredDate;
    }

    public boolean isStatus() {
        return status;
    }

    public Long getDeviceId() {

        return deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public Device(Long id, String name) {
        this.deviceName = name;
        this.deviceId = id;
    }




}