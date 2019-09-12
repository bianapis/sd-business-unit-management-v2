package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanUpdateOutputModel
 */
public class CRBusinessUnitManagementPlanUpdateOutputModel   {
  private CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord = null;

  private String businessUnitManagementPlanUpdateActionTaskReference = null;

  private Object businessUnitManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return businessUnitManagementPlanUpdateActionTaskReference
  **/

  public String getBusinessUnitManagementPlanUpdateActionTaskReference() {
    return businessUnitManagementPlanUpdateActionTaskReference;
  }

  public void setBusinessUnitManagementPlanUpdateActionTaskReference(String businessUnitManagementPlanUpdateActionTaskReference) {
    this.businessUnitManagementPlanUpdateActionTaskReference = businessUnitManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return businessUnitManagementPlanUpdateActionTaskRecord
  **/

  public Object getBusinessUnitManagementPlanUpdateActionTaskRecord() {
    return businessUnitManagementPlanUpdateActionTaskRecord;
  }

  public void setBusinessUnitManagementPlanUpdateActionTaskRecord(Object businessUnitManagementPlanUpdateActionTaskRecord) {
    this.businessUnitManagementPlanUpdateActionTaskRecord = businessUnitManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

