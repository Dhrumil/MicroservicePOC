package com.microservice.poc.model.FedLawfulPresence;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Initial Additional Verification Request.")
public class InitiateAdditionalVerifRequest extends AbstractModel {

    @ApiModelProperty(example = "Smith Mike")
    private String casePOCFullName;
    @ApiModelProperty(example = "7172768756", position = 1)
    private String casePOCPhoneNumber; //TODO [0-9]{10}
    @ApiModelProperty(example = "765443434", position = 2)
    private String casePOCPhoneNumberExtension;//TODO [0-9]{10}
    @ApiModelProperty(example = "000000773", position = 3)
    private String alienNumber;//TODO [0-9]{9}

    @ApiModelProperty(example = "69000888062", position = 4)
    private String i94Number;

    @ApiModelProperty(example = "A5869494", position = 5)
    private String passportNumber;// TODO [a-zA-Z0-9]{6,12}

    @ApiModelProperty(example = "AZR123764545", position = 6)
    private String receiptNumber;//TODO [a-zA-Z]{3}[0-9]{10}
    @ApiModelProperty(example = "USA", position = 7)
    private String passportCountry;

    @ApiModelProperty(example = "USA", position = 8)
    private String countryOfIssuance;//TODO [a-zA-Z]{3}

    @ApiModelProperty(example = "false", position = 9)
    private boolean requestGrantDateIndicator;

    @ApiModelProperty(example = "false", position = 10)
    private boolean requestSponsorDataIndicator;

    @ApiModelProperty(example = "Very food", position = 11)
    private String comments;

    @ApiModelProperty(example = "okay", position = 12)
    private String aka;

    public String getCasePOCFullName() {
        return casePOCFullName;
    }

    public void setCasePOCFullName(String casePOCFullName) {
        this.casePOCFullName = casePOCFullName;
    }

    public String getCasePOCPhoneNumber() {
        return casePOCPhoneNumber;
    }

    public void setCasePOCPhoneNumber(String casePOCPhoneNumber) {
        this.casePOCPhoneNumber = casePOCPhoneNumber;
    }

    public String getCasePOCPhoneNumberExtension() {
        return casePOCPhoneNumberExtension;
    }

    public void setCasePOCPhoneNumberExtension(String casePOCPhoneNumberExtension) {
        this.casePOCPhoneNumberExtension = casePOCPhoneNumberExtension;
    }

    public String getAlienNumber() {
        return alienNumber;
    }

    public void setAlienNumber(String alienNumber) {
        this.alienNumber = alienNumber;
    }

    public String getI94Number() {
        return i94Number;
    }

    public void setI94Number(String i94Number) {
        this.i94Number = i94Number;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getPassportCountry() {
        return passportCountry;
    }

    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }

    public String getCountryOfIssuance() {
        return countryOfIssuance;
    }

    public void setCountryOfIssuance(String countryOfIssuance) {
        this.countryOfIssuance = countryOfIssuance;
    }

    public boolean isRequestGrantDateIndicator() {
        return requestGrantDateIndicator;
    }

    public void setRequestGrantDateIndicator(boolean requestGrantDateIndicator) {
        this.requestGrantDateIndicator = requestGrantDateIndicator;
    }

    public boolean isRequestSponsorDataIndicator() {
        return requestSponsorDataIndicator;
    }

    public void setRequestSponsorDataIndicator(boolean requestSponsorDataIndicator) {
        this.requestSponsorDataIndicator = requestSponsorDataIndicator;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAka() {
        return aka;
    }

    public void setAka(String aka) {
        this.aka = aka;
    }
}
