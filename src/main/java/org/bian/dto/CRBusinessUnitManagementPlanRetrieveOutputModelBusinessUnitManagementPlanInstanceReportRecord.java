package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord
 */
public class CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceReportRecord   {
  private String businessUnitManagementPlanInstanceReportData = null;

  private String businessUnitManagementPlanInstanceReportType = null;

  private Object businessUnitManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return businessUnitManagementPlanInstanceReportData
  **/

  public String getBusinessUnitManagementPlanInstanceReportData() {
    return businessUnitManagementPlanInstanceReportData;
  }

  public void setBusinessUnitManagementPlanInstanceReportData(String businessUnitManagementPlanInstanceReportData) {
    this.businessUnitManagementPlanInstanceReportData = businessUnitManagementPlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return businessUnitManagementPlanInstanceReportType
  **/

  public String getBusinessUnitManagementPlanInstanceReportType() {
    return businessUnitManagementPlanInstanceReportType;
  }

  public void setBusinessUnitManagementPlanInstanceReportType(String businessUnitManagementPlanInstanceReportType) {
    this.businessUnitManagementPlanInstanceReportType = businessUnitManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return businessUnitManagementPlanInstanceReport
  **/

  public Object getBusinessUnitManagementPlanInstanceReport() {
    return businessUnitManagementPlanInstanceReport;
  }

  public void setBusinessUnitManagementPlanInstanceReport(Object businessUnitManagementPlanInstanceReport) {
    this.businessUnitManagementPlanInstanceReport = businessUnitManagementPlanInstanceReport;
  }


}

