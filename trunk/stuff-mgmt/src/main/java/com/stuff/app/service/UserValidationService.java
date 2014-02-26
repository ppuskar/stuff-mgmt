/**
 * 
 */
package com.stuff.app.service;

import com.stuff.app.dao.UserDAO;
import com.stuff.app.entity.User;

/**
 * @author Praveen.Puskar
 * 
 */
public class UserValidationService {

	/**
	 * 
	 */
	private static final String USER_EMAIL_ID_CANNOT_BE_NULL = "User emailID cannot be null.";
	/**
	 * 
	 */
	private static final String USER_CANNOT_BE_NULL = "User cannot be null.";
	private UserDAO userDAO;

	/**
	 * Constructor
	 */
	public UserValidationService() {

	}

	/**
	 * Tests if supplied user is valid
	 * 
	 * @param user
	 *            to validate
	 * @return true if valid user false other wise
	 */
	public boolean isUserValid(User user) {
		if (user == null) {
			throw new IllegalStateException(USER_CANNOT_BE_NULL);
		}
		if (user.getEmailId() == null) {
			throw new IllegalStateException(USER_EMAIL_ID_CANNOT_BE_NULL);
		}
		
		return false;
	}

	/**
	 * @return the userDAO
	 */
	public UserDAO getUserDAO() {
		return this.userDAO;
	}

	/**
	 * @param userDAO
	 *            the userDAO to set
	 */
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
