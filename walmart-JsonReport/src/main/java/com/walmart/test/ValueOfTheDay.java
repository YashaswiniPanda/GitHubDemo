package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class ValueOfTheDay extends WalmartBaseTest {

	@Test(enabled = false)
	public void testValueOfTheDay() {

		responseString = JerseyClient.clientRequest(APIEndPointsEnum.VODAPI.toString());

		ResponseValidator.validateVODResponse(responseString);

	}

}
