package uy.edu.cei.generala.server.services.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import uy.edu.cei.generala.domain.UserModel;
import uy.edu.cei.generala.server.EntityManagerFactorton;
import uy.edu.cei.generala.server.services.UserService;

public class UserServiceInDb implements UserService{

	@Override
	public UserModel findUserByUsername(String username) {
		UserModel userModel = null;
		EntityManagerFactorton emf = EntityManagerFactorton.GetInstance();
		EntityManager em = emf.getEm();
		
		em.getTransaction().begin();
		/*
		@SuppressWarnings("unchecked")
		UserModel userModel =  (UserModel) em.createQuery(
			    "SELECT user FROM users user WHERE user.username = :username")
			    .setParameter("username", username)
			    .getSingleResult();
			*/
		
		TypedQuery<UserModel> query  = em.createNamedQuery("UserModel.findByUsername", UserModel.class);
		query.setParameter("username", username);
		List<UserModel> results = query.getResultList();
		if(!results.isEmpty()) {
			userModel = query.getSingleResult();
		}
		em.getTransaction().commit();
		return userModel;
		
	}

	
	
	
}
