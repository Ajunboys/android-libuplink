package io.storj;

import java.io.Serializable;

public class ApiKey implements Serializable {
	
	private static final long serialVersionUID = 7096529321479799953L;
	
	private io.storj.libuplink.mobile.APIKey apiKey;
	
	public ApiKey(String serializedApiKey) throws StorjException {
		try {
			this.apiKey = io.storj.libuplink.mobile.Mobile.parseAPIKey(serializedApiKey);
		} catch (Exception e) {
			throw ExceptionUtil.toStorjException(e);
		}
	}
	
	public String serialize() {
		return apiKey.serialize();
	}

}