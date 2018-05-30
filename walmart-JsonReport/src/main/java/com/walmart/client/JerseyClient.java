package com.walmart.client;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClient {

	public static String clientRequest(String endPointUrl) {
		String responseString = null;
		try {

			Properties prop = new Properties();
			FileReader reader = new FileReader("endPointURLs.properties");
//			InputStream stream = loader.getResourceAsStream("");
			prop.load(reader);

			System.out.println("EndPoint URL:  " + prop.getProperty(endPointUrl));

			Client client = Client.create();

			WebResource webResource = client.resource(prop.getProperty(endPointUrl));

			ClientResponse clientResponse = webResource.accept("application/json").get(ClientResponse.class);
			if (clientResponse.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + clientResponse.getStatus());
			}

			responseString = clientResponse.getEntity(String.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseString;
	}

}