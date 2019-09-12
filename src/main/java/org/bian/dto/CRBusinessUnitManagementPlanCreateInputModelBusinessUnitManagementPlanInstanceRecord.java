package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord
 */
public class CRBusinessUnitManagementPlanCreateInputModelBusinessUnitManagementPlanInstanceRecord   {
  private String businessUnitManagementPlanPeriod = null;

  private String businessUnitUsagePoliciesAndGuidelines = null;

  private String businessUnitPerformanceGoals = null;

  private String businessUnitOperatingSchedule = null;

  private String businessUnitOperatingOrganization = null;

  private String businessUnitResourcePlan = null;

  private String businessUnitTrainingPlan = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period addressed by the management plan (typically this will include setting the default daily operating goals and arrangements for the business unit that is periodically updated) 
   * @return businessUnitManagementPlanPeriod
  **/

  public String getBusinessUnitManagementPlanPeriod() {
    return businessUnitManagementPlanPeriod;
  }

  public void setBusinessUnitManagementPlanPeriod(String businessUnitManagementPlanPeriod) {
    this.businessUnitManagementPlanPeriod = businessUnitManagementPlanPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The policies and guidelines for business unit employees and service users 
   * @return businessUnitUsagePoliciesAndGuidelines
  **/

  public String getBusinessUnitUsagePoliciesAndGuidelines() {
    return businessUnitUsagePoliciesAndGuidelines;
  }

  public void setBusinessUnitUsagePoliciesAndGuidelines(String businessUnitUsagePoliciesAndGuidelines) {
    this.businessUnitUsagePoliciesAndGuidelines = businessUnitUsagePoliciesAndGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual business unit performance goals that are tracked by business unit management 
   * @return businessUnitPerformanceGoals
  **/

  public String getBusinessUnitPerformanceGoals() {
    return businessUnitPerformanceGoals;
  }

  public void setBusinessUnitPerformanceGoals(String businessUnitPerformanceGoals) {
    this.businessUnitPerformanceGoals = businessUnitPerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual business unit operating schedule - recording planned and actual business activity  
   * @return businessUnitOperatingSchedule
  **/

  public String getBusinessUnitOperatingSchedule() {
    return businessUnitOperatingSchedule;
  }

  public void setBusinessUnitOperatingSchedule(String businessUnitOperatingSchedule) {
    this.businessUnitOperatingSchedule = businessUnitOperatingSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The assigned roles and responsibilities and associated work/delivery responsibilities for the staff making up the business unit 
   * @return businessUnitOperatingOrganization
  **/

  public String getBusinessUnitOperatingOrganization() {
    return businessUnitOperatingOrganization;
  }

  public void setBusinessUnitOperatingOrganization(String businessUnitOperatingOrganization) {
    this.businessUnitOperatingOrganization = businessUnitOperatingOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the number and skill profile of the business unit staff (target and actual) 
   * @return businessUnitResourcePlan
  **/

  public String getBusinessUnitResourcePlan() {
    return businessUnitResourcePlan;
  }

  public void setBusinessUnitResourcePlan(String businessUnitResourcePlan) {
    this.businessUnitResourcePlan = businessUnitResourcePlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of staff training and certification as appropriate 
   * @return businessUnitTrainingPlan
  **/

  public String getBusinessUnitTrainingPlan() {
    return businessUnitTrainingPlan;
  }

  public void setBusinessUnitTrainingPlan(String businessUnitTrainingPlan) {
    this.businessUnitTrainingPlan = businessUnitTrainingPlan;
  }


}

