package com.pk.atf.actor;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

import com.intuit.karate.http.HttpClient;
import com.intuit.karate.http.HttpRequestBuilder;

public class BasicAuthenticaton implements Authenticator {

	@Override
	public void authenticate(HttpRequestBuilder requestBuilder, AuthInfo authInfo, HttpClient client) {
		
		String username = authInfo.getUsername();
		String password = authInfo.getPassword();
		
		String encodeString = username+":"+password;
		try {
			String base64encodedString = Base64.getEncoder().encodeToString(encodeString.getBytes("utf-8"));
			requestBuilder.header("Authorization", "Basic "+base64encodedString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
