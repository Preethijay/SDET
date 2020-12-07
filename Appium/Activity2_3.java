package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

   
  
   
   public class Activity2_3 {
	   
	   AppiumDriver<MobileElement> driver = null;
	   WebDriverWait wait;
	   
	   @BeforeClass
	   public void beforeClass() throws MalformedURLException{
		   DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "Redmi 7");
		   caps.setCapability("platformName", "Android");
			 caps.setCapability("automationName", "UiAutomator2");
			 caps.setCapability("appPackage", "com.android.contacts");
			 caps.setCapability("appActivity", ".activities.PeopleActivity");
			 caps.setCapability("noReset", "true");
			 
			 URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver<MobileElement>(appServer,caps);
			 wait = new WebDriverWait(driver, 5);
	   } 
	   
	   
  @Test
  public void addContact() {
	  
	  driver.findElementByAccessibilityId("Add").click();
	  
	
	  wait.until(ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.EditText[@text='Name']")));
	 // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.android.contacts:id/Add")));
	  
	  MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='Name']");
	  wait = new WebDriverWait(driver, 5);
	  MobileElement mobile = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
	 // MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='Name']");
	  
	  firstName.sendKeys("Test Name");
	  mobile.sendKeys("9980099800");
	  
	  driver.findElementByAccessibilityId("OK").click();
	  wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("content_header")));
	  
	  MobileElement mobileCard = driver.findElementById("content_header");
      Assert.assertTrue(mobileCard.isDisplayed());
      
      String contactName = driver.findElementById("custom_title").getText();
      Assert.assertEquals(contactName, "Test Name");
	  
	  
  }
 

  

  @AfterClass
  public void afterClass() {
	 // driver.quit();
  }

}
