package com.obb.dao;

import java.io.Console;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.obb.Entity.Obb;


@Repository
@Transactional
public class ObbDaoImpl implements ObbDao {
	
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Obb> getAll() {
		TypedQuery<Obb> query = entityManager.createQuery("FROM Obb", Obb.class);
		List<Obb> obbList = query.getResultList();
		return obbList;
	}

	@Override
	public boolean signUp(Obb obb) {
		entityManager.persist(obb);
		return true;
	}

	@Override
	public List<Obb> login(String username, String userpassword) {
		List<Obb> obb;
		
			TypedQuery<Obb> query = entityManager.createQuery("FROM Obb where username = :username AND userpassword =:userpassword", Obb.class);
			
			query.setParameter("username", username);
			query.setParameter("userpassword", userpassword);

			 obb = query.getResultList();
			 	
		return obb;
	}

	@Override
	public boolean adminLogin(String id, String pass) {
		
		return id.equalsIgnoreCase("admin")&&pass.equalsIgnoreCase("admin");
	}

	@Override
	public Obb edit(Obb obb, String username) {
		Obb obb1;
		TypedQuery<Obb> query = entityManager.createQuery("FROM Obb where username = :username", Obb.class);
		query.setParameter("username", username);
		 obb1 = query.getSingleResult();
		 	
		 		obb1.setB_donor(obb.getB_donor());
				obb1.setB_group(obb.getB_group());
				obb1.setUserpassword(obb.getUserpassword());
				obb1.setCanDonate(obb.getCanDonate());
				obb1.setDate(LocalDate.now().toString());
				entityManager.merge(obb1);
		return obb1;
	}

	@Override
	public String delete() {
		TypedQuery<Obb> query = entityManager.createQuery("FROM Obb", Obb.class);
		List<Obb> obbList = query.getResultList();
		
		for (Obb obb : obbList) {
			
			String[] month=obb.getDate().split("-",3);
			System.err.println((Integer.parseInt(month[1])+3)==LocalDate.now().getMonthValue());
			
			if((Integer.parseInt(month[1])+3)==LocalDate.now().getMonthValue())
			{
				entityManager.remove(obb);
			}
		}
		
		
		return null;
		
	}

}
