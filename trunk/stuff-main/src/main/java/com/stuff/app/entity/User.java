package com.stuff.app.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Illusion
 * 
 */
@Entity(name = "user_master")
public class User {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name = "user_name", unique = true, nullable = false)
	private String userName;
	@Column(name = "email")
	private String emailId;

	@OneToMany(mappedBy="user")
	private List<Stuff> stuffList;
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", emailId=" + emailId + "]";
	}

	/**
	 * @return the stuffList
	 */
	public List<Stuff> getStuffList() {
		return stuffList;
	}

	/**
	 * @param stuffList the stuffList to set
	 */
	public void setStuffList(List<Stuff> stuffList) {
		this.stuffList = stuffList;
	}

}