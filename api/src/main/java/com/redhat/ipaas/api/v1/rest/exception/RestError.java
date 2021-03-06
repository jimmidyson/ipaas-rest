/**
 * Copyright (C) 2016 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.ipaas.api.v1.rest.exception;

public class RestError {
	
	String developerMsg;
	String userMsg;
	Integer errorCode;

	public RestError() {
		super();
	}
	
	public RestError(String developerMsg, String userMsg, Integer errorCode) {
		super();
		this.developerMsg = developerMsg;
		this.userMsg = userMsg;
		this.errorCode = errorCode;
	}
	public String getDeveloperMsg() {
		return developerMsg;
	}
	public void setDeveloperMsg(String developerMsg) {
		this.developerMsg = developerMsg;
	}
	public String getUserMsg() {
		return userMsg;
	}
	public void setUserMsg(String userMsg) {
		this.userMsg = userMsg;
	}
	public Integer getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
}

