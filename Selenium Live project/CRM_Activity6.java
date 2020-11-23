package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity6 {
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void menuCheck() {
	  
	  WebElement userName = driver.findElement(By.id("user_name"));
	     WebElement password = driver.findElement(By.id("username_password"));
		 
	     userName.sendKeys("admin");
	     password.sendKeys("pa$$w0rd");
	     
	     driver.findElement(By.cssSelector("#bigbutton")).click();
	     
	   //  WebElement navigationMenu = driver.findElement(By.id("toolbar"));
	     WebElement subTab = driver.findElement(By.id("grouptab_3"));
	     String tabName = subTab.getText();
	     
	     System.out.println("Tab name is : " +tabName);
	     
	     if(tabName.contains("ACTIVITIES")) {
    	  System.out.println("Tab name ACTIVITIES is present");
	     }
	     else
	     {
	    	 System.out.println("No ACTIVITES tab name is not present");
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
