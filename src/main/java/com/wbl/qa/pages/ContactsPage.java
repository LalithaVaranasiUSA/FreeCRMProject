package com.wbl.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.util.TestUtil;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//div[@id='dashboard-toolbar']/div[1]")
	WebElement contactsLbl;	
	
	public ContactsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyContactsLbl()
	{	
		return(contactsLbl.isDisplayed());
	}

	public void selectContactsLbl(String name)
	{
		driver.findElement(By.xpath("//div[@id='ui']/div/div[2]/div[2]/div/div[2]/table//td[.='"+name+"']")).click();
	}
}
