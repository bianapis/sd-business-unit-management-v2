package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis
 */
public class CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceAnalysis   {
  private String businessUnitManagementPlanInstanceAnalysisReference = null;

  private String businessUnitManagementPlanInstanceAnalysisReportType = null;

  private String businessUnitManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return businessUnitManagementPlanInstanceAnalysisReference
  **/

  public String getBusinessUnitManagementPlanInstanceAnalysisReference() {
    return businessUnitManagementPlanInstanceAnalysisReference;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysisReference(String businessUnitManagementPlanInstanceAnalysisReference) {
    this.businessUnitManagementPlanInstanceAnalysisReference = businessUnitManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return businessUnitManagementPlanInstanceAnalysisParameters
  **/

  public String getBusinessUnitManagementPlanInstanceAnalysisParameters() {
    return businessUnitManagementPlanInstanceAnalysisParameters;
  }

  public void setBusinessUnitManagementPlanInstanceAnalysisParameters(String businessUnitManagementPlanInstanceAnalysisParameters) {
    this.businessUnitManagementPlanInstanceAnalysisParameters = businessUnitManagementPlanInstanceAnalysisParameters;
  }


}

