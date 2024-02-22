package com.verishko.nceu.model;

//import lombok.Getter;
//import lombok.Setter;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Setter
public class Currency {

    Integer curID;
    String curCode;
    String curName;
    String curAbbreviation;
    String curDateEnd;

    public Currency() {

    }

    public Currency(Integer curID, String curCode, String curName, String curAbbreviation, String curDateEnd) {
        this.curID = curID;
        this.curCode = curCode;
        this.curName = curName;
        this.curAbbreviation = curAbbreviation;
        this.curDateEnd = curDateEnd;
//        this.curDateEnd = (Integer.parseInt(curDateEnd.substring(0, 4)) < LocalDateTime.now().getYear() ? null : curDateEnd);
    }

    public Integer getCurID() {
        return curID;
    }

    public void setCurID(Integer curID) {
        this.curID = curID;
    }

    public String getCurCode() {
        return curCode;
    }

    public void setCurCode(String curCode) {
        this.curCode = curCode;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public String getCurAbbreviation() {
        return curAbbreviation;
    }

    public void setCurAbbreviation(String curAbbreviation) {
        this.curAbbreviation = curAbbreviation;
    }

    public String getCurDateEnd() {
        return curDateEnd;
    }

    public void setCurDateEnd(String curDateEnd) {
        this.curDateEnd = curDateEnd;
    }
//    @JsonProperty("Cur_ID")
//    private int currencyID;
//
//    @JsonProperty("Cur_OfficialRate")
//    private Double currencyOfficialRate;
//
//    @JsonProperty("Date")
//    private String currencyDate;
//
//    @JsonProperty("Cur_Abbreviation")
//    private String currencyAbbreviation;
//
//    @JsonProperty("Cur_Scale")
//    private Integer currencyScale;
//
//    @JsonProperty("Cur_Name")
//    private String currencyName;

}