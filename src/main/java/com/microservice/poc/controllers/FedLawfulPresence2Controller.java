package com.microservice.poc.controllers;


import com.microservice.poc.model.FedLawfulPresence.InitiateAdditionalVerifRequest;
import com.microservice.poc.model.FedLawfulPresence.InitiateAdditionalVerifResponse;
import com.microservice.poc.services.FedLawfulPresence2Service;
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
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/vlp2")
@Api(description = "Set of endpoints for Initial Additional Verification of the Federal Lawful presence details  ")
public class FedLawfulPresence2Controller {

    @Autowired
    private FedLawfulPresence2Service fedLawfulPresence2Service;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulPresence2.process}")
    public InitiateAdditionalVerifResponse
    resubmit(@ApiParam("nitiate Additional Verification  for a new Federal Person Lawful Detail to be created.")
             @Valid @RequestBody InitiateAdditionalVerifRequest request) {
        return fedLawfulPresence2Service.process(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulPresence2..getall}")
    public List<InitiateAdditionalVerifResponse> getAllResubmision() {
        return fedLawfulPresence2Service.get();
    }

}
