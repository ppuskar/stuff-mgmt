package com.stuff.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Illusion
 * 
 */
@Entity(name = "expense_master")
public class Expense{

	@Id
	@Column(name = "expense_id")
	private long expenseId;
	@Column(name = "date_time")
	private Date dateTime;
	@Column(name = "description")
	private String description;

	/**
	 * @return the expenseId
	 */
	public long getExpenseId() {
		return expenseId;
	}

	/**
	 * @param expenseId
	 *            the expenseId to set
	 */
	public void setExpenseId(long expenseId) {
		this.expenseId = expenseId;
	}

	/**
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * @param dateTime
	 *            the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
