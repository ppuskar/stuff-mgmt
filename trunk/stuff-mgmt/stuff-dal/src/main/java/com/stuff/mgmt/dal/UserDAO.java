package com.stuff.mgmt.dal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.stuff.mgmt.model.User;

public class UserDAO extends BaseDAO {

	public void saveUser(User user) {

		EntityManager manager = entityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(user);
		transaction.commit();
	}

	public int delete(int userId) {
		EntityManager manager = entityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query createNamedQuery = manager.createNamedQuery("delete from user_master");
		int executeUpdate = createNamedQuery.executeUpdate();
		
		transaction.commit();
		return executeUpdate;
	}

	public User update(User user) {
		return null;
	}

}
