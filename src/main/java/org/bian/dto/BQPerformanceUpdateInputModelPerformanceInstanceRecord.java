package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecord
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecord   {
  private String businessUnitResourceUtilization = null;

  private String businessUnitOutputWorkProjections = null;

  private BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics businessUnitPerformanceStatistics = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the business unit employee target and actual utilization/productivity 
   * @return businessUnitResourceUtilization
  **/

  public String getBusinessUnitResourceUtilization() {
    return businessUnitResourceUtilization;
  }

  public void setBusinessUnitResourceUtilization(String businessUnitResourceUtilization) {
    this.businessUnitResourceUtilization = businessUnitResourceUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Estimated projected business unit product/service delivery and work volume targets as appropriate for the type of unit 
   * @return businessUnitOutputWorkProjections
  **/

  public String getBusinessUnitOutputWorkProjections() {
    return businessUnitOutputWorkProjections;
  }

  public void setBusinessUnitOutputWorkProjections(String businessUnitOutputWorkProjections) {
    this.businessUnitOutputWorkProjections = businessUnitOutputWorkProjections;
  }


  /**
   * Get businessUnitPerformanceStatistics
   * @return businessUnitPerformanceStatistics
  **/

  public BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics getBusinessUnitPerformanceStatistics() {
    return businessUnitPerformanceStatistics;
  }

  public void setBusinessUnitPerformanceStatistics(BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics businessUnitPerformanceStatistics) {
    this.businessUnitPerformanceStatistics = businessUnitPerformanceStatistics;
  }


}

