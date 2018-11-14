package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;

import java.sql.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class InitialVerificationIndividualResponseSetType extends AbstractModel {

    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    private String verificationStatus;
    private String nonCitCoaCode;//TODO  1..3
    private int eligStatementCd;
    private String iAVTypeCode;//TODO 1..25
    private String iAVTypeTxt;//TODO 1.100
    private Date grantDate;
    private String agencyAction;//TODO 1..250
    private String fiveYearBarApplyCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    private String qualifiedNonCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    private String fiveYearBarMetCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    private String uSCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    private String responseCode;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getVerificationStatus() {
        return verificationStatus;
    }

    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    public String getNonCitCoaCode() {
        return nonCitCoaCode;
    }

    public void setNonCitCoaCode(String nonCitCoaCode) {
        this.nonCitCoaCode = nonCitCoaCode;
    }

    public int getEligStatementCd() {
        return eligStatementCd;
    }

    public void setEligStatementCd(int eligStatementCd) {
        this.eligStatementCd = eligStatementCd;
    }

    public String getiAVTypeCode() {
        return iAVTypeCode;
    }

    public void setiAVTypeCode(String iAVTypeCode) {
        this.iAVTypeCode = iAVTypeCode;
    }

    public String getiAVTypeTxt() {
        return iAVTypeTxt;
    }

    public void setiAVTypeTxt(String iAVTypeTxt) {
        this.iAVTypeTxt = iAVTypeTxt;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getAgencyAction() {
        return agencyAction;
    }

    public void setAgencyAction(String agencyAction) {
        this.agencyAction = agencyAction;
    }

    public String getFiveYearBarApplyCode() {
        return fiveYearBarApplyCode;
    }

    public void setFiveYearBarApplyCode(String fiveYearBarApplyCode) {
        this.fiveYearBarApplyCode = fiveYearBarApplyCode;
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
}
