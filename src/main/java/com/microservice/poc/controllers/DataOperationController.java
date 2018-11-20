package com.microservice.poc.controllers;

import com.microservice.poc.model.PersonLawfulDetail.PersonLawFulDetailsResponse;
import com.microservice.poc.model.PersonLawfulDetail.PersonLawfulDetail;
import com.microservice.poc.services.DataOperationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/dataoperation")
@Api(description = "Set of endpoints to Store and Retrieve the Lawful presence details  ")
public class DataOperationController {

    @Autowired
    private DataOperationService dataOperationService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${vLPDbProcessController.getall}")
    public List<PersonLawFulDetailsResponse> getAllPersonLawfulDetail() {
        return dataOperationService.findAlls();

    }

    /*
        @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
        @ApiOperation("${vLPDbProcessController.getbyid}")
        public PersonLawfulDetail getPersonById(@ApiParam("Id of the person's Person Lawful Detail to be obtained. Cannot be empty.")
                                                @PathVariable Long id) {
            return dataOperationService.find(id);
        }

        @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
        @ApiOperation("${vLPDbProcessController.delete}")
        public void deletePersonLawfulDetail(@ApiParam("Id of the person's Person Lawful Detail to be deleted. Cannot be empty.")
                                             @PathVariable Long id) {
            dataOperationService.delete(id);
        }
    */
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${vLPDbProcessController.create}")
    public PersonLawFulDetailsResponse createPerson(@ApiParam("Person information for a new Person Lawful Detail to be created.")
                                           @RequestBody PersonLawfulDetail personLawfulDetail) {
        //PersonLawFulDetailsResponse response =new PersonLawFulDetailsResponse();
        //dataOperationService.create(personLawfulDetail);
        return dataOperationService.getResponse(personLawfulDetail);
        //return null;
    }


}
