package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class SearchProduct {

	@Test
	public void testSearchProduct() {

		String responseString = JerseyClient.clientRequest(APIEndPointsEnum.ProductSearchAPI.toString());
		ResponseValidator.validateProductSearchResponse(responseString);

	}

}
