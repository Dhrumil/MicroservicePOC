package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Resubmit Response.")
public class ResubmitResponse extends AbstractModel {

    @ApiModelProperty(example = "454646464TU")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}

    private String nonCitLastName;
    private String nonCitFirstName;
    private String nonCitMiddleName;

    private Date nonCitBirthDate;
    private Date nonCitEntryDate;

    private Date admittedToDate;
    private String admittedToText;

    private String nonCitCountryBirthCd;
    private String nonCitCountryCitCd;


    private String nonCitCoaCode;
    private String nonCitProvOfLaw;

    private int eligStatementCd;
    private String eligStatementTxt;

    private String webServSftwrVer;
    private String fiveYearBarApplyCode;

    private String lawfulPresenceVerifiedCode;
    private String agencyAction;


    private String qualifiedNonCitizenCode;
    private String fiveYearBarMetCode;
    private String uSCitizenCode;
    private String responseCode;

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getNonCitLastName() {
        return nonCitLastName;
    }

    public void setNonCitLastName(String nonCitLastName) {
        this.nonCitLastName = nonCitLastName;
    }

    public String getNonCitFirstName() {
        return nonCitFirstName;
    }

    public void setNonCitFirstName(String nonCitFirstName) {
        this.nonCitFirstName = nonCitFirstName;
    }

    public String getNonCitMiddleName() {
        return nonCitMiddleName;
    }

    public void setNonCitMiddleName(String nonCitMiddleName) {
        this.nonCitMiddleName = nonCitMiddleName;
    }

    public Date getNonCitBirthDate() {
        return nonCitBirthDate;
    }

    public void setNonCitBirthDate(Date nonCitBirthDate) {
        this.nonCitBirthDate = nonCitBirthDate;
    }

    public Date getNonCitEntryDate() {
        return nonCitEntryDate;
    }

    public void setNonCitEntryDate(Date nonCitEntryDate) {
        this.nonCitEntryDate = nonCitEntryDate;
    }

    public Date getAdmittedToDate() {
        return admittedToDate;
    }

    public void setAdmittedToDate(Date admittedToDate) {
        this.admittedToDate = admittedToDate;
    }

    public String getAdmittedToText() {
        return admittedToText;
    }

    public void setAdmittedToText(String admittedToText) {
        this.admittedToText = admittedToText;
    }

    public String getNonCitCountryBirthCd() {
        return nonCitCountryBirthCd;
    }

    public void setNonCitCountryBirthCd(String nonCitCountryBirthCd) {
        this.nonCitCountryBirthCd = nonCitCountryBirthCd;
    }

    public String getNonCitCountryCitCd() {
        return nonCitCountryCitCd;
    }

    public void setNonCitCountryCitCd(String nonCitCountryCitCd) {
        this.nonCitCountryCitCd = nonCitCountryCitCd;
    }

    public String getNonCitCoaCode() {
        return nonCitCoaCode;
    }

    public void setNonCitCoaCode(String nonCitCoaCode) {
        this.nonCitCoaCode = nonCitCoaCode;
    }

    public String getNonCitProvOfLaw() {
        return nonCitProvOfLaw;
    }

    public void setNonCitProvOfLaw(String nonCitProvOfLaw) {
        this.nonCitProvOfLaw = nonCitProvOfLaw;
    }

    public int getEligStatementCd() {
        return eligStatementCd;
    }

    public void setEligStatementCd(int eligStatementCd) {
        this.eligStatementCd = eligStatementCd;
    }

    public String getEligStatementTxt() {
        return eligStatementTxt;
    }

    public void setEligStatementTxt(String eligStatementTxt) {
        this.eligStatementTxt = eligStatementTxt;
    }

    public String getWebServSftwrVer() {
        return webServSftwrVer;
    }

    public void setWebServSftwrVer(String webServSftwrVer) {
        this.webServSftwrVer = webServSftwrVer;
    }

    public String getFiveYearBarApplyCode() {
        return fiveYearBarApplyCode;
    }

    public void setFiveYearBarApplyCode(String fiveYearBarApplyCode) {
        this.fiveYearBarApplyCode = fiveYearBarApplyCode;
    }

    public String getLawfulPresenceVerifiedCode() {
        return lawfulPresenceVerifiedCode;
    }

    public void setLawfulPresenceVerifiedCode(String lawfulPresenceVerifiedCode) {
        this.lawfulPresenceVerifiedCode = lawfulPresenceVerifiedCode;
    }

    public String getAgencyAction() {
        return agencyAction;
    }

    public void setAgencyAction(String agencyAction) {
        this.agencyAction = agencyAction;
    }

    public String getQualifiedNonCitizenCode() {
        return qualifiedNonCitizenCode;
    }

    public void setQualifiedNonCitizenCode(String qualifiedNonCitizenCode) {
        this.qualifiedNonCitizenCode = qualifiedNonCitizenCode;
    }

    public String getFiveYearBarMetCode() {
        return fiveYearBarMetCode;
    }

    public void setFiveYearBarMetCode(String fiveYearBarMetCode) {
        this.fiveYearBarMetCode = fiveYearBarMetCode;
    }

    public String getuSCitizenCode() {
        return uSCitizenCode;
    }

    public void setuSCitizenCode(String uSCitizenCode) {
        this.uSCitizenCode = uSCitizenCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
}
