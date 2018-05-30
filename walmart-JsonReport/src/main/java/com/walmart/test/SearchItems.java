package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class SearchItems {

	@Test
	public void testSearchItems() {

		String responseString = JerseyClient.clientRequest(APIEndPointsEnum.ItemsSearchAPI.toString());

		ResponseValidator.validateSearchItemResponse(responseString);
	}

}
