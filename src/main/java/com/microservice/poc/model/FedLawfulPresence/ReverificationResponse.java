package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Re verification Response.")
public class ReverificationResponse extends AbstractModel {

    @ApiModelProperty(example = "F573314109012NV")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    @ApiModelProperty(example = "Merritt", position = 1)
    private String nonCitLastName;
    @ApiModelProperty(example = "Lemuel", position = 2)
    private String nonCitFirstName;
    @ApiModelProperty(example = "", position = 3)
    private String nonCitMiddleName;
    @ApiModelProperty(example = "1986-03-24", position = 4)
    private Date nonCitBirthDate;
    @ApiModelProperty(example = "2017-03-24", position = 5)
    private Date nonCitEntryDate;

    @ApiModelProperty(example = "2017-11-11", position = 6)
    private Date admittedToDate;
    @ApiModelProperty(example = "Admit. Txt", position = 7)
    private String admittedToText;

    @ApiModelProperty(example = "WA", position = 8)
    private String nonCitCountryBirthCd;
    @ApiModelProperty(example = "ENG", position = 9)
    private String nonCitCountryCitCd;

    @ApiModelProperty(example = "PAL", position = 10)
    private String nonCitCoaCode;
    @ApiModelProperty(example = "", position = 11)
    private String nonCitProvOfLaw;
    @ApiModelProperty(example = "5", position = 12)
    private int eligStatementCd;
    @ApiModelProperty(example = "Institute Additional Verification", position = 13)
    private String eligStatementTxt;
    @ApiModelProperty(example = "Sprint 7", position = 20)
    private String webServSftwrVer;
    @ApiModelProperty(example = "Y", position = 14)
    private String fiveYearBarApplyCode;

    @ApiModelProperty(example = "N", position = 16)
    private String lawfulPresenceVerifiedCode;

    @ApiModelProperty(example = "", position = 27)
    private String agencyAction;

    @ApiModelProperty(example = "Y", position = 17)
    private String qualifiedNonCitizenCode;

    @ApiModelProperty(example = "Y", position = 15)
    private String fiveYearBarMetCode;

    @ApiModelProperty(example = "X", position = 18)
    private String uSCitizenCode;
    @ApiModelProperty(example = "HS000000", position = 19)
    private String responseCode;
    @ApiModelProperty(example = "Success", position = 21)
    private String responseDescriptionTxt;

    @ApiModelProperty(example = "2020-01-20", position = 22)
    private Date nonCitEadsExpireDate;
    @ApiModelProperty(example = "GrantDateReasonCd0", position = 23)
    private String grantDateReasonCd;
    @ApiModelProperty(example = "false", position = 24)
    private boolean sponsorDataFoundIndicator;
    // private String arrayOfSponsorshipData;//TODO is this a list
    @ApiModelProperty(example = "SponsorshipReasonCd0", position = 25)
    private String sponsorshipReasonCd;
    @ApiModelProperty(example = "2018-11-11", position = 26)
    private Date grantDate;


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

    public Date getNonCitEadsExpireDate() {
        return nonCitEadsExpireDate;
    }

    public void setNonCitEadsExpireDate(Date nonCitEadsExpireDate) {
        this.nonCitEadsExpireDate = nonCitEadsExpireDate;
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

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getGrantDateReasonCd() {
        return grantDateReasonCd;
    }

    public void setGrantDateReasonCd(String grantDateReasonCd) {
        this.grantDateReasonCd = grantDateReasonCd;
    }

    public boolean isSponsorDataFoundIndicator() {
        return sponsorDataFoundIndicator;
    }

    public void setSponsorDataFoundIndicator(boolean sponsorDataFoundIndicator) {
        this.sponsorDataFoundIndicator = sponsorDataFoundIndicator;
    }


    public String getSponsorshipReasonCd() {
        return sponsorshipReasonCd;
    }

    public void setSponsorshipReasonCd(String sponsorshipReasonCd) {
        this.sponsorshipReasonCd = sponsorshipReasonCd;
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

    public String getResponseDescriptionTxt() {
        return responseDescriptionTxt;
    }

    public void setResponseDescriptionTxt(String responseDescriptionTxt) {
        this.responseDescriptionTxt = responseDescriptionTxt;
    }
}
