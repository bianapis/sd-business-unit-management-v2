package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis;
import org.bian.dto.CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveInputModel
 */
public class CRBusinessUnitManagementPlanRetrieveInputModel   {
  private Object businessUnitManagementPlanRetrieveActionTaskRecord = null;

  private String businessUnitManagementPlanRetrieveActionRequest = null;

  private CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord businessUnitManagementPlanInstanceReportRecord = null;

  private CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis businessUnitManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return businessUnitManagementPlanRetrieveActionTaskRecord
  **/

  public Object getBusinessUnitManagementPlanRetrieveActionTaskRecord() {
    return businessUnitManagementPlanRetrieveActionTaskRecord;
  }

  public void setBusinessUnitManagementPlanRetrieveActionTaskRecord(Object businessUnitManagementPlanRetrieveActionTaskRecord) {
    this.businessUnitManagementPlanRetrieveActionTaskRecord = businessUnitManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return businessUnitManagementPlanRetrieveActionRequest
  **/

  public String getBusinessUnitManagementPlanRetrieveActionRequest() {
    return businessUnitManagementPlanRetrieveActionRequest;
  }

  public void setBusinessUnitManagementPlanRetrieveActionRequest(String businessUnitManagementPlanRetrieveActionRequest) {
    this.businessUnitManagementPlanRetrieveActionRequest = businessUnitManagementPlanRetrieveActionRequest;
  }


  /**
   * Get businessUnitManagementPlanInstanceReportRecord
   * @return businessUnitManagementPlanInstanceReportRecord
  **/

  public CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord getBusinessUnitManagementPlanInstanceReportRecord() {
    return businessUnitManagementPlanInstanceReportRecord;
  }

  public void setBusinessUnitManagementPlanInstanceReportRecord(CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord businessUnitManagementPlanInstanceReportRecord) {
    this.businessUnitManagementPlanInstanceReportRecord = businessUnitManagementPlanInstanceReportRecord;
  }


  /**
   * Get businessUnitManagementPlanInstanceAnalysis
   * @return businessUnitManagementPlanInstanceAnalysis
  **/

  public CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis getBusinessUnitManagementPlanInstanceAnalysis() {
    return businessUnitManagementPlanInstanceAnalysis;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysis(CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis businessUnitManagementPlanInstanceAnalysis) {
    this.businessUnitManagementPlanInstanceAnalysis = businessUnitManagementPlanInstanceAnalysis;
  }


}

