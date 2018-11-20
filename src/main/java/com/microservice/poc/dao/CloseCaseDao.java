package com.microservice.poc.dao;

import com.microservice.poc.model.FedLawfulPresence.CloseCaseRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class CloseCaseDao extends AbstractDao<CloseCaseRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

    }
}
