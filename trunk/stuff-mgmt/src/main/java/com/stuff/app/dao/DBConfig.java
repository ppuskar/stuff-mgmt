package com.stuff.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.stuff.app.constant.Constant;

/**
 * @author Illusion
 * 
 */
public class DBConfig {

	/**
	 * 
	 */
	private DBConfig() {
		throw new IllegalStateException(
				"Canot instantiate Singleton class DBConfig");
	}

	private static EntityManagerFactory factory;
	private static EntityManager entityManager;

	/**
	 * @return {@link EntityManagerFactory}
	 */
	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence
					.createEntityManagerFactory(Constant.JPA_PERSISTENCE_UNIT);

		}
		return factory;
	}
	
	
	/**
	 * @return {@link EntityManager}
	 */
	public static EntityManager getEntityManager()
	{
		if(entityManager == null)
		{
			entityManager = getEntityManagerFactory().createEntityManager();
		}
		return entityManager;
	}

}
