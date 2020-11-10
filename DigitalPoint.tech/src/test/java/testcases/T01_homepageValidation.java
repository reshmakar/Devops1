package testcases;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import utilities.browserEngine;

public class T01_homepageValidation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		driver=browserEngine.browsersetup();
	}

	
	@Test
	
	public static void homepageValidation()
	
	{
		//load the application under test 
		driver.get("https://forum.digitalpoint.tech/");
		
		// validate the title of  the home page 
		
		String hpageexpectedtitle = "Digital Point Forum";
		
		String hpactutaltitle=driver.getTitle();
		
       AssertJUnit.assertEquals(hpactutaltitle, hpageexpectedtitle);		
	}
	
	@AfterMethod
	
	public static void closeBrwoser()
	
	{
		//closing the browser
		driver.close();
		
	}
}
