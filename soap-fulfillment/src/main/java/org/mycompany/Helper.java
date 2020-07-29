package org.mycompany;

import org.example.s2.FulfillmentResponse;

public class Helper {

	int counter = 100000;

    public FulfillmentResponse setResponse()
    {
    	FulfillmentResponse response = new FulfillmentResponse();

    	response.setStatus("success");
    	response.setIdentifier(String.format("%010d", counter++));

    	return response;
    }
}