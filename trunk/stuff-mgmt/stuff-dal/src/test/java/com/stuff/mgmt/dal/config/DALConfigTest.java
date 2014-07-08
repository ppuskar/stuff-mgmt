package com.stuff.mgmt.dal.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { DALConfig.class })
public class DALConfigTest {

	@Autowired
	EntityManager entityManager;

	@Autowired
	EntityManagerFactory entityManagerFactory;

	@Test
	public void testAutowire() {
		Assert.notNull(entityManager);
		Assert.notNull(entityManagerFactory);

	}
}
