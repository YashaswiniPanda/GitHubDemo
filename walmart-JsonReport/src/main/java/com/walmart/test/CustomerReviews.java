package com.walmart.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class CustomerReviews extends WalmartBaseTest {

	@BeforeMethod
	public void setUp() {
		super.jsonObject.addProperty("results", "TestResults");
	}

	@Test(enabled = true)
	public void testCustomerReviews() {
		responseString = JerseyClient.clientRequest(APIEndPointsEnum.CustomerReviewAPI.toString());

		jsonObject.addProperty("TestData", "CTN");
		
		System.out.println(jsonObject);

		ResponseValidator.validateCustomerReviewsResponse(responseString);
	}
}
