package com.microservice.poc.dao;

import com.microservice.poc.model.FedLawfulPresence.InitialVerificationRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class FedLawfulPresence1Dao extends AbstractDao<InitialVerificationRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

    }
}
