package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity1 {
	
	 WebDriver driver = new FirefoxDriver();
	
  @Test
  public void Title() {
	  String title = driver.getTitle();
      System.out.println("Page title is: " + title);
      
      if(driver.getTitle()!= null && driver.getTitle().contains(title)) {
    	  System.out.println("Title matches");
    	  driver.close();
      }
      else {
    	  
    	  System.out.println("Title Mismatch");
      }
    	  
	  
  }
    
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver.get("https://alchemy.hguy.co/crm");
  }

  @AfterMethod
  public void afterMethod() {
	 
  }

}
