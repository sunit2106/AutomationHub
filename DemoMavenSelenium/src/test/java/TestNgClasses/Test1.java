package TestNgClasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Test1 {
	
  @Test
  	public void TCName() 
  	{
	  System.out.println("Main Test Annotation");
  	}
  @BeforeTest
  	public void beforeTest()
  	{
	  System.out.println("Before Test1");
  	}

  @AfterTest
  	public void afterTest() 
  	{
	  System.out.println("After Test1");
  	}

  @BeforeSuite
  	public void beforeSuite() 
  	{
	  System.out.println("Before Test-Suite");
  	}

  @AfterSuite
  	public void afterSuite()
  	{
	  System.out.println("After Suite Test-Suite");
  	}

}
