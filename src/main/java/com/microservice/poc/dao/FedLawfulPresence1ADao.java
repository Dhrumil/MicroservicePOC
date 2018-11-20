package com.microservice.poc.dao;


import com.microservice.poc.model.FedLawfulPresence.ReverificationRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class FedLawfulPresence1ADao extends AbstractDao<ReverificationRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

        {
        }
    }
}