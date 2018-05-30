package com.walmart.validation;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ResponseValidator {

	public static void validateSearchItemResponse(String searchItemResponse) {

		JsonElement jelement = new JsonParser().parse(searchItemResponse);

		/*
		 * if(jelement.getAsJsonObject().get("errors").isJsonArray())
		 * assertFalse(jelement.getAsJsonObject().get("errors").isJsonArray(),
		 * "Error Code : "+jelement.getAsJsonObject().get("errors").
		 * getAsJsonArray().get(0).getAsJsonObject().get("code").getAsString()
		 * +" Error Message : "+jelement.getAsJsonObject().get("errors").
		 * getAsJsonArray().get(0).getAsJsonObject().get("message").getAsString(
		 * ));
		 */
		// TODO: handle exception

		JsonArray jarray = jelement.getAsJsonObject().get("items").getAsJsonArray();

		System.out.println(jarray.size());

		if (jarray.size() <= 1) {
			System.out.println("This is single Item Search");
		} else {
			System.out.println("This is multiple Item search");
		}

		System.out.println("And Item lists are as below ");

		for (JsonElement jsonElement : jarray) {

			System.out.println(jsonElement);

		}

	}

	public static void validateStoreLocatorResponse(String storeLocatorResponse) {

		JsonElement jelement = new JsonParser().parse(storeLocatorResponse);

		JsonArray jArray = jelement.getAsJsonArray();

		System.out.println("Number of stores located in neighborhood city Santa clar : " + jArray.size());

		for (JsonElement jsonElement : jArray) {

			System.out.println(jsonElement);

		}

	}

	public static void validateProductSearchResponse(String productSearchResponse) {
		JsonElement jelement = new JsonParser().parse(productSearchResponse);
		System.out.println(jelement);
		String searchQuery = jelement.getAsJsonObject().get("query").getAsString();
		System.out.println(searchQuery.equalsIgnoreCase("iPhone"));

		JsonArray jArray = jelement.getAsJsonObject().get("items").getAsJsonArray();

		System.out.println("Number of Items present: " + jArray.size());

		for (JsonElement jsonElement : jArray) {

			System.out.println("itemId :" + jsonElement.getAsJsonObject().get("itemId"));
			System.out.println("parentItemId : " + jsonElement.getAsJsonObject().get("parentItemId"));
			System.out.println("name :" + jsonElement.getAsJsonObject().get("name"));

		}

	}

	public static void validateTrendingItemsResponse(String trendingItemsResponse) {

		JsonElement jelement = new JsonParser().parse(trendingItemsResponse);

		JsonArray jArray = jelement.getAsJsonObject().get("items").getAsJsonArray();

		System.out.println("Number of Tredning items : " + jArray.size());

		for (JsonElement jsonElement : jArray) {

			System.out.println(jsonElement);

		}

	}

	public static void validatePaginationResponse(String paginationResponse) {

		JsonElement jelement = new JsonParser().parse(paginationResponse);

		System.out.println("Brand Name: " + jelement.getAsJsonObject().get("brand"));

		JsonArray jArray = jelement.getAsJsonObject().get("items").getAsJsonArray();

		System.out.println("Pagination Items : " + jArray.size());

		for (JsonElement jsonElement : jArray) {

			System.out.println(jsonElement);

		}

	}

	public static void validateCustomerReviewsResponse(String customerReviewResponse) {

		JsonElement jelement = new JsonParser().parse(customerReviewResponse);

		JsonObject jobject = jelement.getAsJsonObject();

		System.out.println(jobject);

	}

	public static void validateTaxonomyResponse(String taxonomyResponse) {

		JsonElement jelement = new JsonParser().parse(taxonomyResponse);

		JsonArray jsonArray = jelement.getAsJsonObject().get("categories").getAsJsonArray();

		System.out.println("Taxonomy Items count : " + jsonArray.size());

		for (JsonElement jsonElement : jsonArray) {

			System.out.println(jsonElement);

		}

	}

	public static void validateVODResponse(String vodResponse) {

		JsonElement jelement = new JsonParser().parse(vodResponse);

		JsonArray jsonArray = jelement.getAsJsonObject().get("categories").getAsJsonArray();

		System.out.println("VOD Items count : " + jsonArray.size());

		for (JsonElement jsonElement : jsonArray) {

			System.out.println(jsonElement);

		}

	}

}
