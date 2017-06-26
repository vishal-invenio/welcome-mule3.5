package com.vishal;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class StringChangeAMT extends AbstractMessageTransformer{

	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		Object ch= message.getPayload();
		String change = ch.toString();
		String change1 = change.replaceAll("Vishal", "Sirisha");
		return change1;
	}

}
