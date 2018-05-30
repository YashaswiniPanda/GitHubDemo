package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class TrendingItems extends WalmartBaseTest {

	@Test
	public void testTrendingItems() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.TrendingItemsAPI.toString());
		ResponseValidator.validateTrendingItemsResponse(responseString);
	}
}
