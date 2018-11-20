package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.model.FedLawfulPresence.InitiateAdditionalVerifRequest;
import com.microservice.poc.model.FedLawfulPresence.InitiateAdditionalVerifResponse;
import com.microservice.poc.model.Response.ResponseErrors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FedLawfulPresence2Service extends AbstractService<InitiateAdditionalVerifRequest> {

    private static final Logger logger = LoggerFactory.getLogger(FedLawfulPresence2Service.class);
    static InitiateAdditionalVerifResponse response;

    static {
        response = new InitiateAdditionalVerifResponse();
        List<ResponseErrors> responseErrors = new ArrayList<>();
        ResponseErrors error = new ResponseErrors();
        error.setName("N/A");
        error.setValue("N/A");
        responseErrors.add(error);

        response.setResponseCode("00");
        response.setResponseErrors(responseErrors);


    }

    @Autowired
    public FedLawfulPresence2Service(@Qualifier("fedLawfulPresence2Dao") AbstractDao<InitiateAdditionalVerifRequest> dao) {
        super(dao);
    }

    public InitiateAdditionalVerifResponse process(InitiateAdditionalVerifRequest request) {
        return response;
    }

    public List<InitiateAdditionalVerifResponse> get() {

        List<InitiateAdditionalVerifResponse> responses = new ArrayList<>();

        responses.add(response);
        return responses;
    }
}
