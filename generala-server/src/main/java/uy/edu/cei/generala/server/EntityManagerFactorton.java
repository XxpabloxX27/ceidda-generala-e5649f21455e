package uy.edu.cei.generala.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import uy.edu.cei.generala.domain.UserModel;

public class EntityManagerFactorton {
	
	private EntityManager EM ;
	private static EntityManagerFactorton instance = null;
	
	private EntityManagerFactorton(){
		
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("jpaDS");
		EM = emf.createEntityManager();
		EM.getTransaction().begin();
		UserModel u  = new UserModel("pablo","123");
		UserModel u2 = new UserModel("gaston","123");
		EM.persist(u);
		EM.persist(u2);
		EM.getTransaction().commit();
	}
	
	public static EntityManagerFactorton GetInstance() {
		if(instance == null) {
			instance = new EntityManagerFactorton();
		}
		return instance;
	}
	
	public EntityManager getEm() {
		
		return this.EM;
	}

}
