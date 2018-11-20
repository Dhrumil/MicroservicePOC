package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import com.microservice.poc.model.Response.ResponseErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Close Case Response.")
public class CloseCaseResponse extends AbstractModel {

    @ApiModelProperty(example = "00")
    private String responseCode;

    private List<ResponseErrors> responseErrors;

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public List<ResponseErrors> getResponseErrors() {
        return responseErrors;
    }

    public void setResponseErrors(List<ResponseErrors> responseErrors) {
        this.responseErrors = responseErrors;
    }

}
