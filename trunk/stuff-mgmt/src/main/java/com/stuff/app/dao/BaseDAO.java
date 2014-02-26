package com.stuff.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * @author Illusion
 * @param <T>
 * 
 */
public abstract class BaseDAO<T> {

	protected EntityManager entityManager;
	protected EntityTransaction transaction;

	/**
	 * 
	 */
	public BaseDAO() {

		this.entityManager = DBConfig.getEntityManager();
	}

	/**
	 * Starts a transaction
	 */
	public void beginTransaction() {
		this.transaction = this.entityManager.getTransaction();
		if (this.transaction.isActive()) {
			throw new IllegalStateException(
					"Transaction is already started, cannot start another transaction unless current transactio is closed.");
		}
		this.transaction.begin();
	}

	/**
	 * Commit the transaction
	 */
	public void commitTransaction() {
		this.transaction = this.entityManager.getTransaction();
		if (!this.transaction.isActive()) {
			throw new IllegalStateException("No active transaction to commit.");
		}
		this.transaction.commit();
	}
	
	/**
	 * Rollsback an ongoing transaction
	 */
	public void rollbackTransaction()
	{
		this.transaction = this.entityManager.getTransaction();
		if (!this.transaction.isActive()) {
			throw new IllegalStateException("No active transaction to rollback.");
		}
		this.transaction.rollback();
	}

	/**
	 * @param id
	 * @return <T>
	 */
	public abstract T getByID(String id);

	/**
	 * @return List<T>
	 */
	public abstract List<T> getAll();

	/**
	 * @param t
	 *            <T>
	 * @return status
	 */
	public abstract int update(T t);

	/**
	 * @param t
	 *            <T>
	 * @return status
	 */
	public abstract int delete(T t);

	/**
	 * @param id
	 * @return status
	 */
	public abstract int deleteById(String id);

	/**
	 * @param t
	 *            <T>
	 */
	public abstract void save(T t);

}
