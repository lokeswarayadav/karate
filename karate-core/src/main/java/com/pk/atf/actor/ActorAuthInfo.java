package com.pk.atf.actor;

public class ActorAuthInfo {
	
	private String actor;
	private AuthStrategy authStrategy;
	private AuthInfo authInfo;
	
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public AuthStrategy getAuthStrategy() {
		return authStrategy;
	}
	public void setAuthStrategy(AuthStrategy authStrategy) {
		this.authStrategy = authStrategy;
	}
	public AuthInfo getAuthInfo() {
		return authInfo;
	}
	public void setAuthInfo(AuthInfo authInfo) {
		this.authInfo = authInfo;
	}
	@Override
	public String toString() {
		return "ActorAuthInfo [actor=" + actor + ", authStrategy=" + authStrategy + ", authInfo=" + authInfo + "]";
	}
}

