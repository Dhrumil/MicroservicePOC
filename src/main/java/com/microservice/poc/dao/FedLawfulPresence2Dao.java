package com.microservice.poc.dao;

import com.microservice.poc.model.FedLawfulPresence.InitiateAdditionalVerifRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class FedLawfulPresence2Dao extends AbstractDao<InitiateAdditionalVerifRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

    }
}
