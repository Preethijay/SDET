package CRM_Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class CRM_Activity5 {
	 WebDriver driver = new FirefoxDriver();
	
  @Test
  public void getColors()  
  {
	  WebElement userName = driver.findElement(By.id("user_name"));
	     WebElement password = driver.findElement(By.id("username_password"));
		 
	     userName.sendKeys("admin");
	     password.sendKeys("pa$$w0rd");
	   driver.findElement(By.cssSelector("#bigbutton")).click();
       
    //   String colortoVerify ="#534d64";
		String ColorRGB =  driver.findElement(By.xpath("//*[@id='toolbar']/ul")).getCssValue("color");
		System.out.println("Color of the navigation menu :  " +ColorRGB);
	  
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
