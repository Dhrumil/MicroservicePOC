package com.microservice.poc.controllers;

import com.microservice.poc.model.Person;
import com.microservice.poc.services.PersonService;
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
@RequestMapping("/api/v1/persons")
@Api(description = "Set of endpoints for Creating, Retrieving, Updating and Deleting of Persons.")
public class PersonController {

    @Autowired
    private PersonService personService;

  @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${personcontroller.createperson}")
    public Person createPerson(@ApiParam("Person information for a new person to be created.")
                                 @Valid @RequestBody Person person) {
        return personService.createPerson(person);
    }

/*
    @RequestMapping(value = "/task", method = RequestMethod.POST)
    public Task createTask(@Valid @RequestBody Task task) {
        return task;
    }


    @ExceptionHandler
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ValidationError handleException(MethodArgumentNotValidException exception) {
        return createValidationError(exception);
    }

    private ValidationError createValidationError(MethodArgumentNotValidException exception) {
        return ValidationErrorBuilder.fromBindingErrors(exception.getBindingResult());
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${personcontroller.getallpersons}")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("${personcontroller.getpersonbyid}")
    public Person getPersonById(@ApiParam("Id of the person to be obtained. Cannot be empty.")
                                    @PathVariable int id) {
        return personService.getPersonById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    @ApiOperation("${personcontroller.deleteperson}")
    public void deletePerson(@ApiParam("Id of the person to be deleted. Cannot be empty.")
                                 @PathVariable int id) {
        personService.deletePerson(id);
    }


*/
}
