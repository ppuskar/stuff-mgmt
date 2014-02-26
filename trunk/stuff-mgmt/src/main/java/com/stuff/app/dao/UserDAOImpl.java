package com.stuff.app.dao;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.stuff.app.entity.User;


	/**
	 * @author Illusion
	 * 
	 */
	public class UserDAOImpl extends BaseDAO<User> {

		@Override
		public User getByID(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<User> getAll() {
			Query selectQuery = this.entityManager
					.createQuery("SELECT user FROM User user");
			return ((List<User>) selectQuery.getResultList());
		}

		@Override
		public int update(User t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int delete(User t) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int deleteById(String id) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void save(User user) {
			beginTransaction();
			try {
				this.entityManager.persist(user);
				commitTransaction();
			} catch (Exception e) {
				e.printStackTrace();
				rollbackTransaction();
			}

		}

	}



