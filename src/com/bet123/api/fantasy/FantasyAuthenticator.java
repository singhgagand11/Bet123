package com.bet123.api.fantasy;

import java.util.HashMap;

import com.bet123.api.IAuthenticator;

public final class FantasyAuthenticator implements IAuthenticator {

	/**
	 * Fantasy Auth. Header Name
	 */
	private static String authHeaderName = "Ocp-Apim-Subscription-Key";
	
	/**
	 * Authentication key -- TODO: move to external config
	 */
	private final String authToken = "c05f95fec26e4d48aa7f58f4c4eb0525";
	
	/**
	 * Auth headers
	 */
	private final HashMap<String, String> authHeaders;
	
	/*
	 * Initializes a new instance of <see>FantasyAuthenticator</see>
	 */
	public FantasyAuthenticator()
	{
		this.authHeaders = new HashMap<String, String>(1);
		this.authHeaders.put(FantasyAuthenticator.authHeaderName, this.authToken);
	}
	
	@Override
	public HashMap<String, String> GetAuthHeaders() {
		return this.authHeaders;
	}

}
