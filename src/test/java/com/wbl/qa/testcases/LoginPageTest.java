package com.wbl.qa.testcases;

import org.testng.annotations.Test;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;
import com.wbl.qa.pages.MyAccountPage;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	HomePage hp;
	LoginPage lp;
	MyAccountPage map;
	
	public LoginPageTest()
	{
		super();
	}
	
	 @BeforeMethod
	  public void setUp() {
		 initialization();
		 hp=new HomePage();
		 lp=hp.login();		 
	  }	
	 
	
	 @Test
	 public void loginTest() {
		 map= lp.loginClick(prop.getProperty("username"), prop.getProperty("password"));
		 }
 

  @AfterMethod
  public void tearDown() {
	  driver.quit(); 
  }

}
