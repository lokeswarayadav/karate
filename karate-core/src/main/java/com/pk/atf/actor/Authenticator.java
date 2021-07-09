package com.pk.atf.actor;

import com.intuit.karate.http.HttpClient;
import com.intuit.karate.http.HttpRequestBuilder;

public interface Authenticator {
	
	public void authenticate(HttpRequestBuilder requestBuilder, AuthInfo authInfo, HttpClient client);

}
