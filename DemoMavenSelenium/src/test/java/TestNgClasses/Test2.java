package TestNgClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;

public class Test2 {
  @Test(groups = { "Regression" })
  public void TCaseNoTwo()
  {
	  System.out.println("Executing Test Case No 2");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Before Method TCaseNoTwo");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("After Method TCaseNoTwo");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("BEfore Class TEst2");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("After Class TEst2");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Before Test TcNo2");
  }
  

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After Test TcNo2");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("After Suite Test-Suite");
  }

}
