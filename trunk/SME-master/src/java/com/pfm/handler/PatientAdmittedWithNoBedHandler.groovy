package com.pfm.handler

import java.util.Map;

import patientflowmonitoring.Patient;
import patientflowmonitoring.PatientState;
import patientflowmonitoring.Event.EventName;
import patientflowmonitoring.PatientState.PatientStateName;
import patientflowmonitoring.Admission;

class PatientAdmittedWithNoBedHandler extends EventHandler {

	@Override
	public Object process(Map props) {
		
		event.eventName = EventName.PatientAdmittedWithNoBed
		
		def Admission admission = new Admission()
		admission.setTimeStamp(createTimeStamp(props['timestamp']))
		admission.save()
		
		return null;
	}

}
