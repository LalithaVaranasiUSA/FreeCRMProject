package com.wbl.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.qa.base.TestBase;

public class MyAccountPage extends TestBase {

	@FindBy(xpath="//div[@id='top-header-menu']//span[@class='user-display']")
	WebElement username;
	
	@FindBy(xpath="//*[contains(text(),'Contacts')]")
	WebElement contacts;	
	
	@FindBy(xpath="//div[@id='top-header-menu']/div[@href='#']")
	WebElement img;
	
	@FindBy(xpath="//div[@id='main-nav']/a[@href='/calendar']/span[@class='item-text']")
	WebElement calendar;
	
	
	
	
	public MyAccountPage()
	{
		PageFactory.initElements(driver, this);	
	}
	
	public String verifyAccountPage()
	{
		return(username.getText());	
	}
	
	public boolean verifyImage()
	{
		return(img.isDisplayed());
	}
	
	public ContactsPage verifyContactsClick()
	{
		contacts.click();
		return(new ContactsPage());		
	}
	
	public Calendar verifyCalendarClick()
	{
		calendar.click();
		return(new Calendar());
	}
	
	
}
