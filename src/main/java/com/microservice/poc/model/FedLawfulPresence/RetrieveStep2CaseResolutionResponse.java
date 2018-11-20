package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Retrieve Step2 Case Resolution Response.")
public class RetrieveStep2CaseResolutionResponse extends AbstractModel {

    @ApiModelProperty(example = "HS000000")
    private String responseCode;
    @ApiModelProperty(example = "F573314109012NV", position = 1)
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    @ApiModelProperty(example = "2018-09-09", position = 2)
    private Date grantDate;

    @ApiModelProperty(example = "", position = 3)
    private String agencyAction;//TODO 1..250
    @ApiModelProperty(example = "Y", position = 4)
    private String fiveYearBarApplyCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Y", position = 5)
    private String qualifiedNonCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Y", position = 6)
    private String fiveYearBarMetCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "X", position = 7)
    private String usCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    //private String arrayOfSponsorshipData;//TODO is this a list
    @ApiModelProperty(example = "Sprint 7", position = 8)
    private String webServSftwrVer;


    @ApiModelProperty(example = "", position = 9)
    private String userField;
    @ApiModelProperty(example = "2018-01-20", position = 10)
    private Date responseDate;
    @ApiModelProperty(example = "", position = 11)
    private String versionId;


    @ApiModelProperty(example = "", position = 12)
    private String majorCd;
    @ApiModelProperty(example = "", position = 13)
    private String majorStatement;

    // @ApiModelProperty(example = "", position = 15)
    // private String sponsoredIndicator;

    @ApiModelProperty(example = "N", position = 14)
    private String lawfulPresenceVerifiedCode;

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

    public String getUsCitizenCode() {
        return usCitizenCode;
    }

    public void setUsCitizenCode(String usCitizenCode) {
        this.usCitizenCode = usCitizenCode;
    }

    public String getWebServSftwrVer() {
        return webServSftwrVer;
    }

    public void setWebServSftwrVer(String webServSftwrVer) {
        this.webServSftwrVer = webServSftwrVer;
    }

    public String getUserField() {
        return userField;
    }

    public void setUserField(String userField) {
        this.userField = userField;
    }

    public Date getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Date responseDate) {
        this.responseDate = responseDate;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getMajorCd() {
        return majorCd;
    }

    public void setMajorCd(String majorCd) {
        this.majorCd = majorCd;
    }

    public String getMajorStatement() {
        return majorStatement;
    }

    public void setMajorStatement(String majorStatement) {
        this.majorStatement = majorStatement;
    }

    public String getLawfulPresenceVerifiedCode() {
        return lawfulPresenceVerifiedCode;
    }

    public void setLawfulPresenceVerifiedCode(String lawfulPresenceVerifiedCode) {
        this.lawfulPresenceVerifiedCode = lawfulPresenceVerifiedCode;
    }
}
