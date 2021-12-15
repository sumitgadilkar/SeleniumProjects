package com.qa.pages;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.TestBase;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class screenshotHandler extends TestBase {

	
	public static void takeScreenshot(WebDriver driver, String fileName, WebElement clicksignin) throws IOException {
		
		
				
		//WebElement clicksignin =  driver.findElement(By.xpath("//*[@id='create-account_form']"));
		File src = clicksignin.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:/Selenium Projects/CucumberDemo2/src/main/java/Screenshots/"+fileName+".jpg"));
		
		/*
		 * File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(file, new File("E:/Selenium Projects/CucumberDemo2/src/main/java/Screenshots/"+fileName+".jpg"));
		 */
			
		
		
	}
	
	
	public static void takeFullScreenshot(WebDriver driver, String Filename) throws IOException {
		
		
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(fpScreenshot.getImage(),"PNG",new File("E:/Selenium Projects/CucumberDemo2/src/main/java/Screenshots/"+Filename+".jpg"));
		
	}
	
	
}
