/**
 * 
 */
package com.stuff.app.service;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Praveen.Puskar
 * 
 */
public class UserValitdationServiceTest {

	private UserValidationService userValidationService;


	@Before
	public void init() {
		this.userValidationService = new UserValidationService();
	}

	@Ignore
	public void should_return_true_for_valid_user() {
		Assert.assertTrue(this.userValidationService.isUserValid(null));
	}
	
	@Ignore
	public void should_return_false_for_invalid_user() {
		Assert.assertTrue(this.userValidationService.isUserValid(null));
	}

}
