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
