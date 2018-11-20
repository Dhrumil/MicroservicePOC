package com.microservice.poc.dao;

import com.microservice.poc.model.FedLawfulPresence.RetrieveStep2CaseResolutionRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class RetrieveStep2CaseResolutionDao extends AbstractDao<RetrieveStep2CaseResolutionRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

    }
}
