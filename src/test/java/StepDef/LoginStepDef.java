package StepDef;

import com.qa.pages.loginPage;
import com.qa.pages.registerPage;
import com.qa.pages.screenshotHandler;
import com.qa.util.TestBase;
import com.qa.pages.accountsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDef extends TestBase{

	//WebDriver driver;
	
	loginPage login;
	registerPage registration;
	accountsPage signini = new accountsPage();
	screenshotHandler sc;
	WebElement clicksign;
	accountsPage account;
	

	
	@Given("user opens the url")
	public void user_opens_the_url() {
		TestBase.initialize(); //calling test Base initialise 
		login = new loginPage();
		String SiteTitle = login.pageTitleLoginPage();
		System.out.println("Actual Page Title is: " + SiteTitle);
		Assert.assertEquals("My Store",SiteTitle);
	}

	@When("user tries click on Sign in link")
	public void user_tries_click_on_Sign_in_link() {
	   login.SigninVisisbleClick();
	   System.out.println("sign in page is opened");
	}

	@Then("user is navigated to sign in page")
	public void user_is_navigated_to_sign_in_page() {
		String titlSign = login.verifySigninTitle();
		System.out.println(titlSign);
	}

	@Then("user verify the title of the sign in page")
	public void user_verify_the_title_of_the_sign_in_page() {
	    String email = login.verifyEmail();
	    System.out.println("EMail id on sign in page is: "+ email);
	}

	
	@Given("^user provides \"(.*)\" and clicks on createbutton")
	public void clicks_on_Create_Account_button(String email) throws IOException {
		login = new loginPage();
		login.emailBox(email);
		clicksign =  driver.findElement(By.xpath("//*[@id='create-account_form']"));
		screenshotHandler.takeScreenshot(driver, "email_screenshot", clicksign);
		registration = login.createButton();
			    
	}

	@When("user is on registration page")
	public void user_is_on_registration_page() {
		
	    String regiTitle = registration.registerverifyTitle();
	    System.out.println("Title of registration page is: " + regiTitle);
	}
	
	// 1. Regex - \"(.*)\"
	
	
	@Then("^user fills \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
	public void user_registration(String gender,String CfName, String Clname, String Cpass, String date, Integer month, String year, String company, String address, String city, Integer state, Integer Pin, Integer Country, Integer Mobile, String alias) {
		registration.selectgender(gender);
		registration.nameEntry(CfName, Clname);
		registration.passEntry(Cpass);
		registration.dobDate(date);
		registration.dobMonth(month);
		registration.dobYear(year);
		registration.entryCounrty(Country);
		registration.dataCustomer(company, address, city, Pin, alias, state, Mobile);
		
	}

	@And("clicks on register button")
	public void clicks_on_register_button() throws IOException {
		
		screenshotHandler.takeFullScreenshot(driver, "register_fullpage_screenshot");
		
		account = registration.registerBtnClick();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
/*	@Before
	public void setup() {
		System.out.println("Launching Webdrivers and deleting cookies");
		System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
	}
	
	@Given("Browser page is opened")
	public void browser_page_is_opened() {
	    
		System.out.println("Browser is already opened");
		
		
	}

	@When("user provides the url of Amazon india")
	public void user_provides_the_url_of_Amazon_india() {
	    driver.get("https://www.amazon.in/");
	    
	   // driver.manage().timeouts().implicitlyWait(30, TIMEUNIT SECONDS);
	    
	    
	}

	@Then("Amazon India page is opened")
	public void amazon_India_page_is_opened() {
		
	   System.out.println("**TITLE IS : " + driver.getTitle());
	   
	}

	@Then("User clicks on Sign in button")
	public void user_clicks_on_Sign_in_button() throws InterruptedException {
	   
	//	Actions action = new Actions(driver);
		Thread.sleep(30);
		driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]")).click();
		
	}

	@And("Sign in Page is opened")
	public void sign_in_Page_is_opened() {
	    WebElement d = driver.findElement(By.xpath("//h1[contains(text(),'Sign-In')]"));
	    
	    System.out.println("***** Sign IN PAGE Title is: "+d.getText());
	}

	@Then("^user provides (.*) and (.*)$")
	public void user_login_password(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	   
	}
	
	@After
	public void teardown() {
	driver.quit();	
	}
}*/


//  

//user provides \"(.*)\" and \"(.*)\"