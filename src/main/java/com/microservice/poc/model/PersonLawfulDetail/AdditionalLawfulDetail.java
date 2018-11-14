package com.microservice.poc.model.PersonLawfulDetail;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;


//@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdditionalLawfulDetail extends AbstractModel {

    private String UUID;
    private String detailName;
    private String detailValue;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
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
