package com.wbl.qa.pages;

import com.wbl.qa.base.TestBase;
import com.wbl.qa.util.TestUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	@FindBy(name="email")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(css=".blue.button.fluid.large.submit.ui")
	WebElement loginButton;
	
	
	
	public LoginPage()
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	public String verifyLoginPageTitle()
	{
		return(driver.getTitle());
	}
	
	public MyAccountPage loginClick(String username, String password)
	{
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		uname.sendKeys(username);
		pwd.sendKeys(password);
		loginButton.click();		
		return(new MyAccountPage());
	}
	
	
	
}
