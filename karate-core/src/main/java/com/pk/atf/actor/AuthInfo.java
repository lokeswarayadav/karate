package com.pk.atf.actor;

public class AuthInfo {
	private String username;
	private String password;
	private String authURL;
	private String tokenURL;
	private String clientId;
	private String clientSecret;
	private String scope;
	private String apikeyName;
	private String apikeyValue;
	private String apikeyAddedTo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAuthURL() {
		return authURL;
	}
	public void setAuthURL(String authURL) {
		this.authURL = authURL;
	}
	public String getTokenURL() {
		return tokenURL;
	}
	public void setTokenURL(String tokenURL) {
		this.tokenURL = tokenURL;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public String getApikeyName() {
		return apikeyName;
	}
	public void setApikeyName(String apikeyName) {
		this.apikeyName = apikeyName;
	}
	public String getApikeyValue() {
		return apikeyValue;
	}
	public void setApikeyValue(String apikeyValue) {
		this.apikeyValue = apikeyValue;
	}
	public String getApikeyAddedTo() {
		return apikeyAddedTo;
	}
	public void setApikeyAddedTo(String apikeyAddedTo) {
		this.apikeyAddedTo = apikeyAddedTo;
	}
	@Override
	public String toString() {
		return "AuthInfo [username=" + username + ", password=" + password + ", authURL=" + authURL + ", tokenURL="
				+ tokenURL + ", clientId=" + clientId + ", clientSecret=" + clientSecret + ", scope=" + scope
				+ ", apikeyName=" + apikeyName + ", apikeyValue=" + apikeyValue + ", apikeyAddedTo=" + apikeyAddedTo
				+ "]";
	}
}

