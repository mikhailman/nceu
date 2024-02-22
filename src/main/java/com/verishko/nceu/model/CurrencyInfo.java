package com.verishko.nceu.model;

public class CurrencyInfo {

    Integer curID;
    String curName;
    String dateFrom;
    String dateUntil;
    String curDateEnd;

    public CurrencyInfo(Integer curID, String curName, String dateFrom, String dateUntil, String curDateEnd) {
        this.curID = curID;
        this.curName = curName;
        this.dateFrom = dateFrom;
        this.dateUntil = dateUntil;
        this.curDateEnd = curDateEnd;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateUntil() {
        return dateUntil;
    }

    public void setDateUntil(String dateUntil) {
        this.dateUntil = dateUntil;
    }

    public Integer getCurID() {
        return curID;
    }

    public void setCurID(Integer curID) {
        this.curID = curID;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public String getCurDateEnd() {
        return curDateEnd;
    }

    public void setCurDateEnd(String curDateEnd) {
        this.curDateEnd = curDateEnd;
    }
}