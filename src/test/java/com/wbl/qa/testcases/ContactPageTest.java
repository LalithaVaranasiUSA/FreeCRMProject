package com.wbl.qa.testcases;


import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.wbl.qa.base.TestBase;
import com.wbl.qa.pages.ContactsPage;
import com.wbl.qa.pages.HomePage;
import com.wbl.qa.pages.LoginPage;
import com.wbl.qa.pages.MyAccountPage;

public class ContactPageTest extends TestBase{
	HomePage hp;
	LoginPage lp;
	MyAccountPage ap;
   ContactsPage cp;
	
	public ContactPageTest()
	{
		super();
	}

	@BeforeClass
	public void setUp()
	{
		initialization();
		hp=new HomePage();
		lp=hp.login();
		ap=lp.loginClick(prop.getProperty("username"), prop.getProperty("password"));
		cp=ap.verifyContactsClick();
	}
	
	
	@Test(priority=1)
	public void verifyContactsLblTest()
	{
	assertTrue(cp.verifyContactsLbl(),"Contacts label is not displayed.");
	}
	
	@Test(priority=2)
	public void selectSingleContactsTest()
	{
		cp.selectContactsLbl("Lalitha hello Polepeddi");
	}
	
	@Test(priority=2)
	public void selectMultipleContactsTest()
	{
		cp.selectContactsLbl("Sumedha Varanasi");
		cp.selectContactsLbl("Krishna Varanasi");
		cp.selectContactsLbl("Nitya Varanasi");
	}
	@Test
	public void editSingleSelectTest()
	{
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
