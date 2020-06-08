package com.wbl.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.qa.base.TestBase;

public class HomePage extends TestBase	{
	
	//Page Factory - OR
	@FindBy(xpath="/html//div[@class='page']/header/div[@class='rd-navbar-wrap']/nav[@class='rd-navbar rd-navbar-original rd-navbar-static']//ul[@class='rd-navbar-nav']/a[@href='https://ui.freecrm.com']")
	WebElement loginBtn;
		
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods or Actions

	public String validHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public LoginPage login()
	{
		loginBtn.click();
		return(new LoginPage());	 
	}
	

}
