package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord;
import org.bian.dto.CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingCreateInputModel
 */
public class BQTroubleshootingCreateInputModel   {
  private CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord = null;

  private String businessUnitManagementPlanInstanceReference = null;

  private Object troubleshootingInitiateActionRecord = null;

  private BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Business Unit Management Plan instance 
   * @return businessUnitManagementPlanInstanceReference
  **/

  public String getBusinessUnitManagementPlanInstanceReference() {
    return businessUnitManagementPlanInstanceReference;
  }

  public void setBusinessUnitManagementPlanInstanceReference(String businessUnitManagementPlanInstanceReference) {
    this.businessUnitManagementPlanInstanceReference = businessUnitManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return troubleshootingInitiateActionRecord
  **/

  public Object getTroubleshootingInitiateActionRecord() {
    return troubleshootingInitiateActionRecord;
  }

  public void setTroubleshootingInitiateActionRecord(Object troubleshootingInitiateActionRecord) {
    this.troubleshootingInitiateActionRecord = troubleshootingInitiateActionRecord;
  }


  /**
   * Get troubleshootingInstanceRecord
   * @return troubleshootingInstanceRecord
  **/

  public BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord getTroubleshootingInstanceRecord() {
    return troubleshootingInstanceRecord;
  }

  public void setTroubleshootingInstanceRecord(BQTroubleshootingCreateInputModelTroubleshootingInstanceRecord troubleshootingInstanceRecord) {
    this.troubleshootingInstanceRecord = troubleshootingInstanceRecord;
  }


}

