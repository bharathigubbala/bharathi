package com.svkpo.Dao;
import javax.persistence.EntityManager;

import com.svkp.entity.Company;


public class CompanyDaoImp implements CompanyDao {
	private EntityManager entityManager;
	public CompanyDaoImp(EntityManager entityManager) {
		super();
		this.entityManager = JPAUtil.getEntityManager();
		
	}

	public Company getCompanyById(int cid) {
	  Company company=entityManager.find(Company.class,cid);
		return company;
	}

	public void addproduct(Company company) {
		entityManager.persist(company);
		
	}

	public void updateEmployee(Company company) {
		entityManager.merge(company);
	}

	public void removeproduct(Company company) {
		entityManager.remove(company);
	}

	public void begainTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void updateproduct(Company company) {
		// TODO Auto-generated method stub
		
	}

}


