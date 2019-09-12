package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord
 */
public class BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord   {
  private Object businessUnitProductionIssueRecord = null;

  private String businessUnitIssueAnalysisAndRecommendedResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content) 
   * @return businessUnitProductionIssueRecord
  **/

  public Object getBusinessUnitProductionIssueRecord() {
    return businessUnitProductionIssueRecord;
  }

  public void setBusinessUnitProductionIssueRecord(Object businessUnitProductionIssueRecord) {
    this.businessUnitProductionIssueRecord = businessUnitProductionIssueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the root cause analysis for recurring issues and suggested remedial action that can be internal to the unit or recommended to service providers and subscribers as appropriate 
   * @return businessUnitIssueAnalysisAndRecommendedResponse
  **/

  public String getBusinessUnitIssueAnalysisAndRecommendedResponse() {
    return businessUnitIssueAnalysisAndRecommendedResponse;
  }

  public void setBusinessUnitIssueAnalysisAndRecommendedResponse(String businessUnitIssueAnalysisAndRecommendedResponse) {
    this.businessUnitIssueAnalysisAndRecommendedResponse = businessUnitIssueAnalysisAndRecommendedResponse;
  }


}

