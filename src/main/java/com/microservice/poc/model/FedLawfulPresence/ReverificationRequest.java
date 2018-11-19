package com.microservice.poc.model.FedLawfulPresence;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReverificationRequest extends AbstractModel {

    private String caseNumber;
    private String receiptNumber;//TODO [a-zA-Z]{3}[0-9]{10}
    private String alienNumber;//TODO [0-9]{9}
    private String i94Number; //TODO [0-9]{11}
    private String sevisId;//TODO 0-9]{10}
    private String passportCountry;
    private String naturalizationNumber;
    private String citizenshipNumber;
    private String visaNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private boolean fiveYearBarApplicabilityIndicator;
    private String requesterCommentsForHub;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
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

    public String getSevisId() {
        return sevisId;
    }

    public void setSevisId(String sevisId) {
        this.sevisId = sevisId;
    }

    public String getPassportCountry() {
        return passportCountry;
    }

    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }

    public String getNaturalizationNumber() {
        return naturalizationNumber;
    }

    public void setNaturalizationNumber(String naturalizationNumber) {
        this.naturalizationNumber = naturalizationNumber;
    }

    public String getCitizenshipNumber() {
        return citizenshipNumber;
    }

    public void setCitizenshipNumber(String citizenshipNumber) {
        this.citizenshipNumber = citizenshipNumber;
    }

    public String getVisaNumber() {
        return visaNumber;
    }

    public void setVisaNumber(String visaNumber) {
        this.visaNumber = visaNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isFiveYearBarApplicabilityIndicator() {
        return fiveYearBarApplicabilityIndicator;
    }

    public void setFiveYearBarApplicabilityIndicator(boolean fiveYearBarApplicabilityIndicator) {
        this.fiveYearBarApplicabilityIndicator = fiveYearBarApplicabilityIndicator;
    }

    public String getRequesterCommentsForHub() {
        return requesterCommentsForHub;
    }

    public void setRequesterCommentsForHub(String requesterCommentsForHub) {
        this.requesterCommentsForHub = requesterCommentsForHub;
    }
}
