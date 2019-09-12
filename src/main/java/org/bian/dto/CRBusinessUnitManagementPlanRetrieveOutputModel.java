package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord;
import org.bian.dto.CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis;
import org.bian.dto.CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveOutputModel
 */
public class CRBusinessUnitManagementPlanRetrieveOutputModel   {
  private CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord = null;

  private String businessUnitManagementPlanRetrieveActionTaskReference = null;

  private Object businessUnitManagementPlanRetrieveActionTaskRecord = null;

  private String businessUnitManagementPlanRetrieveActionResponse = null;

  private CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord businessUnitManagementPlanInstanceReportRecord = null;

  private CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis businessUnitManagementPlanInstanceAnalysis = null;


  /**
   * Get businessUnitManagementPlanInstanceRecord
   * @return businessUnitManagementPlanInstanceRecord
  **/

  public CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord getBusinessUnitManagementPlanInstanceRecord() {
    return businessUnitManagementPlanInstanceRecord;
  }

  public void setBusinessUnitManagementPlanInstanceRecord(CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord) {
    this.businessUnitManagementPlanInstanceRecord = businessUnitManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Unit Management Plan instance retrieve service call 
   * @return businessUnitManagementPlanRetrieveActionTaskReference
  **/

  public String getBusinessUnitManagementPlanRetrieveActionTaskReference() {
    return businessUnitManagementPlanRetrieveActionTaskReference;
  }

  public void setBusinessUnitManagementPlanRetrieveActionTaskReference(String businessUnitManagementPlanRetrieveActionTaskReference) {
    this.businessUnitManagementPlanRetrieveActionTaskReference = businessUnitManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return businessUnitManagementPlanRetrieveActionResponse
  **/

  public String getBusinessUnitManagementPlanRetrieveActionResponse() {
    return businessUnitManagementPlanRetrieveActionResponse;
  }

  public void setBusinessUnitManagementPlanRetrieveActionResponse(String businessUnitManagementPlanRetrieveActionResponse) {
    this.businessUnitManagementPlanRetrieveActionResponse = businessUnitManagementPlanRetrieveActionResponse;
  }


  /**
   * Get businessUnitManagementPlanInstanceReportRecord
   * @return businessUnitManagementPlanInstanceReportRecord
  **/

  public CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord getBusinessUnitManagementPlanInstanceReportRecord() {
    return businessUnitManagementPlanInstanceReportRecord;
  }

  public void setBusinessUnitManagementPlanInstanceReportRecord(CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord businessUnitManagementPlanInstanceReportRecord) {
    this.businessUnitManagementPlanInstanceReportRecord = businessUnitManagementPlanInstanceReportRecord;
  }


  /**
   * Get businessUnitManagementPlanInstanceAnalysis
   * @return businessUnitManagementPlanInstanceAnalysis
  **/

  public CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis getBusinessUnitManagementPlanInstanceAnalysis() {
    return businessUnitManagementPlanInstanceAnalysis;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysis(CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis businessUnitManagementPlanInstanceAnalysis) {
    this.businessUnitManagementPlanInstanceAnalysis = businessUnitManagementPlanInstanceAnalysis;
  }


}

