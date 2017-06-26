package com.vishal;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class StringChange implements Callable {

	public Object onCall(MuleEventContext eventContext) throws Exception {
		String change = eventContext.getMessage().getPayloadAsString();
		
		String change1 = change.replaceAll("Vishal", "Sirisha");
				
		return change1;
	}
	
}
