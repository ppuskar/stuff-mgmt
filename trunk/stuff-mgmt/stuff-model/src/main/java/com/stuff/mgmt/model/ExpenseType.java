package com.stuff.mgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "expense_type")
public class ExpenseType {

	@Id
	@GeneratedValue
	@Column(name = "expense_type_id")
	private int expenseTypeId;

	@Column(name = "expense_type")
	private String expenseType;

	@Column(name = "description")
	private String description;

	/**
	 * @return the expenseTypeId
	 */
	public int getExpenseTypeId() {
		return expenseTypeId;
	}

	/**
	 * @param expenseTypeId
	 *            the expenseTypeId to set
	 */
	public void setExpenseTypeId(int expenseTypeId) {
		this.expenseTypeId = expenseTypeId;
	}

	/**
	 * @return the expenseType
	 */
	public String getExpenseType() {
		return expenseType;
	}

	/**
	 * @param expenseType
	 *            the expenseType to set
	 */
	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
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
	};

}
