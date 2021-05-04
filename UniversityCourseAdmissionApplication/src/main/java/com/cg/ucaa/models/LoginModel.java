package com.cg.ucaa.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * This is a Model Class
 * 
 * @author Akshat Kumar
 *
 */
public class LoginModel {

	/**
	 * primary key
	 */
	@NotNull(message = "login Id cannot be null")
	private Long loginId;

	/**
	 * user name cannot be null/blank
	 **/
	@NotNull(message = "user name cannot be null")
	@NotBlank(message = "user name cannot be blank")
	private String userName;

	/**
	 * password cannot be null/blank
	 **/
	@NotNull(message = "password cannot be null")
	@NotBlank(message = "password cannot be blank")
	private String password;
	
	/**
	 * default constructor
	 **/
	public LoginModel() {
		/* no implementation */
	}

	/**
	 * parameterized constructor
	 **/
	public LoginModel(Long loginId, String userName, String password) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.password = password;
	}

	/**
	 * corresponding getters and setters
	 **/
	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * over-riding equals and hashCode() methods
	 **/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginModel other = (LoginModel) obj;
		if (loginId == null) {
			if (other.loginId != null)
				return false;
		} else if (!loginId.equals(other.loginId))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
	/**
	 * corresponding toString() method
	 **/
	@Override
	public String toString() {
		return String.format("LoginModel [loginId=%s, userName=%s, password=%s]", loginId, userName, password);
	}

}