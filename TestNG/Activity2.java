package TestNG_activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	
	WebDriver driver;
	
  @Test
  public void testCase1() {
	  String title = driver.getTitle();
	  System.out.println("Title of the page is " + title);
	  Assert.assertEquals(title, "Target Practice");
  }
  
  @Test
  public void testCase2( ) {
	  WebElement blackButton = driver.findElement(By.cssSelector("button.black"));
      Assert.assertTrue(blackButton.isDisplayed());
      Assert.assertEquals(blackButton.getText(), "black"); 
	 
  }
	
  @Test(enabled = false)
  public void testCase3( ) {  
	  
	  String subHeading = driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
	  
  }
  
  @Test
  public void testCase4( ) {
	  throw new SkipException("Skipping test case");
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  //Create a new instance of the Firefox driver
      driver = new FirefoxDriver();
      
      //Open browser
      driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  //Close the browser
      driver.quit();
  }

}
