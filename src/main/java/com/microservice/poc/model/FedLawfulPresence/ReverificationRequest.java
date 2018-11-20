package com.microservice.poc.model.FedLawfulPresence;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Re verification Request.")
public class ReverificationRequest extends AbstractModel {

    @ApiModelProperty(example = "F573314109012NV")
    private String caseNumber;
    @ApiModelProperty(example = "AZR123764545", position = 1)
    private String receiptNumber;//TODO [a-zA-Z]{3}[0-9]{10}
    @ApiModelProperty(example = "000000773", position = 2)
    private String alienNumber;//TODO [0-9]{9}
    @ApiModelProperty(example = "69000888062", position = 3)
    private String i94Number; //TODO [0-9]{11}
    @ApiModelProperty(position = 4, example = "2780020089")
    private String sevisId;//TODO 0-9]{10}
    @ApiModelProperty(example = "PLW", position = 5)
    private String passportCountry;
    @ApiModelProperty(example = "9876432", position = 6)
    private String naturalizationNumber;
    @ApiModelProperty(example = "PA9876432", position = 7)
    private String citizenshipNumber;
    @ApiModelProperty(example = "00074715", position = 8)
    private String visaNumber;

    @ApiModelProperty(example = "Lemuel", position = 9)
    private String firstName;
    @ApiModelProperty(example = "A", position = 10)
    private String middleName;
    @ApiModelProperty(example = "Merritt", position = 11)
    private String lastName;
    @ApiModelProperty(example = "1986-03-24", position = 12)
    private Date dateOfBirth;
    @ApiModelProperty(example = "true", position = 13)
    private boolean fiveYearBarApplicabilityIndicator;

    @ApiModelProperty(example = "", position = 14)
    private String requesterCommentsForHub; //TODO 1-100

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

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
