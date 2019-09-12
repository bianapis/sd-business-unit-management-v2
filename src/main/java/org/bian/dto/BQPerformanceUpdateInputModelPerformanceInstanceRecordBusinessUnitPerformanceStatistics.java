package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics
 */
public class BQPerformanceUpdateInputModelPerformanceInstanceRecordBusinessUnitPerformanceStatistics   {
  private String businessUnitPerformanceStatisticType = null;

  private String businessUnitPerformanceStatisticValue = null;

  private String businessUnitPerformanceStatisticInterpretation = null;

  private String businessUnitPerformanceStatisticRecommendation = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of activity that is tracked and analyzed (e.g. delivery rate, utilization) 
   * @return businessUnitPerformanceStatisticType
  **/

  public String getBusinessUnitPerformanceStatisticType() {
    return businessUnitPerformanceStatisticType;
  }

  public void setBusinessUnitPerformanceStatisticType(String businessUnitPerformanceStatisticType) {
    this.businessUnitPerformanceStatisticType = businessUnitPerformanceStatisticType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The statistical analysis that can include historical and trended views of the activity 
   * @return businessUnitPerformanceStatisticValue
  **/

  public String getBusinessUnitPerformanceStatisticValue() {
    return businessUnitPerformanceStatisticValue;
  }

  public void setBusinessUnitPerformanceStatisticValue(String businessUnitPerformanceStatisticValue) {
    this.businessUnitPerformanceStatisticValue = businessUnitPerformanceStatisticValue;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Narrative that might explain any divergence from expected performance/delivery 
   * @return businessUnitPerformanceStatisticInterpretation
  **/

  public String getBusinessUnitPerformanceStatisticInterpretation() {
    return businessUnitPerformanceStatisticInterpretation;
  }

  public void setBusinessUnitPerformanceStatisticInterpretation(String businessUnitPerformanceStatisticInterpretation) {
    this.businessUnitPerformanceStatisticInterpretation = businessUnitPerformanceStatisticInterpretation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Proposed operational changes/recommendations arising from the performance tracking and analysis 
   * @return businessUnitPerformanceStatisticRecommendation
  **/

  public String getBusinessUnitPerformanceStatisticRecommendation() {
    return businessUnitPerformanceStatisticRecommendation;
  }

  public void setBusinessUnitPerformanceStatisticRecommendation(String businessUnitPerformanceStatisticRecommendation) {
    this.businessUnitPerformanceStatisticRecommendation = businessUnitPerformanceStatisticRecommendation;
  }


}

