package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Resubmit Request.")
public class ResubmitRequest extends AbstractModel {

    @ApiModelProperty(example = "454646464TU")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    @ApiModelProperty(position = 21)
    private String sevisId;
    @ApiModelProperty(example = "true", position = 5)
    private boolean fiveYearBarApplicabilityIndicator;
    @ApiModelProperty(example = "Verified okay", position = 7)
    private String requesterCommentsForHub; //TODO 1-100

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getSevisId() {
        return sevisId;
    }

    public void setSevisId(String sevisId) {
        this.sevisId = sevisId;
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
