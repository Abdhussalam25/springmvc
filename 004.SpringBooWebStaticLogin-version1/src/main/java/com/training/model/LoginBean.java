package com.training.model;

import java.util.Objects;

public class LoginBean {

	private String userName;
	private String password;
	public LoginBean() {
		super();
	}
	public LoginBean(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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
	@Override
	public String toString() {
		return "LoginBean==> userName=" + userName + ", password=" + password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginBean other = (LoginBean) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}
	

	public String validateUser(LoginBean loginBean) {
		String result = null;
		if(loginBean!=null && loginBean.getUserName() != null && loginBean.getPassword() != null) {
			if(loginBean.getUserName().equals("tutormines") && loginBean.getPassword().equals("admin123")) {
				result = "Hi" + loginBean.getUserName() + "you are welcome..";
				
				return result;
			}else {
				
				result = "please enter username and password";
				return result;
			}
		}else {
			   result = "username or password or both are invalid";
			return result;
		}
		
		
		
		
	
		
		
	}	
	
	
	
	
}
