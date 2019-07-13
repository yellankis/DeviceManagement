package com.problem.shaheed.dao;

import java.util.Date;

public class Device {

    private final Long deviceId;

    private final String deviceName;

    private  Date lastRegisteredDate;

    private  Date lastDeRegisteredDate;

    private  boolean status;

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
