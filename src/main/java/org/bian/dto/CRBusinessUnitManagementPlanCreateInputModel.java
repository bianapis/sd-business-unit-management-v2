package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanCreateInputModel
 */
public class CRBusinessUnitManagementPlanCreateInputModel   {
  private String businessUnitManagementServicingSessionReference = null;

  private Object businessUnitManagementPlanCreateActionRecord = null;

  private String businessUnitManagementPlanInstanceStatus = null;

  private CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return businessUnitManagementPlanCreateActionRecord
  **/

  public Object getBusinessUnitManagementPlanCreateActionRecord() {
    return businessUnitManagementPlanCreateActionRecord;
  }

  public void setBusinessUnitManagementPlanCreateActionRecord(Object businessUnitManagementPlanCreateActionRecord) {
    this.businessUnitManagementPlanCreateActionRecord = businessUnitManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Business Unit Management Plan instance (e.g. initialised, pending, active) 
   * @return businessUnitManagementPlanInstanceStatus
  **/

  public String getBusinessUnitManagementPlanInstanceStatus() {
    return businessUnitManagementPlanInstanceStatus;
  }

  public void setBusinessUnitManagementPlanInstanceStatus(String businessUnitManagementPlanInstanceStatus) {
    this.businessUnitManagementPlanInstanceStatus = businessUnitManagementPlanInstanceStatus;
  }


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


}

