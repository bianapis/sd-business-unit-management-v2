package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanExchangeInputModelBusinessUnitManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanExchangeInputModel
 */
public class CRBusinessUnitManagementPlanExchangeInputModel   {
  private String businessUnitManagementServicingSessionReference = null;

  private String businessUnitManagementPlanInstanceReference = null;

  private Object businessUnitManagementPlanExchangeActionTaskRecord = null;

  private CRBusinessUnitManagementPlanExchangeInputModelBusinessUnitManagementPlanExchangeActionRequest businessUnitManagementPlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return businessUnitManagementServicingSessionReference
  **/

  public String getBusinessUnitManagementServicingSessionReference() {
    return businessUnitManagementServicingSessionReference;
  }

  public void setBusinessUnitManagementServicingSessionReference(String businessUnitManagementServicingSessionReference) {
    this.businessUnitManagementServicingSessionReference = businessUnitManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Business Unit Management Plan instance 
   * @return businessUnitManagementPlanInstanceReference
  **/

  public String getBusinessUnitManagementPlanInstanceReference() {
    return businessUnitManagementPlanInstanceReference;
  }

  public void setBusinessUnitManagementPlanInstanceReference(String businessUnitManagementPlanInstanceReference) {
    this.businessUnitManagementPlanInstanceReference = businessUnitManagementPlanInstanceReference;
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
   * Get businessUnitManagementPlanExchangeActionRequest
   * @return businessUnitManagementPlanExchangeActionRequest
  **/

  public CRBusinessUnitManagementPlanExchangeInputModelBusinessUnitManagementPlanExchangeActionRequest getBusinessUnitManagementPlanExchangeActionRequest() {
    return businessUnitManagementPlanExchangeActionRequest;
  }

  public void setBusinessUnitManagementPlanExchangeActionRequest(CRBusinessUnitManagementPlanExchangeInputModelBusinessUnitManagementPlanExchangeActionRequest businessUnitManagementPlanExchangeActionRequest) {
    this.businessUnitManagementPlanExchangeActionRequest = businessUnitManagementPlanExchangeActionRequest;
  }


}

