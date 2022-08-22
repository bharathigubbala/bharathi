package com.svkpo.Dao;
import com.svkp.entity.Company;

public interface CompanyDao {
	public abstract Company getCompanyById(int Cid);
    public abstract void addproduct(Company company);
    public abstract void updateproduct(Company company);
    public abstract void removeproduct(Company company);
    
    
    public abstract void begainTransaction();
    public abstract void commitTransaction();
    
}

