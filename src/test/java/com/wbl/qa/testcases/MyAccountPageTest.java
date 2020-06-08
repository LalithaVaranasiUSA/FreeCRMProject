package com.wbl.qa.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.qa.pages.Calendar;
import com.wbl.qa.pages.ContactsPage;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;
import com.wbl.qa.pages.MyAccountPage;


public class MyAccountPageTest extends MyAccountPage {
	
	HomePage hp;
	LoginPage lp;
	MyAccountPage map;
	Calendar cl;
	ContactsPage cnt;
	
	
	public MyAccountPageTest()
	{
		super();
	}
	
	 @BeforeClass
	  public void setUp() {
		 initialization();
		 hp=new HomePage();
		 lp=hp.login();	 
	  }	
	
	 @Test(priority=1)
	 public void loginTest() {
		 map= lp.loginClick(prop.getProperty("username"), prop.getProperty("password"));
		// assertEquals(map.verifyAccountPage(),"Lalitha Polepeddi", "Not an expected page.");

	 }
	@Test(priority=2)
	public void verifyAccountPageTest()
	{
		assertEquals(map.verifyAccountPage(),"Lalitha Polepeddi", "Not an expected page.");
	}
	@Test(priority=3)
	public void verifyContactsClickTest()
	{
		cnt=map.verifyContactsClick();
	}
	@Test(priority=4)
	public void verifyCalendarTest()
	{
		cl=map.verifyCalendarClick();
	}
	@Test(priority=5)
	public void verifyImageTest()
	{
		assertTrue(map.verifyImage(), "Image should be displayed.");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	
}
