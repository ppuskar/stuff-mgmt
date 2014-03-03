package com.stuff.app;

import java.util.List;

import javax.persistence.EntityManager;

import com.stuff.app.dao.BaseDAO;
import com.stuff.app.dao.UserDAOImpl;
import com.stuff.app.entity.Stuff;
import com.stuff.app.entity.User;

/**
 * Hello world!
 * 
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// EntityManagerFactory factory =
		// Persistence.createEntityManagerFactory("persistenceUnit");
		// EntityManager manager = factory.createEntityManager();
		// App test = new App();
		//
		// EntityTransaction tx = manager.getTransaction();
		// tx.begin();
		// try {
		// test.createStuff(manager);
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		// tx.commit();

		User user = new User();
		user.setEmailId("puskar.praveen@gmail.com");
		user.setStuffList(null);
		//user.setUserId(1);
		user.setUserName("Praveen Puskar");

		BaseDAO<User> dao = new UserDAOImpl();
		// test.listEmployees();
		dao.save(user);

		for (User userTemp : dao.getAll()) {

			System.out.println("User :" + userTemp.toString());
		}
		System.out.println(".. done");
	}

	public void createStuff(EntityManager manager) {

		manager.persist(new Stuff("Purse", " It has money"));
		manager.persist(new Stuff("Smart phone", "It can make calls"));

	}

	// private void listEmployees() {
	// List<Stuff> resultList = manager.createQuery("Select a From Stuff a",
	// Stuff.class).getResultList();
	// System.out.println("num of stuffs:" + resultList.size());
	// for (Stuff next : resultList) {
	// System.out.println("next stuff: " + next);
	// }
	// }

}
