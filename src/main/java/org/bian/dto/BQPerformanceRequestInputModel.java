package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecord;
import org.bian.dto.CRBusinessUnitManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQPerformanceRequestInputModel
 */
public class BQPerformanceRequestInputModel   {
  private String businessUnitManagementPlanInstanceReference = null;

  private String performanceInstanceReference = null;

  private BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord = null;

  private Object performanceRequestActionTaskRecord = null;

  private CRBusinessUnitManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Performance instance 
   * @return performanceInstanceReference
  **/

  public String getPerformanceInstanceReference() {
    return performanceInstanceReference;
  }

  public void setPerformanceInstanceReference(String performanceInstanceReference) {
    this.performanceInstanceReference = performanceInstanceReference;
  }


  /**
   * Get performanceInstanceRecord
   * @return performanceInstanceRecord
  **/

  public BQPerformanceUpdateInputModelPerformanceInstanceRecord getPerformanceInstanceRecord() {
    return performanceInstanceRecord;
  }

  public void setPerformanceInstanceRecord(BQPerformanceUpdateInputModelPerformanceInstanceRecord performanceInstanceRecord) {
    this.performanceInstanceRecord = performanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return performanceRequestActionTaskRecord
  **/

  public Object getPerformanceRequestActionTaskRecord() {
    return performanceRequestActionTaskRecord;
  }

  public void setPerformanceRequestActionTaskRecord(Object performanceRequestActionTaskRecord) {
    this.performanceRequestActionTaskRecord = performanceRequestActionTaskRecord;
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

