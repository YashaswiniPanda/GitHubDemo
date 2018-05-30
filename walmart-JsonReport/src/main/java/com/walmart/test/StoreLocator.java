package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class StoreLocator {

	@Test
	public void testStoreLocator() {

		String url = APIEndPointsEnum.StoreLocatorAPI.toString();

		String stringResponse = JerseyClient.clientRequest(url);
		ResponseValidator.validateStoreLocatorResponse(stringResponse);

	}
}
