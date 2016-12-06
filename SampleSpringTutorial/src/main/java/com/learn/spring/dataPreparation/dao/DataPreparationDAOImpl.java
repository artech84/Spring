package com.learn.spring.dataPreparation.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dataPreparationDAO")
public class DataPreparationDAOImpl implements DataPreparationDAO {

	@Autowired(required=true)
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
}
