package com.svkp.client;

import java.util.Scanner;

import com.svkp.entity.Company;
import com.svkp.service.CompanyServiceImp;
import com.svkp.service.CompanyService;

public class Client {

	public static void main(String[] args) {
	   CompanyService service =new CompanyServiceImp();
	   Company company = new Company ();
	   try {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Company data");
		   company.setCid(sc.nextInt());
		   company.setCname(sc.next());
		   company.setCprod(sc.next());
		   company.setprice(sc.nextInt());
		   service.addproduct(company);
		   
	   }
	   catch(Exception ex){
		   System.out.println("the entered input is not according to the type defiend");
		   
	   }
	   System.out.println("added company data");
	   

	}
	
	

}