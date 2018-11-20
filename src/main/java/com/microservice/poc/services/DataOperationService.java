package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.dao.DataOperationDao;
import com.microservice.poc.model.PersonLawfulDetail.AdditionalLawfulDetail;
import com.microservice.poc.model.PersonLawfulDetail.PersonLawFulDetailsResponse;
import com.microservice.poc.model.PersonLawfulDetail.PersonLawfulDetail;
import com.microservice.poc.model.Response.ResponseErrors;
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
public class DataOperationService extends AbstractService<PersonLawfulDetail> {

    private static final Logger logger = LoggerFactory.getLogger(DataOperationService.class);
    static PersonLawFulDetailsResponse getResponses;
    private static List<AdditionalLawfulDetail> additionList;

    static {

        PersonLawfulDetail request = new PersonLawfulDetail();
        request.setAgencyAction("");
        request.setCaseNumber("TY");
        request.setEligibilityStatementCode("");
        request.setFiveYearBarMet("");
        request.setLawfulPresenceCode("");
        request.setNonCitCoaCode("");
        request.setQualifiedCitizenCode("");
        request.setUuid(String.valueOf(Utility.generateRandom(5) + 1));

        getResponses = new PersonLawFulDetailsResponse();
        List<ResponseErrors> responseErrors = new ArrayList<>();
        ResponseErrors error = new ResponseErrors();
        error.setName("N/A");
        error.setValue("N/A");

        responseErrors.add(error);

        additionList = new ArrayList<>();
        AdditionalLawfulDetail temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedDOB");
        temp.setDetailValue("1986-03-24");
        temp.setUuid(String.valueOf(Utility.generateRandom(5) + 1));
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedLastName");
        temp.setDetailValue("Merritt");
        temp.setUuid(String.valueOf(Utility.generateRandom(5) + 1));
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedSSN");
        temp.setDetailValue("686345323");
        temp.setUuid(String.valueOf(Utility.generateRandom(5) + 1));
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("PersonUSCitizenIndicator");
        temp.setDetailValue("true");
        temp.setUuid(String.valueOf(Utility.generateRandom(5) + 1));
        additionList.add(temp);

        getResponses.setResponseErrors(responseErrors);
        getResponses.setAdditionalLawfulDetail(additionList);
        getResponses.setAgencyAction(request.getAgencyAction());
        getResponses.setCaseNumber(request.getCaseNumber());
        getResponses.setEligibilityStatementCode(request.getEligibilityStatementCode());
        getResponses.setFiveYearBarMet(request.getFiveYearBarMet());
        getResponses.setLawfulPresenceCode(request.getLawfulPresenceCode());
        getResponses.setNonCitCoaCode(request.getNonCitCoaCode());
        getResponses.setQualifiedCitizenCode(request.getQualifiedCitizenCode());
        getResponses.setUuid(request.getUuid());

        try {
            request.setGrantDate(Utility.convertDate("19-Nov-2018"));
            getResponses.setGrantDate(request.getGrantDate());
        } catch (ParseException e) {
            logger.error(" [getResponse()]: " + e.getMessage());
            LoggerUtil.logError(logger, e);
        }
        getResponses.setResponseCode("00");
        getResponses.setStatus("NOT_VFD");
    }

    @Override
    public void update(PersonLawfulDetail personLawfulDetail) {
        super.update(personLawfulDetail);

    }

    @Autowired
    public DataOperationService(@Qualifier("dataOperationDao") AbstractDao<PersonLawfulDetail> dao) {
        super(dao);
    }

    @Override
    public PersonLawfulDetail create(PersonLawfulDetail personLawfulDetail) {

        //return super.create(personLawfulDetail);
        return null;
    }

    @Override
    public void delete(Long id) {
        DataOperationDao dataOperationDao = (DataOperationDao) dao;
        dataOperationDao.delete(id);
    }

    public PersonLawfulDetail find(Long personId) {

        DataOperationDao dataOperationDao = (DataOperationDao) dao;
        return dataOperationDao.find(personId);
    }

    public PersonLawfulDetail findByEmail(String email) {
        DataOperationDao dataOperationDao = (DataOperationDao) dao;
        return dataOperationDao.findByEmail(email);
    }

    public List<PersonLawFulDetailsResponse> findAlls() {
        DataOperationDao dataOperationDao = (DataOperationDao) dao;
        List<PersonLawFulDetailsResponse> list = new ArrayList<>();
        list.add(getResponses);
        return list;//dataOperationDao.findAlls();
    }

    public PersonLawFulDetailsResponse getResponse(PersonLawfulDetail request) {

        return getResponses;

    }
}