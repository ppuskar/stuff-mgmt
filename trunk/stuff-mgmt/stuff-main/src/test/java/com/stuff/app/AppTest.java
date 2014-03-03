package com.stuff.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.stuff.app.entity.Stuff;

/**
 * Unit test for simple App.
 */
public class AppTest {

	/**
	 * 
	 */
	@Before
	public void testBefore() {
		System.out.println("\n\tTesting before");
	}

	/**
	 * 
	 */
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("\n\tTesting before class");
	}

	/**
	 * 
	 */
	@Test
	public void test_init_1() {
		System.out.println("\n\tTesting 1");
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
	        EntityManager manager = factory.createEntityManager();
	        App test = new App();

	        EntityTransaction tx = manager.getTransaction();
	        tx.begin();
	        try {
	            test.createStuff(manager);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        tx.commit();

	       // test.listEmployees();

	        System.out.println(".. done");
		Assert.assertTrue(true);
	}

	 
	 
	/**
	 * 
	 */
	@Test
	public void test_init_2() {
		System.out.println("\n\tTesting 2");
		Assert.assertTrue(true);
	}

	/**
	 * 
	 */
	@After
	public void test_after() {
		System.out.println("\n\tTesting after ");
	}

	/**
	 * 
	 */
	@AfterClass
	public static void test_after_class() {
		System.out.println("\n\tTesting after class");
	}
}
