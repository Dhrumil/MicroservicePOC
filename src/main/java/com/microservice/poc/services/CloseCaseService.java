package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.model.FedLawfulPresence.CloseCaseRequest;
import com.microservice.poc.model.FedLawfulPresence.CloseCaseResponse;
import com.microservice.poc.model.Response.ResponseErrors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CloseCaseService extends AbstractService<CloseCaseRequest> {

    private static final Logger logger = LoggerFactory.getLogger(CloseCaseService.class);
    static CloseCaseResponse response;

    static {
        response = new CloseCaseResponse();
        List<ResponseErrors> responseErrors = new ArrayList<>();
        ResponseErrors error = new ResponseErrors();
        error.setName("N/A");
        error.setValue("N/A");
        responseErrors.add(error);

        response.setResponseCode("00");
        response.setResponseErrors(responseErrors);


    }

    @Autowired
    public CloseCaseService(@Qualifier("closeCaseDao") AbstractDao<CloseCaseRequest> dao) {
        super(dao);
    }

    public CloseCaseResponse process(CloseCaseRequest request) {
        return response;
    }

    public List<CloseCaseResponse> get() {

        List<CloseCaseResponse> responses = new ArrayList<>();

        responses.add(response);
        return responses;
    }
}
