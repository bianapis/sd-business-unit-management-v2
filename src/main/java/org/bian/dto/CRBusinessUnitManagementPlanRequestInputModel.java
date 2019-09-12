package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord;
import org.bian.dto.CRBusinessUnitManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanRequestInputModel
 */
public class CRBusinessUnitManagementPlanRequestInputModel   {
  private String businessUnitManagementServicingSessionReference = null;

  private String businessUnitManagementPlanInstanceReference = null;

  private CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord businessUnitManagementPlanInstanceRecord = null;

  private Object businessUnitManagementPlanRequestActionTaskRecord = null;

  private CRBusinessUnitManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return businessUnitManagementPlanRequestActionTaskRecord
  **/

  public Object getBusinessUnitManagementPlanRequestActionTaskRecord() {
    return businessUnitManagementPlanRequestActionTaskRecord;
  }

  public void setBusinessUnitManagementPlanRequestActionTaskRecord(Object businessUnitManagementPlanRequestActionTaskRecord) {
    this.businessUnitManagementPlanRequestActionTaskRecord = businessUnitManagementPlanRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBusinessUnitManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBusinessUnitManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

