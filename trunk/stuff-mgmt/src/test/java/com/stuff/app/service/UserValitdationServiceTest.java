/**
 * 
 */
package com.stuff.app.service;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.stuff.app.dao.UserDAO;
import com.stuff.app.entity.User;

/**
 * @author Praveen.Puskar
 * 
 */
public class UserValitdationServiceTest {

	private UserValidationService userValidationService;

	private UserDAO userDAOMock;

	@Before
	public void init() {
		this.userValidationService = new UserValidationService();
		this.userDAOMock = Mockito.mock(UserDAO.class);
		this.userValidationService.setUserDAO(this.userDAOMock);
	}

	@Test
	public void should_return_true_for_valid_user() {
		User user=new User();
		user.setEmailId("Test@test.com");
		
		Mockito.when(this.userDAOMock.get(user)).thenReturn(user);
		
		Assert.assertTrue(this.userValidationService.isUserValid(user));
		Mockito.verify(userDAOMock, Mockito.times(1)).get(user);
	}

	@Test
	public void should_return_false_for_invalid_user() {
		User user=new User();
		user.setEmailId("Test@test.com");
		
		Mockito.when(this.userDAOMock.get(user)).thenReturn(null);
		
		Assert.assertFalse(this.userValidationService.isUserValid(user));
		Mockito.verify(userDAOMock, Mockito.times(1)).get(user);
	}

}
