package com.walmart.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.walmart.base.APIEndPointsEnum;
import com.walmart.base.WalmartBaseTest;
import com.walmart.client.JerseyClient;
import com.walmart.validation.ResponseValidator;

public class Pagination extends WalmartBaseTest {

	public String env = "UT";
	public String CTN = "UT";

	// TestData testdata = new TestData("8562147383", 4545, 95051);

	// @Parameters({ "datasource", "jdbcDriver" ,"testdata"})
	// @Test(dataProvider = "test1")
	// public void testPagination(String n1, int n2, TestData testData) {
	//
	// System.out.println(n1 + " " + n2 + " " + testData.ctn);
	//
	// // responseString =
	// // JerseyClient.clientRequest(APIEndPointsEnum.PaginationAPI.toString());
	// // ResponseValidator.validatePaginationResponse(responseString);
	//
	// }
	//
	// @DataProvider(name = "test1")
	// public Object[][] createData1() {
	// return new Object[][] { { env, new Integer(36), testdata } };
	// }
	//
	//
	@Parameters({ "datasource", "jdbcDriver", "testdata" })
	@Test
	public void testPagination(String ds, String jd, String data) {
		Map<String, Object> computedItems = new HashMap<>();
		// computedItems.put("credentials", testdata);
		// Lets assume that the computedItems is what we need to save for
		// retrieval from our reports.

		responseString = JerseyClient.clientRequest(APIEndPointsEnum.PaginationAPI.toString());
		ResponseValidator.validatePaginationResponse(responseString);

		// ITestResult testResult = Reporter.getCurrentTestResult();
		// testResult.setAttribute("TestData", computedItems);
		// testResult.setAttribute("ExecutionEnv", "UT");
	}

}
