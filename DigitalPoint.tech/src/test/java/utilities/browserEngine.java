package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver browsersetup()
	{
	
	       //open chrome browser 
			System.setProperty("webdriver.chrome.driver","C:\\Devops\\eclipse\\eclipse-jee-2020-09-R-win32-x86_64\\workspace\\Nov2\\DigitalPoint.tech\\drivers\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			// Maximize the browser 
			driver.manage().window().maximize();
			//delete all cookies 
			driver.manage().deleteAllCookies();
           return driver; 
}
	
}
