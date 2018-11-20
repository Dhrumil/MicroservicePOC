package com.microservice.poc.controllers;

import com.microservice.poc.model.FedLawfulPresence.ReverificationRequest;
import com.microservice.poc.model.FedLawfulPresence.ReverificationResponse;
import com.microservice.poc.services.FedLawfulPresence1AService;
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
@RequestMapping(value = "/api/v1/vlp1a")
@Api(description = "Set of endpoints for re verification the Federal Lawful presence details  ")
public class FedLawfulPresence1AController {

    @Autowired
    private FedLawfulPresence1AService fedLawfulPresence1AService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulPresence1a.process}")
    public ReverificationResponse
    createPerson(@ApiParam("Person information verification for a new Federal Person Lawful Detail to be created.")
                 @Valid @RequestBody ReverificationRequest request) {
        return fedLawfulPresence1AService.process(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${fedLawfulPresence1a..getall}")
    public List<ReverificationResponse> getAllVerification() {
        return fedLawfulPresence1AService.get();
    }


}
