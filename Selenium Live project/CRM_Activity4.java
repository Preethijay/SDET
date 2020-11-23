package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity4 {
	
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void loginTest() {
	  
	     WebElement userName = driver.findElement(By.id("user_name"));
	     WebElement password = driver.findElement(By.id("username_password"));
		 
	     userName.sendKeys("admin");
	     password.sendKeys("pa$$w0rd");
	     
	     driver.findElement(By.cssSelector("#bigbutton")).click();
	     
	    String expectedTitle = "SuiteCRM";
	     if(driver.getTitle()!= null && driver.getTitle().contains(expectedTitle)){
	    	  System.out.println("Web page is opened");
	    	}
	    	else{
	    	  System.out.println("Web page could not open.");
	    	}
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("https://alchemy.hguy.co/crm");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
