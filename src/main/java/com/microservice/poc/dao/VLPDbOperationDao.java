package com.microservice.poc.dao;

import com.microservice.poc.model.PersonLawfulDetail.PersonLawfulDetail;
import com.microservice.poc.utility.H2PocUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Repository
public class VLPDbOperationDao extends AbstractDao<PersonLawfulDetail> {

    private SimpleJdbcCall findByEmail;

    @Autowired
    @Override
    public void setDataSource(@Qualifier(value = "h2DS") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.setResultsMapCaseInsensitive(true);
        create = new SimpleJdbcCall(jdbcTemplate).withProcedureName("createPersonLawfulDetails").withReturnValue();

        findByEmail = new SimpleJdbcCall(jdbcTemplate).withProcedureName("getPersonLawfulByEmail")

                .returningResultSet(SINGLE_RESULT, BeanPropertyRowMapper.newInstance(PersonLawfulDetail.class));
    }

    public PersonLawfulDetail find(Long personId) throws DataAccessException {

        SqlParameterSource in = new MapSqlParameterSource().addValue("id", personId);

        Map<String, Object> m = find.execute(in);

        List<PersonLawfulDetail> result = (List<PersonLawfulDetail>) m.get(SINGLE_RESULT);

        if (!result.isEmpty()) {

            return result.get(0);

        } else {

            return null;

        }

    }

    public PersonLawfulDetail findByEmail(String email) throws DataAccessException {

        SqlParameterSource in = new MapSqlParameterSource().addValue("email", email);

        Map<String, Object> m = findByEmail.execute(in);

        List<PersonLawfulDetail> result = (List<PersonLawfulDetail>) m.get(SINGLE_RESULT);

        if (!result.isEmpty()) {

            return result.get(0);

        } else {

            return null;
        }
    }


    @Override
    public PersonLawfulDetail create(PersonLawfulDetail personLawfulDetail) {
        {
            try {
                H2PocUtil.insertIntoPersonLawfulDetail(personLawfulDetail);
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            return personLawfulDetail;
        }
    }
}
