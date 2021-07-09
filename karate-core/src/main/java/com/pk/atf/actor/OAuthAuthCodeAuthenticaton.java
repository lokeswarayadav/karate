package com.pk.atf.actor;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import com.intuit.karate.Json;
import com.intuit.karate.http.HttpClient;
import com.intuit.karate.http.HttpRequestBuilder;
import com.intuit.karate.http.Response;

public class OAuthAuthCodeAuthenticaton implements Authenticator {

	@Override
	public void authenticate(HttpRequestBuilder requestBuilder, AuthInfo authInfo, HttpClient client) {

		String tokenURL = authInfo.getTokenURL();
		String authURL = authInfo.getAuthURL();
		
		String clientId = authInfo.getClientId();
		String clientSecret = authInfo.getClientSecret();
		
		String username = authInfo.getUsername();
		String password = authInfo.getPassword();
		String encodeString = username+":"+password;
		
		String scope = authInfo.getScope();
		
		
		String requestBody="response_type=code&client_id="+clientId+"&scope="+scope+"&redirect_uri=http://localhost/";
		
		
		HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder(client);
		httpRequestBuilder.contentType("application/x-www-form-urlencoded");
		
		try {
			String base64encodedString = Base64.getEncoder().encodeToString(encodeString.getBytes("utf-8"));
			httpRequestBuilder.header("Authorization", "Basic "+base64encodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		httpRequestBuilder.url(authURL);
		httpRequestBuilder.method("POST");
		httpRequestBuilder.body(requestBody);
		
		Response response = httpRequestBuilder.invoke();
		
		String responseBody = response.getBodyAsString();
		System.out.println("Response Body --> "+responseBody);
		
		//Json json = response.json();
		//String accessToken = json.get("access_token",String.class);
		
		//requestBuilder.header("Authorization", "Bearer "+accessToken);

	}

}
