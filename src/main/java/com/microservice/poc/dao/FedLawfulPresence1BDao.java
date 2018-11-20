package com.microservice.poc.dao;


import com.microservice.poc.model.FedLawfulPresence.ResubmitRequest;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class FedLawfulPresence1BDao extends AbstractDao<ResubmitRequest> {

    @Override
    public void setDataSource(DataSource dataSource) {

        {
        }
    }
}
