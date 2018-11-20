package com.microservice.poc.services;

import com.microservice.poc.dao.AbstractDao;
import com.microservice.poc.model.FedLawfulPresence.ReverificationRequest;
import com.microservice.poc.model.FedLawfulPresence.ReverificationResponse;
import com.microservice.poc.utility.LoggerUtil;
import com.microservice.poc.utility.Utility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FedLawfulPresence1AService extends AbstractService<ReverificationRequest> {

    private static final Logger logger = LoggerFactory.getLogger(FedLawfulPresence1Service.class);
    static List<ReverificationResponse> responses;

    static {

        responses = new ArrayList<>();

            ReverificationResponse respTemp = new ReverificationResponse();

            try {
                respTemp.setCaseNumber("F573314109012NV");
                respTemp.setResponseCode("HS000000");

                respTemp.setAdmittedToDate(Utility.convertDate("11-Nov-2017"));
                respTemp.setAdmittedToText("Admit. Txt");
                respTemp.setFiveYearBarApplyCode("Y");
                respTemp.setuSCitizenCode("X");
                respTemp.setNonCitEntryDate(Utility.convertDate("11-Nov-2017"));
                respTemp.setNonCitMiddleName("A");
                respTemp.setNonCitFirstName("Lemuel");
                respTemp.setNonCitLastName("Merritt");
                respTemp.setSponsorDataFoundIndicator(false);

                respTemp.setGrantDate(Utility.convertDate("19-Nov-2018"));
                respTemp.setLawfulPresenceVerifiedCode("N");
                respTemp.setNonCitCountryBirthCd("WA");
                respTemp.setNonCitCountryCitCd("ENG");
                respTemp.setuSCitizenCode("X");
                respTemp.setEligStatementCd(5);

            } catch (ParseException e) {
                logger.error(" [Static list]: " + e.getMessage());
                LoggerUtil.logError(logger, e);
            }

            responses.add(respTemp);


    }

    @Autowired
    public FedLawfulPresence1AService(@Qualifier("fedLawfulPresence1ADao") AbstractDao<ReverificationRequest> dao) {
        super(dao);
    }

    public ReverificationResponse process(ReverificationRequest request) {

        ReverificationResponse response = new ReverificationResponse();
        try {
            response = postResponse(request);//TODO
        } catch (Exception ex) {
            logger.error(" [process()]: " + ex.getMessage());
            LoggerUtil.logError(logger, ex);
        }
        return response;
    }

    public List<ReverificationResponse> get() {
     /*
        List<ReverificationResponse> response = new ArrayList<>();
      try {
            response.set(0,new ReverificationResponse());//TODO
        } catch (Exception ex) {
            logger.error(" [get()]: " + ex.getMessage());
            LoggerUtil.logError(logger, ex);
        }*/
        return responses;
    }

    private ReverificationResponse postResponse(ReverificationRequest request) {
       /* ReverificationResponse response = new ReverificationResponse();


        try {

            response.setCaseNumber(request.getCaseNumber());
            response.setResponseCode("HS000000");
            response.setGrantDate(Utility.convertDate("19-Nov-2018"));
            response.setAdmittedToDate(Utility.convertDate("11-Nov-2018"));
            response.setAdmittedToText("Admit. Txt");
            response.setFiveYearBarApplyCode("Y");
            response.setuSCitizenCode("X");
            response.setNonCitEntryDate(Utility.convertDate("01-Nov-2017"));
            response.setNonCitMiddleName("A");
            response.setNonCitFirstName("Lemuel");
            response.setNonCitLastName("Merritt");


        } catch (ParseException e) {
            logger.error(" [postResponse()]: " + e.getMessage());
            LoggerUtil.logError(logger, e);
        }
*/

        return responses.get(0);

    }

}
