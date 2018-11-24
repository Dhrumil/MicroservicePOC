package com.microservice.poc.controllers;

import com.microservice.poc.model.PersonLawfulDetail.PersonLawFulDetailsResponse;
import com.microservice.poc.model.PersonLawfulDetail.PersonLawfulDetail;
import com.microservice.poc.services.DataOperationService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/lawfulpresencedetail")
@Api(description = "Set of endpoints to Store and Retrieve the Lawful presence details  ")
public class DataStoreRetrieveController {

    @Autowired
    private DataOperationService dataOperationService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${vLPDbProcessController.getall}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved lists"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public List<PersonLawFulDetailsResponse> getAllPersonLawfulDetail() {
        return dataOperationService.findAlls();

    }


    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${vLPDbProcessController.getbyid}")
    public PersonLawFulDetailsResponse getPersonById(@ApiParam("Id of the person's Person Lawful Detail to be obtained. Cannot be empty.")
                                                     @PathVariable Long id) {
        return dataOperationService.findById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    @ApiOperation("${vLPDbProcessController.delete}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully deleted record"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public void deletePersonLawfulDetail(@ApiParam("Id of the person's Person Lawful Detail to be deleted. Cannot be empty.")
                                         @PathVariable Long id) {
        dataOperationService.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{id}")
    @ApiOperation("${vLPDbProcessController.update}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully updated record"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public void updatePersonLawfulDetail(@ApiParam("Id of the person's Person Lawful Detail to be update. Cannot be empty.")
                                         @PathVariable Long id) {
        dataOperationService.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${vLPDbProcessController.create}")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully created record"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })
    public PersonLawFulDetailsResponse createPerson(@ApiParam("Person information for a new Person Lawful Detail to be created.")
                                                    @RequestBody PersonLawfulDetail personLawfulDetail) {
        //PersonLawFulDetailsResponse response =new PersonLawFulDetailsResponse();
        //dataOperationService.create(personLawfulDetail);
        return dataOperationService.getResponse(personLawfulDetail);
        //return null;
    }


}
