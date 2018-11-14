package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.dao.ApiMonitorDao;
import com.microservice.poc.model.AbstractModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;

@Service
public class ApiMonitorService extends AbstractService<AbstractModel> {

    private static final Logger logger = LoggerFactory.getLogger(ApiMonitorService.class);

    @Autowired
    public ApiMonitorService(@Qualifier("apiMonitorDao") AbstractDao<AbstractModel> dao) {
        super(dao);
    }

    public HashMap<String, String> getLookupValues() throws SQLException, ClassNotFoundException {
        ApiMonitorDao apiMonitorDao = (ApiMonitorDao) dao;
        return apiMonitorDao.getLookupValues();
    }
}
