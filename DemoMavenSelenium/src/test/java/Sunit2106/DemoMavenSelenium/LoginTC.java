package Sunit2106.DemoMavenSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	  WebDriverWait wait=new WebDriverWait(driver, 20);
	  driver.get("https://in.bookmyshow.com");
	  uimap = new UIMap("src//test//resources//locators.properties");
	  
	/*// Click on the Region Button
				WebElement reg_btn = driver.findElement(uimap.getLocator("Select_Region_Btn"));
				reg_btn.click();*/
	// Click on the Mumbai Location
			WebElement location_bms = wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Select_location")));
			location_bms.click();
	// Click on the No Thanks 
			
			WebElement alert_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Alert_Btn")));
			alert_btn.click();
	// Click on the Movies 
			WebElement movies_link = driver.findElement(uimap.getLocator("Movies_Link"));
			movies_link.click();
	// Click on the Sign In 
			WebElement sign_in_link = driver.findElement(uimap.getLocator("SignIn_Link"));
			sign_in_link.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Username_field"))).sendKeys("sunit2106@gmail.com");	
			driver.findElement(uimap.getLocator("Password_field")).sendKeys("");
			driver.findElement(uimap.getLocator("SignIn_button")).click();
			
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
