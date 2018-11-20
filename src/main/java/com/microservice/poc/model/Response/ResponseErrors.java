package com.microservice.poc.model.Response;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class representing a Error Values.")
public class ResponseErrors {
    @ApiModelProperty(example = "N/A")
    private String name;
    @ApiModelProperty(example = "N/A", position = 1)
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
