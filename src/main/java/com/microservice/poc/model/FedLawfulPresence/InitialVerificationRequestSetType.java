package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;

import java.sql.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialVerificationRequestSetType extends AbstractModel {

    private DHSID dhsid;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private boolean fiveYearBarApplicabilityIndicator;
    private boolean requestGrantDateIndicator;
    private String RequesterCommentsForHub; //TODO 1-100
    private String casePOCFullName;
    private String casePOCPhoneNumber; //TODO [0-9]{10}
    private String casePOCPhoneNumberExtension;//TODO [0-9]{10}

    private String alienNumber;//TODO [0-9]{9}
    private Date docExpirationDate;
    private Date passportExpirationDate;
    private String receiptNumber;//TODO [a-zA-Z]{3}[0-9]{10}
    private String citizenshipNumber;//TODO [a-zA-Z0-9]{6,12}
    private String naturalizationNumber;//TODO [a-zA-Z0-9]{6,12}
    private String visaNumber;//TODO [a-zA-Z0-9]{8}
    private String countryOfIssuance;//TODO [a-zA-Z]{3}
    private String passportNumber;// TODO [a-zA-Z0-9]{6,12}
    private String passportCountry;
    private String i94Number;
    private String sevisId;
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
        return RequesterCommentsForHub;
    }

    public void setRequesterCommentsForHub(String requesterCommentsForHub) {
        RequesterCommentsForHub = requesterCommentsForHub;
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
