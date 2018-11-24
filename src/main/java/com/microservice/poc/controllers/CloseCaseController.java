package com.microservice.poc.controllers;

import com.microservice.poc.model.FedLawfulPresence.CloseCaseRequest;
import com.microservice.poc.model.FedLawfulPresence.CloseCaseResponse;
import com.microservice.poc.services.CloseCaseService;
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
@RequestMapping(value = "/api/v1/closecase")
@Api(description = "Set of endpoints for Close Case of the Federal Lawful presence details  ")
public class CloseCaseController {

    @Autowired
    private CloseCaseService closeCaseService;

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation("${fedLawfulCloseCase.process}")
    public CloseCaseResponse
    resubmit(@ApiParam("Close case  for a new Federal Person Lawful Detail to be created.")
             @Valid @RequestBody CloseCaseRequest request) {
        return closeCaseService.process(request);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    @ApiOperation("${fedLawfulCloseCase..getall}")
    public List<CloseCaseResponse> getAllResubmision() {
        return closeCaseService.get();
    }

}
