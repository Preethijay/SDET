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

public class GoogleKeep2 {
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
  @Test
  public void reminder() {
	  
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
	  
	  driver.findElementByAccessibilityId("Reminder").click();
	  
	
	driver.findElementByXPath("//android.widget.LinearLayout[contains(@content-desc, 'Time - Currently')]").click();
	 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.keep:id/reminder_time_afternoon")));
	// driver.findElementByXPath("//android.widget.TextView[contains(@text,'Afternoon')]").click();
	
	
	//check if reminder appeared
	 // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.google.android.keep:id/dialog_title")));
	  
	 
	  driver.findElementById("com.google.android.keep:id/reminder_time_afternoon").click();
	
	 wait = new WebDriverWait(driver, 10);
	  
	 driver.findElementById("com.google.android.keep:id/save").click();
	 
	 driver.findElementByAccessibilityId("Navigate up").click();
	   wait = new WebDriverWait(driver, 10);
	   
	  MobileElement noteDisplay =  driver.findElementByAccessibilityId("Open navigation drawer");
	   Assert.assertTrue(noteDisplay.isDisplayed());
	   System.out.println("Note added successfully");
	   
  }
  
  
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

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
