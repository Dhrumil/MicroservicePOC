package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Initial Verification Response.")
public class InitialVerificationResponse extends AbstractModel {

    @ApiModelProperty(example = "454646464TU")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    @ApiModelProperty(example = "NOT_VFD", position = 1)
    private String verificationStatus;
    @ApiModelProperty(example = "Smith", position = 2)
    private String nonCitCoaCode;//TODO  1..3
    @ApiModelProperty(example = "Smith", position = 3)
    private int eligStatementCd;
    @ApiModelProperty(example = "Smith", position = 4)
    private String iAVTypeCode;//TODO 1..25
    @ApiModelProperty(example = "Smith", position = 5)
    private String iAVTypeTxt;//TODO 1.100
    @ApiModelProperty(example = "2018-09-09", position = 6)
    private Date grantDate;
    @ApiModelProperty(example = "Smith", position = 7)
    private String agencyAction;//TODO 1..250
    @ApiModelProperty(example = "Smith", position = 8)
    private String fiveYearBarApplyCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Smith", position = 9)
    private String qualifiedNonCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Smith", position = 10)
    private String fiveYearBarMetCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "PA9876432", position = 11)
    private String usCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "00", position = 12)
    private String responseCode;

    public String getUsCitizenCode() {
        return usCitizenCode;
    }

    public void setUsCitizenCode(String usCitizenCode) {
        this.usCitizenCode = usCitizenCode;
    }


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


}
