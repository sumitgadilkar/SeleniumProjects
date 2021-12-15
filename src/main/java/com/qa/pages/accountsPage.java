package com.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;



public class accountsPage extends TestBase {


	@FindBy(xpath="//span[contains(text(),'My addresses')]")
	WebElement addressBtn;
	
	public accountsPage() {
		
			PageFactory.initElements(driver, this);
		}
	
	public void myAddress() {
		addressBtn.click();
	}
	
	
	
}
