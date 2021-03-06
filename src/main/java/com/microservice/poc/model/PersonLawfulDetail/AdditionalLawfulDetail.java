package com.microservice.poc.model.PersonLawfulDetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Additional Lawful Person Detail.")
public class AdditionalLawfulDetail extends AbstractModel {

    @ApiModelProperty(example = "124", position = 3)
    private String uuid;
    @ApiModelProperty(example = "AttestedFirstName", position = 1)
    private String detailName;
    @ApiModelProperty(example = "Lemuel", position = 2)
    private String detailValue;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDetailName() {
        return detailName;
    }

    public void setDetailName(String detailName) {
        this.detailName = detailName;
    }

    public String getDetailValue() {
        return detailValue;
    }

    public void setDetailValue(String detailValue) {
        this.detailValue = detailValue;
    }


}
