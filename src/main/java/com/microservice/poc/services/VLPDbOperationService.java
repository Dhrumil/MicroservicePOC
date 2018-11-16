package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.dao.VLPDbOperationDao;
import com.microservice.poc.model.Page;
import com.microservice.poc.model.PersonLawfulDetail.PersonLawfulDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VLPDbOperationService extends AbstractService<PersonLawfulDetail> {

    private static final Logger logger = LoggerFactory.getLogger(VLPDbOperationService.class);
    @Autowired
    public VLPDbOperationService(@Qualifier("VLPDbOperationDao") AbstractDao<PersonLawfulDetail> dao) {
        super(dao);
    }

    @Override
    public PersonLawfulDetail create(PersonLawfulDetail personLawfulDetail) {

        return super.create(personLawfulDetail);
    }

    @Override
    public void delete(Long id) {
        VLPDbOperationDao vLPDbProcessDao = (VLPDbOperationDao) dao;
        vLPDbProcessDao.delete(id);
    }

    @Override
    public void update(PersonLawfulDetail personLawfulDetail) {
        super.update(personLawfulDetail);

    }

    public PersonLawfulDetail find(Long personId) {

        VLPDbOperationDao vLPDbProcessDao = (VLPDbOperationDao) dao;
        return vLPDbProcessDao.find(personId);
    }

    public PersonLawfulDetail findByEmail(String email) {
        VLPDbOperationDao vLPDbProcessDao = (VLPDbOperationDao) dao;
        return vLPDbProcessDao.findByEmail(email);
    }

    public Page<PersonLawfulDetail> findAll(Integer pageNum, Integer pageSize) {
        VLPDbOperationDao vLPDbProcessDao = (VLPDbOperationDao) dao;
        return vLPDbProcessDao.findAll(pageNum, pageSize);
    }
}