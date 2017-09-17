package Sunit2106.DemoMavenSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTC {
	public WebDriver driver;
	public UIMap uimap;
	public UIMap datafile;
	public String workingDir="src//test//";
	
	
	
  @Test
  public void f() throws Exception
  	{
	  
	  driver.get("https://in.bookmyshow.com");
	  uimap = new UIMap("src//test//resources//locators.properties");
	  Thread.sleep(3000);
	/*// Click on the Region Button
				WebElement reg_btn = driver.findElement(uimap.getLocator("Select_Region_Btn"));
				reg_btn.click();*/
	// Click on the Mumbai Location
			WebElement location_bms = driver.findElement(uimap.getLocator("Select_location"));
			location_bms.click();
	// Click on the No Thabks 
			Thread.sleep(3000);
			WebElement alert_btn = driver.findElement(uimap.getLocator("Alert_Btn"));
			alert_btn.click();
	// Click on the No Thabks 
			WebElement movies_link = driver.findElement(uimap.getLocator("Movies_Link"));
			movies_link.click();
  	}
  @BeforeMethod
  public void beforeMethod()
   {
	  
	    System.out.println("*******************");
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	  
  	}

  @AfterMethod
  public void afterMethod()
  	{
	  
	  
  	}

}
