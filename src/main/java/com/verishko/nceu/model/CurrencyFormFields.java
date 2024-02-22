package com.verishko.nceu.model;

public class CurrencyFormFields {
    private Integer currencyID;
    private String selectedCurrencyCode;
    private String dateFrom;
    private String dateUntil;
    private String curDateEnd;

    public String getSelectedCurrencyCode() {
        return selectedCurrencyCode;
    }

    public void setSelectedCurrencyCode(String selectedCurrencyCode) {
        this.selectedCurrencyCode = selectedCurrencyCode;
    }

    public Integer getCurrencyID() {
        return currencyID;
    }

    public void setCurrencyID(Integer currencyID) {
        this.currencyID = currencyID;
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

    public String getCurDateEnd() {
        return curDateEnd;
    }

    public void setCurDateEnd(String curDateEnd) {
        this.curDateEnd = curDateEnd;
    }

}