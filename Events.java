package com.problem.shaheed.dao;

import java.util.Date;

public class Events {

    String deviceid;
    Date regDate;
    Date deRegdate;

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public Date getDeRegdate() {
        return deRegdate;
    }

    public void setDeRegdate(Date deRegdate) {
        this.deRegdate = deRegdate;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }
}



