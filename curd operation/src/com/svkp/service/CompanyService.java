package com.svkp.service;

import com.svkp.entity.*;

public interface CompanyService
{
public abstract Company getCompanyById(int cid);
public abstract void addproduct(Company company);
public abstract void updateproduct(Company company);
public abstract void removeproduct(Company company);
void removeCompany(Company company);
}
