package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.model.FedLawfulPresence.RetrieveStep2CaseResolutionRequest;
import com.microservice.poc.model.FedLawfulPresence.RetrieveStep2CaseResolutionResponse;
import com.microservice.poc.utility.LoggerUtil;
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
public class RetrieveStep2CaseResolutionService extends AbstractService<RetrieveStep2CaseResolutionRequest> {

    private static final Logger logger = LoggerFactory.getLogger(CloseCaseService.class);
    static RetrieveStep2CaseResolutionResponse response;

    static {
        response = new RetrieveStep2CaseResolutionResponse();
        response.setResponseCode("HS000000");
        response.setAgencyAction("");
        response.setCaseNumber("F573314109012NV");
        response.setFiveYearBarApplyCode("Y");
        response.setFiveYearBarMetCode("Y");

        response.setLawfulPresenceVerifiedCode("N");
        response.setMajorCd("");
        response.setMajorStatement("");
        response.setQualifiedNonCitizenCode("Y");
        response.setResponseCode("HS000000");
        try {
            response.setGrantDate(Utility.convertDate("09-Nov-2018"));
            response.setResponseDate(Utility.convertDate("09-Nov-2018"));
        } catch (ParseException e) {
            logger.error(" [Static data]: " + e.getMessage());
            LoggerUtil.logError(logger, e);
        }
        response.setUsCitizenCode("X");
        response.setUserField("");
        response.setVersionId("");
        response.setWebServSftwrVer("Sprint 7");
    }

    @Autowired
    public RetrieveStep2CaseResolutionService(@Qualifier("retrieveStep2CaseResolutionDao") AbstractDao<RetrieveStep2CaseResolutionRequest> dao) {
        super(dao);
    }

    public RetrieveStep2CaseResolutionResponse process(RetrieveStep2CaseResolutionRequest request) {
        return response;
    }

    public List<RetrieveStep2CaseResolutionResponse> get() {

        List<RetrieveStep2CaseResolutionResponse> responses = new ArrayList<>();

        responses.add(response);
        return responses;
    }

}