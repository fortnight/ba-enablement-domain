package com.redhat;

import java.util.Collection;

public class RuleResponse {

	@KieQuery(binding = "$business", queryName = "Get Business")
	private Business business;
	
	private String responseCode; // e.g. success, failure, filtered, validation error...

	@KieQuery(binding = "$reason", queryName = "Get Reasons")	
	private Collection<Reason> reasons; // messages about why the response Code came bacl

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public Collection<Reason> getReasons() {
		return reasons;
	}

	public void setReasons(Collection<Reason> reasons) {
		this.reasons = reasons;
	}

}
