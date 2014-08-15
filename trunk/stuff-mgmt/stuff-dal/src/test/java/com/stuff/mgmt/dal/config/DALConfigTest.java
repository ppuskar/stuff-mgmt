package com.stuff.mgmt.dal.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.stuff.mgmt.dal.UserDAO;
import com.stuff.mgmt.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DALConfig.class })
public class DALConfigTest {

	@Autowired
	EntityManager entityManager;

	@Autowired
	EntityManagerFactory entityManagerFactory;

	@Autowired
	UserDAO userDao;

	@Test
	public void testAutowire() {
		Assert.notNull(entityManager);
		Assert.notNull(entityManagerFactory);
		Assert.notNull(userDao);

	}


	public void testUser() {
		User user = new User();
		user.setEmailId("tesmp@temp.com");
		user.setUserName("test");

		userDao.saveUser(user);
	}

	@Before
	public void setUp() {
		//delete();
	}

	@After
	public void tearDown() {
		 //delete();
	}

	public int delete() {
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		Query createNativeQuery = entityManager
				.createNativeQuery("delete from user_master");
		int executeUpdate = createNativeQuery.executeUpdate();

		transaction.commit();
		return executeUpdate;
	}

	@Test
	public void testUpdateUser() {
//		userDao.update(null);
//		Assert.isTrue(false);
	}

}
