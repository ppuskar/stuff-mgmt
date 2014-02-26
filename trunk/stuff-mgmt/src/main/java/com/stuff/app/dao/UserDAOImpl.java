package com.stuff.app.dao;

import java.util.List;

import javax.persistence.Query;

import com.stuff.app.entity.User;

/**
 * @author Illusion
 * 
 */
public class UserDAOImpl extends UserDAO {

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

	/* (non-Javadoc)
	 * @see com.stuff.app.dao.UserDAO#get(com.stuff.app.entity.User)
	 */
	@Override
	public User get(User user) {
		Query selectQuery = this.entityManager
				.createQuery("SELECT user FROM User user where user.email='"+user.getEmailId()+"'");
		return (User) selectQuery.getSingleResult();
	}

}
