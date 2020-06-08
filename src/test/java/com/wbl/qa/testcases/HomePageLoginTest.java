package com.wbl.qa.testcases;

import org.testng.annotations.Test;
import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class HomePageLoginTest extends TestBase{
	HomePage home;
	LoginPage login;
	
	public HomePageLoginTest()
	{
		super();
	}
	
	@BeforeMethod
	  public void setUp() {
		initialization();
		home=new HomePage();
		
	  }
	
	 @Test(priority=1)
     public void HomePageTitleTest() {
		 assertEquals(home.validHomePageTitle(),"Free CRM #1 cloud software for any business large or small");
    }
	 @Test(priority=2)
	 public void loginTest()
	 {
		 login=home.login();
	 }
	
	
	@AfterMethod
	  public void tearDown()
	  {
		driver.quit();
	  }
   
  

}
