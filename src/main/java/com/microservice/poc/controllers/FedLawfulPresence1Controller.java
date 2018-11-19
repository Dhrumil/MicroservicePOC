package com.microservice.poc.controllers;


import com.microservice.poc.model.FedLawfulPresence.InitialVerificationRequest;
import com.microservice.poc.model.FedLawfulPresence.InitialVerificationResponse;
import com.microservice.poc.services.FedLawfulPresence1Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/v1/vlp1")
@Api(description = "Set of endpoints to process,store and retrieve the Federal Lawful presence details  ")
public class FedLawfulPresence1Controller {

    @Autowired
    private FedLawfulPresence1Service fedLawfulPresence1Service;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulPresence1.create}")
    public InitialVerificationResponse
    createPerson(@ApiParam("Person information for a new Federal Person Lawful Detail to be created.")
                 @Valid @RequestBody InitialVerificationRequest request) {
        return fedLawfulPresence1Service.process(request);
    }


}
