package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.util.TestBase;

public class registerPage extends TestBase{


	
	@FindBy(xpath="//*[@name='id_gender' and @value='1']")
	WebElement mrradio;
	
	@FindBy(xpath="//*[@name='id_gender' and @value='2']")
	WebElement mrsradio;
	
	@FindBy(xpath="//*[@id='customer_firstname']")
	WebElement cfirst;
	
	@FindBy(xpath="//*[@id='customer_lastname']")
	WebElement clast;
	
	@FindBy(xpath="//*[@id='passwd']")
	WebElement paswrd;
		
	@FindBy(xpath="//*[@id='days']")
	WebElement idate;
	
	@FindBy(xpath="//*[@id='months']")
	WebElement imonth;
	
	@FindBy(xpath="//*[@id='years']")
	WebElement iyear;
							
	@FindBy(xpath="//*[@id='firstname']")
	WebElement ifirstname;
	
	@FindBy(xpath="//*[@id='lastname']")
	WebElement ilastname;
	
	@FindBy(xpath="//*[@id='company']")
	WebElement icompany;
	
	@FindBy(xpath="//*[@id='address1']")
	WebElement iaddress;
																	
	@FindBy(xpath="//*[@id='city']")
	WebElement icity;
	
	@FindBy(xpath="//*[@id='id_state']")
	WebElement istate;
	
	@FindBy(xpath="//*[@id='postcode']")
	WebElement ipostcode;
	
	@FindBy(xpath="//*[@id='id_country']")
	WebElement icountry;
	
	@FindBy(xpath="//*[@id='phone']")
	WebElement iphone;
	
	@FindBy(xpath="//*[@id='alias']")
	WebElement ialias;
	
	@FindBy(xpath="//button[@class='btn btn-default button button-medium']")
	WebElement registerBtn;
	
	public registerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String registerverifyTitle() {
		return driver.getTitle();
	}
	
	public void selectgender(String gender) {
		if(gender.equals("Mr.")) {
			mrradio.click();
		}
		else {
			mrsradio.click();
		}
	}
	
	public void nameEntry(String fname, String clname) {
		cfirst.sendKeys(fname);
		clast.sendKeys(clname);
	}
	
	public void passEntry(String password) {
		paswrd.sendKeys(password);
		
	}
	
	public void dobDate(String date) {
		
		Select sel = new Select(idate);
		sel.selectByValue(date);
	}
	
	public void dobMonth(Integer month) {
		Select sel1 = new Select(imonth);
		sel1.selectByIndex(month);
	}
	
	public void dobYear(String year) {
		Select sel2 = new Select(iyear);
		sel2.selectByValue(year);
	}
	
	public void dataCustomer(String company, String Add, String City, Integer Pin, String alias, Integer state, Integer mobile) {
		
		icompany.sendKeys(company);
		iaddress.sendKeys(Add);
		icity.sendKeys(City);
		ipostcode.sendKeys(String.valueOf(Pin));
		iphone.sendKeys(String.valueOf(mobile));
		ialias.sendKeys(alias);
		
		Select sel4 = new Select(istate);
		sel4.selectByIndex(state);
		
	}
	
	public void entryCounrty(Integer country) {
		Select sel5 = new Select(icountry);
		sel5.selectByIndex(country);
	}
	
	public accountsPage registerBtnClick() {
		registerBtn.click();
		return new accountsPage();
	}
	
	public void verifyAddress() {
		
		
		
	}
	
	
	
}
