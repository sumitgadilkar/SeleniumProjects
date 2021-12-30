package StepDef;

import java.io.IOException;

import com.qa.pages.accountsPage;
import com.qa.pages.homeCustomerPage;
import com.qa.pages.registerPage;
import com.qa.pages.screenshotHandler;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterStepDef extends TestBase {
	
	accountsPage account;
	registerPage registration;
	homeCustomerPage homePage;
	
	@Given("user is on accounts page")
	public void registration_Page() throws IOException {
		
		registration = new registerPage();
		account = new accountsPage();
		account.myAddress();
		System.out.println("clicked on MyAddress link");
		screenshotHandler.takeFullScreenshot(driver, "MyAddress");
		
		
	}
	
	@When("user is navigated to Customer Home Page when clicked on Home Page")
	public void homePageCustomer() {
		
		System.out.println("User now clicks on Home button");
		homePage = account.HomeBtnClick();
		
		
		
	}
	
}
