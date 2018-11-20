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
        request.setUUID(Utility.guidID());

        getResponses = new PersonLawFulDetailsResponse();
        List<ResponseErrors> responseErrors = new ArrayList<>();
        ResponseErrors error = new ResponseErrors();
        error.setName("");
        error.setValue("");

        //responseErrors.set(1,error);

        additionList = new ArrayList<>();
        AdditionalLawfulDetail temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedDOB");
        temp.setDetailValue("1986-03-24");
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedLastName");
        temp.setDetailValue("Merritt");
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("AttestedSSN");
        temp.setDetailValue("686345323");
        additionList.add(temp);

        temp = new AdditionalLawfulDetail();
        temp.setDetailName("PersonUSCitizenIndicator");
        temp.setDetailValue("true");
        additionList.add(temp);

        getResponses.setResponseErrors(responseErrors);
        getResponses.setAdditionalLawfulDetail(additionList);
        getResponses.setAgencyAction(request.getAgencyAction());
        getResponses.setCaseNumber(request.getCaseNumber());
        getResponses.setEligibilityStatementCode(request.getEligibilityStatementCode());
        getResponses.setFiveYearBarMet(request.getFiveYearBarMet());
        getResponses.setLawfulPreseneCode(request.getLawfulPresenceCode());
        getResponses.setNonCitCoaCode(request.getNonCitCoaCode());
        getResponses.setQualifiedCitizenCode(request.getQualifiedCitizenCode());
        getResponses.setUUID(request.getUUID());

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
        return dataOperationDao.findAlls();
    }

    public PersonLawFulDetailsResponse getResponse(PersonLawfulDetail request) {

        return getResponses;

    }
}