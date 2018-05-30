package com.walmart.test;

import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class Taxonomy extends WalmartBaseTest {

	@Test
	public void testTaxonomy() {

		responseString = JerseyClient.clientRequest(APIEndPointsEnum.TaxonomyAPI.toString());
		
		ResponseValidator.validateTaxonomyResponse(responseString);

	}

}
