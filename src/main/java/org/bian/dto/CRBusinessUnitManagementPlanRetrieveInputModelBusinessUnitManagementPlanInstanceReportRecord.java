package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord
 */
public class CRBusinessUnitManagementPlanRetrieveInputModelBusinessUnitManagementPlanInstanceReportRecord   {
  private String businessUnitManagementPlanInstanceReportReference = null;

  private String businessUnitManagementPlanInstanceReportType = null;

  private String businessUnitManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return businessUnitManagementPlanInstanceReportReference
  **/

  public String getBusinessUnitManagementPlanInstanceReportReference() {
    return businessUnitManagementPlanInstanceReportReference;
  }

  public void setBusinessUnitManagementPlanInstanceReportReference(String businessUnitManagementPlanInstanceReportReference) {
    this.businessUnitManagementPlanInstanceReportReference = businessUnitManagementPlanInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return businessUnitManagementPlanInstanceReportParameters
  **/

  public String getBusinessUnitManagementPlanInstanceReportParameters() {
    return businessUnitManagementPlanInstanceReportParameters;
  }

  public void setBusinessUnitManagementPlanInstanceReportParameters(String businessUnitManagementPlanInstanceReportParameters) {
    this.businessUnitManagementPlanInstanceReportParameters = businessUnitManagementPlanInstanceReportParameters;
  }


}

