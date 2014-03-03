package com.web.stuff.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *  APIError class representing friendly error format
 * */
@XmlRootElement(name = "InfoResponse")
public class InfoResponse implements ResponseWrapper {
	/**
	 * status code of failure which has occurred at service processing
	 */
	private Integer returnCode;
	/**
	 * Friendly error message. 
	 */
	private String message;
	
	public InfoResponse()
	{
		
	}

	public InfoResponse(int returnCode, String message) {
		this.returnCode = returnCode;
		this.message = message;
	}

	/**
	 * @return the status code of failure which has occurred at service processing
	 */
	@XmlElement(name = "ErrorCode")
	public Integer getReturnCode() {
		return returnCode;
	}

	/**
	 * the status code of failure which has occurred at service processing
	 * @param returnCode
	 */
	public void setReturnCode(Integer returnCode) {
		this.returnCode = returnCode;
	}

	/**
	 * the status message of failure which has occurred at service processing
	 * @return the message
	 */
	@XmlElement(name = "ResponseMessage")
	public String getMessage() {
		return message;
	}

	/**
	 * the status message of failure which has occurred at service processing
	 * @param message friendly failure message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InfoResponse [returnCode=" + returnCode + ", Response=" + message
				+ "]";
	}
	

}