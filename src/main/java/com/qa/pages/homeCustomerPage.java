package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homeCustomerPage {

	
	public static WebDriver driver;
	 
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Projects/CucumberDemo2/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Z14@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456&");
		driver.findElement(By.xpath("//*[@name='SubmitLogin']")).click();
		
		
		driver.findElement(By.xpath("//*[contains(text(),'Home')]")).click();
		
		List<WebElement> s = driver.findElements(By.tagName("a"));
		
		for(WebElement i:s) {
			if(i.getText().equals("Blouse")) {
				Actions action = new Actions(driver);
				action.moveToElement(i).build().perform();
				System.out.println(i.getAttribute("title"));
				i.click();
				
			}
		}
		
	}
	
	}
	
	
	
	

