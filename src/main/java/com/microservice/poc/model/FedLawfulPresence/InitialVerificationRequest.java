package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Initial Verification Request.")
public class InitialVerificationRequest extends AbstractModel {

    @ApiModelProperty(example = "I327DOCUMENTID")
    private DHSID dhsid;
    @ApiModelProperty(example = "Lemuel", position = 1)
    private String firstName;
    @ApiModelProperty(example = "A", position = 2)
    private String middleName;
    @ApiModelProperty(example = "Merritt", position = 3)
    private String lastName;
    @ApiModelProperty(example = "1986-03-24", position = 4)
    private Date dateOfBirth;
    @ApiModelProperty(example = "true", position = 5)
    private boolean fiveYearBarApplicabilityIndicator;
    @ApiModelProperty(example = "false", position = 6)
    private boolean requestGrantDateIndicator;
    @ApiModelProperty(example = "Verified okay", position = 7)
    private String requesterCommentsForHub; //TODO 1-100
    @ApiModelProperty(example = "Lemuel Merritt", position = 7)
    private String casePOCFullName;
    @ApiModelProperty(example = "7172768756", position = 8)
    private String casePOCPhoneNumber; //TODO [0-9]{10}
    @ApiModelProperty(example = "765443434", position = 9)
    private String casePOCPhoneNumberExtension;//TODO [0-9]{10}
    @ApiModelProperty(example = "000000773", position = 10)
    private String alienNumber;//TODO [0-9]{9}
    @ApiModelProperty(example = "2020-11-12", position = 11)
    private Date docExpirationDate;
    @ApiModelProperty(example = "2026-09-09", position = 12)
    private Date passportExpirationDate;
    @ApiModelProperty(example = "AZR123764545", position = 13)
    private String receiptNumber;//TODO [a-zA-Z]{3}[0-9]{10}
    @ApiModelProperty(example = "PA9876432", position = 14)
    private String citizenshipNumber;//TODO [a-zA-Z0-9]{6,12}
    @ApiModelProperty(example = "9876432", position = 15)
    private String naturalizationNumber;//TODO [a-zA-Z0-9]{6,12}
    @ApiModelProperty(example = "00074715", position = 16)
    private String visaNumber;//TODO [a-zA-Z0-9]{8}
    @ApiModelProperty(example = "PLW", position = 17)
    private String countryOfIssuance;//TODO [a-zA-Z]{3}
    @ApiModelProperty(example = "B75855686647", position = 18)
    private String passportNumber;// TODO [a-zA-Z0-9]{6,12}
    @ApiModelProperty(example = "USA", position = 19)
    private String passportCountry;
    @ApiModelProperty(example = "69000888062", position = 20)
    private String i94Number;
    @ApiModelProperty(position = 21, example = "2780020089")
    private String sevisId;
    @ApiModelProperty(example = "3478", position = 22)
    private String docDescReq;//TODO 1..15

    public String getAlienNumber() {
        return alienNumber;
    }

    public void setAlienNumber(String alienNumber) {
        this.alienNumber = alienNumber;
    }

    public Date getDocExpirationDate() {
        return docExpirationDate;
    }

    public void setDocExpirationDate(Date docExpirationDate) {
        this.docExpirationDate = docExpirationDate;
    }

    public Date getPassportExpirationDate() {
        return passportExpirationDate;
    }

    public void setPassportExpirationDate(Date passportExpirationDate) {
        this.passportExpirationDate = passportExpirationDate;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getNaturalizationNumber() {
        return naturalizationNumber;
    }

    public void setNaturalizationNumber(String naturalizationNumber) {
        this.naturalizationNumber = naturalizationNumber;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public String getCountryOfIssuance() {
        return countryOfIssuance;
    }

    public void setCountryOfIssuance(String countryOfIssuance) {
        this.countryOfIssuance = countryOfIssuance;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportCountry() {
        return passportCountry;
    }

    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }

    public String getI94Number() {
        return i94Number;
    }

    public void setI94Number(String i94Number) {
        this.i94Number = i94Number;
    }

    public String getSevisId() {
        return sevisId;
    }

    public void setSevisId(String sevisId) {
        this.sevisId = sevisId;
    }

    public String getDocDescReq() {
        return docDescReq;
    }

    public void setDocDescReq(String docDescReq) {
        this.docDescReq = docDescReq;
    }

    public DHSID getDhsid() {
        return dhsid;
    }

    public void setDhsid(DHSID dhsid) {
        this.dhsid = dhsid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isFiveYearBarApplicabilityIndicator() {
        return fiveYearBarApplicabilityIndicator;
    }

    public void setFiveYearBarApplicabilityIndicator(boolean fiveYearBarApplicabilityIndicator) {
        this.fiveYearBarApplicabilityIndicator = fiveYearBarApplicabilityIndicator;
    }

    public boolean isRequestGrantDateIndicator() {
        return requestGrantDateIndicator;
    }

    public void setRequestGrantDateIndicator(boolean requestGrantDateIndicator) {
        this.requestGrantDateIndicator = requestGrantDateIndicator;
    }

    public String getRequesterCommentsForHub() {
        return requesterCommentsForHub;
    }

    public void setRequesterCommentsForHub(String requesterCommentsForHub) {
        this.requesterCommentsForHub = requesterCommentsForHub;
    }

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
}
