package com.microservice.poc.controllers;

import com.microservice.poc.model.FedLawfulPresence.RetrieveStep2CaseResolutionRequest;
import com.microservice.poc.model.FedLawfulPresence.RetrieveStep2CaseResolutionResponse;
import com.microservice.poc.services.RetrieveStep2CaseResolutionService;
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
@RequestMapping(value = "/api/v1/retrievestep")
@Api(description = "Set of endpoints for Retrieve Step2 Case Resolution of the Federal Lawful presence details  ")
public class RetrieveStep2CaseResolutionController {

    @Autowired
    private RetrieveStep2CaseResolutionService retrieveStep2CaseResolutionService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulretrievestep.process}")
    public RetrieveStep2CaseResolutionResponse
    retrieve(@ApiParam("Retrieve Step2 Case Resolution  for a new Federal Person Lawful Detail to be created.")
             @Valid @RequestBody RetrieveStep2CaseResolutionRequest request) {
        return retrieveStep2CaseResolutionService.process(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulretrievestep..getall}")
    public List<RetrieveStep2CaseResolutionResponse> getAllRetrieve() {
        return retrieveStep2CaseResolutionService.get();
    }
}
