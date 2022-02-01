package com.crm.orgTest;



import org.testng.annotations.Test;

public class OrganizationTest {

	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest==>"+ System.getProperty("browser"));
		System.out.println("thiss is my secoiund commit");
		 String browser = System.getProperty("browser");
		 String ENV = System.getProperty("url");
		System.out.println("browser"+browser+",url"+ENV);
	}

	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}

}
