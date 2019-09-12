package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis
 */
public class CRBusinessUnitManagementPlanRetrieveOutputModelBusinessUnitManagementPlanInstanceAnalysis   {
  private String businessUnitManagementPlanInstanceAnalysisData = null;

  private String businessUnitManagementPlanInstanceAnalysisReportType = null;

  private Object businessUnitManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return businessUnitManagementPlanInstanceAnalysisData
  **/

  public String getBusinessUnitManagementPlanInstanceAnalysisData() {
    return businessUnitManagementPlanInstanceAnalysisData;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysisData(String businessUnitManagementPlanInstanceAnalysisData) {
    this.businessUnitManagementPlanInstanceAnalysisData = businessUnitManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return businessUnitManagementPlanInstanceAnalysisReportType
  **/

  public String getBusinessUnitManagementPlanInstanceAnalysisReportType() {
    return businessUnitManagementPlanInstanceAnalysisReportType;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysisReportType(String businessUnitManagementPlanInstanceAnalysisReportType) {
    this.businessUnitManagementPlanInstanceAnalysisReportType = businessUnitManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return businessUnitManagementPlanInstanceAnalysisReport
  **/

  public Object getBusinessUnitManagementPlanInstanceAnalysisReport() {
    return businessUnitManagementPlanInstanceAnalysisReport;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysisReport(Object businessUnitManagementPlanInstanceAnalysisReport) {
    this.businessUnitManagementPlanInstanceAnalysisReport = businessUnitManagementPlanInstanceAnalysisReport;
  }


}

