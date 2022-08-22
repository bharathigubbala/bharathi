package com.svkp.service;

import com.svkp.entity.Company;
import com.svkp.service.CompanyServiceImp;
import com.svkpo.Dao.CompanyDao;
import com.svkpo.Dao.CompanyDaoImp;
import com.svkp.service.CompanyService;
public class CompanyServiceImp implements CompanyService {
	
	private CompanyDao dao;

	public CompanyServiceImp() {
		dao= new CompanyDaoImp(null);
	}
	@Override
public Company getCompanyById(int cid) {
		Company company=dao.getCompanyById(cid);
		return null;
	}

	public void addproduct(Company company) {
		dao.begainTransaction();
		dao.addproduct(company);
		dao.commitTransaction();
	}

	@Override
	public void updateproduct(Company company) {
		dao.begainTransaction();
		dao.updateproduct(company);
		dao.commitTransaction();
		
	}

	@Override
	public void removeproduct(Company company) {
		dao.begainTransaction();
		dao.removeproduct(company);
		dao.commitTransaction();
		
	}
	public CompanyDao getDao() {
		return dao;
	}
	public void setDao(CompanyDao dao) {
		this.dao = dao;
	}
	@Override
	public void removeCompany(Company company) {
		// TODO Auto-generated method stub
		
	}
	
	


}
