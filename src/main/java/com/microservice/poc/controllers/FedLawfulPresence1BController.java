package com.microservice.poc.controllers;


import com.microservice.poc.model.FedLawfulPresence.ResubmitRequest;
import com.microservice.poc.model.FedLawfulPresence.ResubmitResponse;
import com.microservice.poc.services.FedLawfulPresence1BService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/vlp1b")
@Api(description = "Set of endpoints for Resubmission of the Federal Lawful presence details  ")
public class FedLawfulPresence1BController {

    @Autowired
    private FedLawfulPresence1BService fedLawfulPresence1BService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation("${fedLawfulPresence1b.process}")
    public ResubmitResponse
    resubmit(@ApiParam("Person information Resubmission for a new Federal Person Lawful Detail to be created.")
             @Valid @RequestBody ResubmitRequest request) {
        return fedLawfulPresence1BService.process(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation("${fedLawfulPresence1b..getall}")
    public List<ResubmitResponse> getAllResubmision() {
        return fedLawfulPresence1BService.get();
    }


}
