package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.browserEngine;

public class T02_loginpageValidation {
	
	public static WebDriver driver;
	
@BeforeMethod
	
	public static void openBrowser()
	
	{
		driver=browserEngine.browsersetup();
				
	}



@Test 

public static void logpagevalidation()

{
	//loading the application under test 
	driver.get("https://forum.digitalpoint.tech/user/index.php/login");
	
	// validation of login page title 
	
	String loginpageexpectedtitle ="Digital Point - Forum | User Login";
			
			String loginpageactutaltitle= driver.getTitle();
			
			AssertJUnit.assertEquals(loginpageactutaltitle, loginpageexpectedtitle);
			
			//login funtionlity alidation 
			
			// sending value to the name box 
			
			driver.findElement(By.name("email")).sendKeys("nizam@digitalpoint.tech");
			
			// sending value to the passowrd box 
			driver.findElement(By.name("password")).sendKeys("abcd1234");
			
			//click on signin button 
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/div[3]/div[2]/button")).click();
			
			//logout funcnatility  validation 
			
			driver.findElement(By.xpath("//*[@id='navbar-right']/li/a")).click();
			driver.findElement(By.xpath("//*[@id='navbar-right']/li/ul/li/a")).click();
			
			
	
	
}


@AfterMethod

public static void closeBrwoser()

{
	//closing the browser
	driver.close();
	
}
}
