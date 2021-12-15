package StepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.qa.pages.accountsPage;
import com.qa.pages.registerPage;
import com.qa.pages.screenshotHandler;
import com.qa.util.TestBase;

import io.cucumber.java.en.Given;

public class RegisterStepDef extends TestBase {
	
	accountsPage account;
	registerPage registration;
	//WebDriver driver;
	
	@Given("user is on accounts page")
	public void registration_Page() throws IOException {
		
		registration = new registerPage();
		account = new accountsPage();
		account.myAddress();
		System.out.println("clicked on MyAddress link");
		screenshotHandler.takeFullScreenshot(driver, "MyAddress");
		
		
	}
	
}
