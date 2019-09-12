package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanExchangeOutputModel
 */
public class CRBusinessUnitManagementPlanExchangeOutputModel   {
  private String businessUnitManagementPlanExchangeActionTaskReference = null;

  private Object businessUnitManagementPlanExchangeActionTaskRecord = null;

  private String businessUnitManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Business Unit Management Plan instance exchange service call 
   * @return businessUnitManagementPlanExchangeActionTaskReference
  **/

  public String getBusinessUnitManagementPlanExchangeActionTaskReference() {
    return businessUnitManagementPlanExchangeActionTaskReference;
  }

  public void setBusinessUnitManagementPlanExchangeActionTaskReference(String businessUnitManagementPlanExchangeActionTaskReference) {
    this.businessUnitManagementPlanExchangeActionTaskReference = businessUnitManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return businessUnitManagementPlanExchangeActionTaskRecord
  **/

  public Object getBusinessUnitManagementPlanExchangeActionTaskRecord() {
    return businessUnitManagementPlanExchangeActionTaskRecord;
  }

  public void setBusinessUnitManagementPlanExchangeActionTaskRecord(Object businessUnitManagementPlanExchangeActionTaskRecord) {
    this.businessUnitManagementPlanExchangeActionTaskRecord = businessUnitManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return businessUnitManagementPlanExchangeActionResponse
  **/

  public String getBusinessUnitManagementPlanExchangeActionResponse() {
    return businessUnitManagementPlanExchangeActionResponse;
  }

  public void setBusinessUnitManagementPlanExchangeActionResponse(String businessUnitManagementPlanExchangeActionResponse) {
    this.businessUnitManagementPlanExchangeActionResponse = businessUnitManagementPlanExchangeActionResponse;
  }


}

