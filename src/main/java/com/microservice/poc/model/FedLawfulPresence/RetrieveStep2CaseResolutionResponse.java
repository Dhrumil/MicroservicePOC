package com.microservice.poc.model.FedLawfulPresence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.microservice.poc.model.AbstractModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a Retrieve Step2 Case Resolution Response.")
public class RetrieveStep2CaseResolutionResponse extends AbstractModel {

    @ApiModelProperty(example = "00")
    private String responseCode;
    @ApiModelProperty(example = "454646464TU")
    private String caseNumber;//TODO [a-zA-Z0-9]{13}[A-Z]{2}
    @ApiModelProperty(example = "2018-09-09", position = 6)
    private Date grantDate;
    @ApiModelProperty(example = "Smith", position = 7)
    private String agencyAction;//TODO 1..250
    @ApiModelProperty(example = "Smith", position = 8)
    private String fiveYearBarApplyCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Smith", position = 9)
    private String qualifiedNonCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "Smith", position = 10)
    private String fiveYearBarMetCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    @ApiModelProperty(example = "PA9876432", position = 11)
    private String usCitizenCode;//TODO (Y-Yes, N-No, P-Pending, X-N/A)
    private String arrayOfSponsorshipData;//TODO is this a list

    private String webServSftwrVer;
    private String userField;
    private Date responseDate;
    private String versionId;

/*

            MajorCd
    MajorStatement
            MinorCd
    MinorStatement
            SponsoredIndicator
    ServiceReceiptDate
            LPRStatusDate
    LawfulPresenceVerifiedCode
            ResolutionData*/

}
