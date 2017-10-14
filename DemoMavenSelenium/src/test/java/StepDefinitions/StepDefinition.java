package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;







import Sunit2106.DemoMavenSelenium.CRUDExcelTestData;
import Sunit2106.DemoMavenSelenium.UIMap;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition{
	
	public WebDriver driver;
	public UIMap uimap;
	public UIMap datafile;
	public CRUDExcelTestData crudObj;
	public String workingDir="src//test//";
	WebDriverWait wait;
	
	
	
	
	@Given("^Launch Chrome BRowser$")
	public void launch_Chrome_BRowser() throws Exception {
		 System.out.println("*******************");
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
			driver = new ChromeDriver();
	}

	@Given("^Maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	    driver.manage().window().maximize();
	}
	@Given("^Open Book My Show Website$")
	public void open_Book_My_Show_Website()  {
	    // Write code here that turns the phrase above into concrete actions
		wait=new WebDriverWait(driver, 20);
		  driver.get("https://in.bookmyshow.com");
		  uimap = new UIMap("src//test//resources//locators.properties");
	}

	@Then("^choose mumbai location$")
	public void choose_mumbai_location() throws Exception  {
	    // Write code here that turns the phrase above into concrete actions
		// Click on the Mumbai Location
					WebElement location_bms = wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Select_location")));
					location_bms.click();
			// Click on the No Thanks 
					
					WebElement alert_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Alert_Btn")));
					alert_btn.click();
			// Click on the Movies 
					WebElement movies_link = driver.findElement(uimap.getLocator("Movies_Link"));
					movies_link.click();
	}

	@Then("^enter user id and click next$")
	public void enter_and_click_next() throws Exception {
		WebElement sign_in_link = driver.findElement(uimap.getLocator("SignIn_Link"));
		sign_in_link.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(uimap.getLocator("Username_field"))).sendKeys("sunit2106@gmail.com");	
		
		
	}

	@Then("^enter password$")
	public void enter() throws Exception {
		driver.findElement(uimap.getLocator("Password_field")).sendKeys("151621*/*");	
	}

	@Then("^click login$")
	public void click_login() throws Exception {
		driver.findElement(uimap.getLocator("SignIn_button")).click();
	}
	
	
	@Given("^Now SHowing page is open$")
	public void now_SHowing_page_is_open() throws Exception  {
	    boolean nowShowingIsPresent=driver.findElements(uimap.getLocator("NowShowingBtn")).size()>0;
	    if(nowShowingIsPresent)
	    	System.out.println("Now Showing Movies Page Loaded...");
	}

	@Then("^Click on Searchbox$")
	public void click_on_Searchbox() throws Exception  {
	    driver.findElement(uimap.getLocator("BookMoviesSearchBox")).click();
	    
	}

	@Then("^Search for Cinemas$")
	public void search_for_Cinemas() throws Exception {
		 driver.findElement(uimap.getLocator("CinemasBtn")).click();
	}

	@Then("^Click on Mumbai South and Central$")
	public void click_on_Mumbai_South_and_Central() throws Exception {
	    driver.findElement(uimap.getLocator("MumbaiSouth&CentralBtn")).click();
	    	
	}

	@Then("^Click on Cinemastar$")
	public void click_on_Cinemastar() throws Exception {
	   driver.findElement(uimap.getLocator("CinemaStarlink")).click();
	}

}