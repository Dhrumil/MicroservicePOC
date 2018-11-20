package com.microservice.poc.services;


import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.model.FedLawfulPresence.ResubmitRequest;
import com.microservice.poc.model.FedLawfulPresence.ResubmitResponse;
import com.microservice.poc.utility.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FedLawfulPresence1BService extends AbstractService<ResubmitRequest> {

    private static final Logger logger = LoggerFactory.getLogger(FedLawfulPresence1BService.class);
    static ResubmitResponse response;

    static {
        response = new ResubmitResponse();

        response.setCaseNumber("454646464TU");
        response.setResponseCode("00");

        try {
            response.setAdmittedToDate(Utility.convertDate("19-Nov-2018"));
            response.setNonCitEntryDate(Utility.convertDate("01-Nov-2018"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        response.setAdmittedToText("Admitted");
        response.setFiveYearBarApplyCode("Yes");
        response.setuSCitizenCode("Yes");

        response.setNonCitMiddleName("A");
        response.setNonCitFirstName("Smith");
        response.setNonCitLastName("Allen");

        response.setLawfulPresenceVerifiedCode("Y");
        response.setNonCitCountryBirthCd("01");
        response.setNonCitCountryCitCd("PA");
        response.setuSCitizenCode("12348A23");
        response.setEligStatementCd(37);


    }

    @Autowired
    public FedLawfulPresence1BService(@Qualifier("fedLawfulPresence1BDao") AbstractDao<ResubmitRequest> dao) {
        super(dao);
    }

    public ResubmitResponse process(ResubmitRequest request) {
        return response;
    }

    public List<ResubmitResponse> get() {

        List<ResubmitResponse> responses = new ArrayList<>();

        responses.add(response);
        return responses;
    }

}
