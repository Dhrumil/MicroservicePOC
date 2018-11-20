package com.microservice.poc.model.FedLawfulPresence;

//@JsonInclude(JsonInclude.Include.NON_NULL)

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Retrieve Step 2 Case Resolution Request.")
public class RetrieveStep2CaseResolutionRequest extends AbstractModel {

    @ApiModelProperty(example = "454646464TU")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }
}
