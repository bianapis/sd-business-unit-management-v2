/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface BusinessUnitManagementApiService {

	SDBusinessUnitManagementActivateOutputModel activate(SDBusinessUnitManagementActivateInputModel request);
	
	SDBusinessUnitManagementConfigureOutputModel configure(String sdReferenceId, SDBusinessUnitManagementConfigureInputModel request);
	
	CRBusinessUnitManagementPlanCreateOutputModel create(String sdReferenceId, CRBusinessUnitManagementPlanCreateInputModel request);
	
	BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request);
	
	CRBusinessUnitManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanExchangeInputModel request);
	
	SDBusinessUnitManagementFeedbackOutputModel feedback(String sdReferenceId, SDBusinessUnitManagementFeedbackInputModel request);
	
	BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRBusinessUnitManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanRequestInputModel request);
	
	CRBusinessUnitManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDBusinessUnitManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRBusinessUnitManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanUpdateInputModel request);
	
	BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
