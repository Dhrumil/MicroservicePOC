package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.dao.FedLawfulPresence1Dao;
import com.microservice.poc.model.FedLawfulPresence.InitialVerificationIndividualResponseSetType;
import com.microservice.poc.model.FedLawfulPresence.InitialVerificationRequestSetType;
import com.microservice.poc.utility.LoggerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FedLawfulPresence1Service extends AbstractService<InitialVerificationRequestSetType> {

    private static final Logger logger = LoggerFactory.getLogger(FedLawfulPresence1Service.class);
    @Autowired
    public FedLawfulPresence1Service(@Qualifier("fedLawfulPresence1Dao") AbstractDao<InitialVerificationRequestSetType> dao) {
        super(dao);
    }

    @Override
    public InitialVerificationRequestSetType create(InitialVerificationRequestSetType request) {
        return super.create(request);
    }

    @Override
    public void delete(Long id) {
        FedLawfulPresence1Dao fedLawfulPresence1Dao = (FedLawfulPresence1Dao) dao;
        fedLawfulPresence1Dao.delete(id);
    }

    @Override
    public void update(InitialVerificationRequestSetType request) {
        super.update(request);
    }

    public InitialVerificationIndividualResponseSetType process(InitialVerificationRequestSetType request) {
        InitialVerificationIndividualResponseSetType response = new InitialVerificationIndividualResponseSetType();
        try {
            response.setResponseCode(request.getFirstName());//TODO
        } catch (Exception ex) {
            logger.error(" [process()]: " + ex.getMessage());
            LoggerUtil.logError(logger, ex);
        }
        return response;
    }


}
