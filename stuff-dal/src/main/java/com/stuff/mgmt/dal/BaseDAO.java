package com.stuff.mgmt.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAO {

	@Autowired
	protected EntityManagerFactory factory;

	public EntityManager entityManager() {
		return factory.createEntityManager();
	}

	public void beginTransaction() {

	}

	public void closeTransaction() {

	}

	public void beginTransaction(EntityManager manager) {
		// TODO Auto-generated method stub
		
	}
}
