package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class loginPage extends TestBase{
	
	accountsPage signini;
	//WebDriver driver;	
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement clicksignin;
	
	@FindBy(xpath="//h1[contains(text(),'Authentication')]")
	WebElement signAuth;
	
	@FindBy(xpath="//p[contains(text(),'Please enter your email address to create an account.')]")
	WebElement signinEmail;
	
	@FindBy(xpath="//input[@name='email_create']")
	public static WebElement emailinput;
	
	@FindBy(xpath="//i[@class='icon-user left']")
	WebElement createbtn;
	
	public loginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String pageTitleLoginPage() {
		return driver.getTitle();
						
	}
	
	
	public accountsPage SigninVisisbleClick() {
		clicksignin.click();
		return new accountsPage();
	}
	
	public  String verifySigninTitle() {
		return driver.getTitle();
	}
	
	public String verifyEmail() {
		return signinEmail.getText();
		
	}
	
	public void emailBox(String Email) {
		emailinput.sendKeys(Email);
		
	}
	
	public registerPage createButton() {
		createbtn.click();
		return new registerPage();
	}
	

	
}
