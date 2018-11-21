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

        response.setCaseNumber("F573314109012NV");
        response.setResponseCode("HS000000");

        try {
            response.setAdmittedToDate(Utility.convertDate("11-Nov-2017"));
            response.setNonCitEntryDate(Utility.convertDate("11-Nov-2017"));
            response.setNonCitBirthDate(Utility.convertDate("24-Mar-1986"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        response.setAdmittedToText("Admit. Txt");
        response.setFiveYearBarApplyCode("Y");
        response.setuSCitizenCode("X");

        response.setNonCitMiddleName("A");
        response.setNonCitFirstName("Lemuel");
        response.setNonCitLastName("Merritt");


        response.setLawfulPresenceVerifiedCode("N");
        response.setNonCitCountryBirthCd("WA");
        response.setNonCitCountryCitCd("ENG");
        response.setuSCitizenCode("X");
        response.setEligStatementCd(5);
        response.setEligStatementTxt("Institute Additional Verification");
        response.setQualifiedNonCitizenCode("Y");
        response.setFiveYearBarApplyCode("Y");
        response.setFiveYearBarMetCode("Y");
        response.setNonCitCoaCode("PAL");
        response.setWebServSftwrVer("Sprint 7");
        response.setResponseDescriptionTxt("Success");
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
