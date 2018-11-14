package com.microservice.poc.dao;

import com.microservice.poc.model.FedLawfulPresence.InitialVerificationRequestSetType;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class FedLawfulPresence1Dao extends AbstractDao<InitialVerificationRequestSetType> {

    @Override
    public void setDataSource(DataSource dataSource) {

    }
}
