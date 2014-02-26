/**
 * 
 */
package com.stuff.app.dao;

import com.stuff.app.entity.User;

/**
 * @author Praveen.Puskar
 *
 */
public abstract class UserDAO extends BaseDAO<User> {

	/**
	 * 
	 */
	public UserDAO() {
		super();
	}
	
	/**
	 * retreives user
	 * @param user
	 * @return
	 */
	public abstract User get(User user);


}
