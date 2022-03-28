package com.training.restapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user2")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="userid")
	private Integer userId;
	
	@Column(name="userfirstname")
	private String userFirstName;
	
	@Column(name="userlastname")
	private String userLastName;
	
	@Column(name="useremailid")
	private String userEmailId;
	
	@Column(name="usercontact")
	private String userContact;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmailId() {
		return userEmailId;
	}
	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public User() {

	}
	public User(Integer userId, String userFirstName, String userLastName, String userEmailId, String userContact) {
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmailId = userEmailId;
		this.userContact = userContact;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userEmailId=" + userEmailId + ", userContact=" + userContact + "]";
	}
}
