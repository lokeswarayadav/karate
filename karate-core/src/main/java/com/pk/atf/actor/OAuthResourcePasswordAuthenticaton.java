package com.pk.atf.actor;

import com.intuit.karate.Json;
import com.intuit.karate.http.HttpClient;
import com.intuit.karate.http.HttpRequestBuilder;
import com.intuit.karate.http.Response;

public class OAuthResourcePasswordAuthenticaton implements Authenticator {

	@Override
	public void authenticate(HttpRequestBuilder requestBuilder, AuthInfo authInfo, HttpClient client) {

		String tokenURL = authInfo.getTokenURL();
		String clientId = authInfo.getClientId();
		String clientSecret = authInfo.getClientSecret();
		String username = authInfo.getUsername();
		String password = authInfo.getPassword();
		
		String requestBody="grant_type=password&client_id="+clientId+"&client_secret="+clientSecret+"&username="+username+"&password="+password;
		
		HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder(client);
		httpRequestBuilder.contentType("application/x-www-form-urlencoded");
		httpRequestBuilder.url(tokenURL);
		httpRequestBuilder.method("POST");
		httpRequestBuilder.body(requestBody);
		
		Response response = httpRequestBuilder.invoke();
		
		String responseBody = response.getBodyAsString();
		System.out.println("Response Body --> "+responseBody);
		
		Json json = response.json();
		String accessToken = json.get("access_token",String.class);
		
		requestBuilder.header("Authorization", "Bearer "+accessToken);

	}

}
