package com.pk.atf.actor;

import com.intuit.karate.http.HttpClient;
import com.intuit.karate.http.HttpRequestBuilder;

public class APIKeyAuthenticaton implements Authenticator {

	@Override
	public void authenticate(HttpRequestBuilder requestBuilder, AuthInfo authInfo, HttpClient client) {

		String apikeyName = authInfo.getApikeyName();
		String apikeyValue = authInfo.getApikeyValue();
		String apikeyAddedTo = authInfo.getApikeyAddedTo();

		switch (apikeyAddedTo) {
		case "HEADER":
			requestBuilder.header(apikeyName, apikeyValue);
			break;
		case "COOKIE":
			requestBuilder.cookie(apikeyName, apikeyValue);
			break;
		case "REQUEST":
			String urlAndPath = requestBuilder.getUrlAndPath();
			String append = urlAndPath.indexOf('?') == -1 ? "?" : "&";
			urlAndPath = urlAndPath + append + apikeyName+"="+apikeyValue;
			requestBuilder.url(urlAndPath);
			break;
		default:
			break;
		}
	}

}
