package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
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

public class Appium_GoogleKeep1 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	@BeforeClass
	  public void beforeClass() throws MalformedURLException {
		   DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "Redmi 7");
		   caps.setCapability("platformName", "Android");
			 caps.setCapability("automationName", "UiAutomator2");
			 caps.setCapability("appPackage", "com.google.android.keep");
			 caps.setCapability("appActivity", ".activities.BrowseActivity");
			 caps.setCapability("noReset", "true");
			 
			 URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver<MobileElement>(appServer,caps);
			 wait = new WebDriverWait(driver, 5);
		
	  }
	
	
	
  @Test
  public void gKeep() {
	  
	  driver.findElementById("new_note_button").click();
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.keep:id/new_note_button")));
	  
	  MobileElement title = driver.findElementById("com.google.android.keep:id/editable_title");
	  driver.findElementById("editable_title").click();
	  wait = new WebDriverWait(driver, 5);
	  title.sendKeys("Appium Activity");
	//  MobileElement title = driver.findElementById("browse_text_note");  
	  //MobileElement Desc = driver.findElementById("edit_note_text");
	  
	  driver.findElementById("edit_note_text").click();
	  wait = new WebDriverWait(driver, 5);
	  MobileElement Desc = driver.findElementById("com.google.android.keep:id/edit_note_text");
	//  MobileElement Desc = driver.findElementByXPath("//android.widget.EditText[@text=Note]");
	  Desc.sendKeys("Create 3 appium acitivities");
	  
	   driver.findElementByAccessibilityId("Navigate up").click();
	   wait = new WebDriverWait(driver, 20);
	   
	  // MobileElement content = driver.findElementByAccessibilityId("index_note_text_description");
	 //  String content = driver.findElementByAccessibilityId("com.google.android.keep:id/index_note_text_description").getText();
	   // Assert.assertEquals(content, "Create 3 appium acitivities");
	   
     MobileElement noteDisplay = driver.findElementById("com.google.android.keep:id/index_note_text_description");
	   Assert.assertTrue(noteDisplay.isDisplayed());
       System.out.println("Note added successfully");
	  
  }
  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
