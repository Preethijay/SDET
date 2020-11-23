package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity2 {
	
	WebDriver driver = new FirefoxDriver(); 
	
  @Test
  public void headerImage() {
	  
	  String title = driver.getTitle();
      System.out.println("Page title is: " + title);
      
      String CurrentURl = driver.getCurrentUrl();
      System.out.println("Current URl displayed on the webpage is : " +CurrentURl);
	  
	  
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
