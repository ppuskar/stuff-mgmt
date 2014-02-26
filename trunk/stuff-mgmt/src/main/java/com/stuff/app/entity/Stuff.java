package com.stuff.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * @author Illusion
 * 
 */
@Entity(name = "stuff_master")
public class Stuff{


	@Id
	@GeneratedValue
	@Column(name="stuff_id")
	private int stuffId;

	@Column(name = "stuff_name", nullable = false)
	private String stuffName;
	@Column(name = "stuff_description", nullable = false)
	private String stuffDescription;

	@ManyToOne(targetEntity=User.class)
	private User user;
	/**
	 * Default constructor
	 */
	public Stuff() {

	}

	/**
	 * @param stuffName
	 * @param stuffDescription
	 */
	public Stuff(String stuffName, String stuffDescription) {
		this.setStuffName(stuffName);
		this.stuffDescription = stuffDescription;
	}

	/**
	 * @return the stuffId
	 */
	public int getStuffId() {
		return stuffId;
	}

	/**
	 * @param stuffId
	 *            the stuffId to set
	 */
	public void setStuffId(int stuffId) {
		this.stuffId = stuffId;
	}

	/**
	 * @return the stuffDescription
	 */
	public String getStuffDescription() {
		return stuffDescription;
	}

	/**
	 * @param stuffDescription
	 *            the stuffDescription to set
	 */
	public void setStuffDescription(String stuffDescription) {
		this.stuffDescription = stuffDescription;
	}

	/**
	 * @return the stuffName
	 */
	public String getStuffName() {
		return stuffName;
	}

	/**
	 * @param stuffName
	 *            the stuffName to set
	 */
	public void setStuffName(String stuffName) {
		this.stuffName = stuffName;
	}

	@Override
	public String toString() {
		return "Stuff [stuffId=" + stuffId + ", stuffName=" + stuffName
				+ ", stuffDescription=" + stuffDescription + "]";
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
}
