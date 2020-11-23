package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity3 {
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void copyRight() {
	  
	  
	  String title = driver.getTitle();
    System.out.println("Page title is: " + title);
    
    //WebElement firstCopyRight= driver.findElement(By.className("p_login_bottom"));  
    WebElement firstCopyRight= driver.findElement(By.xpath("//*[@id='admin_options']"));
    
    
    System.out.println("First copyright text in the footer is : " +firstCopyRight.getText());
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
