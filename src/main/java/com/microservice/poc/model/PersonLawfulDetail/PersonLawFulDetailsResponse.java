package com.microservice.poc.model.PersonLawfulDetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import com.microservice.poc.model.Response.ResponseErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Person Lawful Detail Response.")
public class PersonLawFulDetailsResponse extends AbstractModel {


    @ApiModelProperty(example = "124", position = 11)
    private String uuid;
    @ApiModelProperty(example = "76", position = 1)
    private String eligibilityStatementCode;
    @ApiModelProperty(example = "22", position = 2)
    private String nonCitCoaCode;
    @ApiModelProperty(example = "Y", position = 3)
    private String fiveYearBarMet;
    @ApiModelProperty(example = "CITIZENSHIP", position = 4)
    private String qualifiedCitizenCode;
    @ApiModelProperty(example = "LAWFULPRESENCE", position = 5)
    private String lawfulPresenceCode;
    @ApiModelProperty(example = "UT", position = 6)
    private String caseNumber;
    @ApiModelProperty(example = "124646", position = 7)
    private String agencyAction;
    @ApiModelProperty(example = "2018-03-24", position = 8)
    private Date grantDate;

    @ApiModelProperty(example = "00", position = 9)
    private String responseCode;

    @ApiModelProperty(example = "NOT_VFD", position = 10)
    private String status;

    private List<ResponseErrors> responseErrors;
    private List<AdditionalLawfulDetail> additionalLawfulDetail;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEligibilityStatementCode() {
        return eligibilityStatementCode;
    }

    public void setEligibilityStatementCode(String eligibilityStatementCode) {
        this.eligibilityStatementCode = eligibilityStatementCode;
    }

    public String getNonCitCoaCode() {
        return nonCitCoaCode;
    }

    public void setNonCitCoaCode(String nonCitCoaCode) {
        this.nonCitCoaCode = nonCitCoaCode;
    }

    public String getFiveYearBarMet() {
        return fiveYearBarMet;
    }

    public void setFiveYearBarMet(String fiveYearBarMet) {
        this.fiveYearBarMet = fiveYearBarMet;
    }

    public String getQualifiedCitizenCode() {
        return qualifiedCitizenCode;
    }

    public void setQualifiedCitizenCode(String qualifiedCitizenCode) {
        this.qualifiedCitizenCode = qualifiedCitizenCode;
    }

    public String getLawfulPresenceCode() {
        return lawfulPresenceCode;
    }

    public void setLawfulPresenceCode(String lawfulPresenceCode) {
        this.lawfulPresenceCode = lawfulPresenceCode;
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

    public String getAgencyAction() {
        return agencyAction;
    }

    public void setAgencyAction(String agencyAction) {
        this.agencyAction = agencyAction;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public void setGrantDate(Date grantDate) {
        this.grantDate = grantDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ResponseErrors> getResponseErrors() {
        return responseErrors;
    }

    public void setResponseErrors(List<ResponseErrors> responseErrors) {
        this.responseErrors = responseErrors;
    }

    public List<AdditionalLawfulDetail> getAdditionalLawfulDetail() {
        return additionalLawfulDetail;
    }

    public void setAdditionalLawfulDetail(List<AdditionalLawfulDetail> additionalLawfulDetail) {
        this.additionalLawfulDetail = additionalLawfulDetail;
    }


}
