/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class BusinessUnitManagementApiServiceImpl implements BusinessUnitManagementApiService {

	public SDBusinessUnitManagementActivateOutputModel activate(SDBusinessUnitManagementActivateInputModel request){
		return JsonReader.read("activate-SDBusinessUnitManagementActivateOutputModel.json",new TypeReference<SDBusinessUnitManagementActivateOutputModel>(){});
	}
	
	public SDBusinessUnitManagementConfigureOutputModel configure(String sdReferenceId, SDBusinessUnitManagementConfigureInputModel request){
		return JsonReader.read("configure-SDBusinessUnitManagementConfigureOutputModel.json",new TypeReference<SDBusinessUnitManagementConfigureOutputModel>(){});
	}
	
	public CRBusinessUnitManagementPlanCreateOutputModel create(String sdReferenceId, CRBusinessUnitManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRBusinessUnitManagementPlanCreateOutputModel.json",new TypeReference<CRBusinessUnitManagementPlanCreateOutputModel>(){});
	}
	
	public BQTroubleshootingCreateOutputModel createTroubleshooting(String sdReferenceId, String crReferenceId, BQTroubleshootingCreateInputModel request){
		return JsonReader.read("create-BQTroubleshootingCreateOutputModel.json",new TypeReference<BQTroubleshootingCreateOutputModel>(){});
	}
	
	public CRBusinessUnitManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRBusinessUnitManagementPlanExchangeOutputModel.json",new TypeReference<CRBusinessUnitManagementPlanExchangeOutputModel>(){});
	}
	
	public SDBusinessUnitManagementFeedbackOutputModel feedback(String sdReferenceId, SDBusinessUnitManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDBusinessUnitManagementFeedbackOutputModel.json",new TypeReference<SDBusinessUnitManagementFeedbackOutputModel>(){});
	}
	
	public BQPerformanceRequestOutputModel requestPerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceRequestInputModel request){
		return JsonReader.read("request-BQPerformanceRequestOutputModel.json",new TypeReference<BQPerformanceRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRBusinessUnitManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRBusinessUnitManagementPlanRequestOutputModel.json",new TypeReference<CRBusinessUnitManagementPlanRequestOutputModel>(){});
	}
	
	public CRBusinessUnitManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRBusinessUnitManagementPlanRetrieveOutputModel.json",new TypeReference<CRBusinessUnitManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPerformanceRetrieveOutputModel retrievePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPerformanceRetrieveOutputModel.json",new TypeReference<BQPerformanceRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDBusinessUnitManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDBusinessUnitManagementRetrieveOutputModel.json",new TypeReference<SDBusinessUnitManagementRetrieveOutputModel>(){});
	}
	
	public CRBusinessUnitManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRBusinessUnitManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRBusinessUnitManagementPlanUpdateOutputModel.json",new TypeReference<CRBusinessUnitManagementPlanUpdateOutputModel>(){});
	}
	
	public BQPerformanceUpdateOutputModel updatePerformance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPerformanceUpdateInputModel request){
		return JsonReader.read("update-BQPerformanceUpdateOutputModel.json",new TypeReference<BQPerformanceUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
