package TestNG_activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity3 {
	WebDriver driver;
	
	
  @Test
  public void LoginTest() {
	  WebElement username = driver.findElement(By.id("username"));
      WebElement password = driver.findElement(By.id("password"));
      
      username.sendKeys("admin");
      password.sendKeys("password");
      
      driver.findElement(By.xpath("//button[text()='Log in']")).click();
      
      //Read login message
      String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
      Assert.assertEquals("Welcome Back, admin", loginMessage);
	  
	    }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	        driver = new FirefoxDriver();
	        driver.get("https://www.training-support.net/selenium/login-form");
  }
  
    

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
