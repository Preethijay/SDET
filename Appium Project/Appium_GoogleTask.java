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

public class Appium_GoogleTask {
	 
	AppiumDriver<MobileElement> driver = null;
	WebDriverWait wait;
	
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException{
		   DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "Redmi 7");
		   caps.setCapability("platformName", "Android");
			 caps.setCapability("automationName", "UiAutomator2");
			 caps.setCapability("appPackage", "com.google.android.apps.tasks");
			 caps.setCapability("appActivity", ".ui.TaskListsActivity");
			 caps.setCapability("noReset", "true");
			 
			 URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver<MobileElement>(appServer,caps);
			 wait = new WebDriverWait(driver, 5);
		 
	  }
	
	
	
  @Test
  public void addTask1() {
	  driver.findElementById("tasks_fab").click();
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
		//  driver.findElementById("add_task_title").click();
		  
   // driver.findElementByXPath("//android.widget.EditText[@text='New task']").click();
	 MobileElement task = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
	//   MobileElement task = driver.findElementById("add_task_title"); 
	 
	 task.sendKeys("Complete Activity with Google Tasks");
	 wait = new WebDriverWait(driver, 5);
	 driver.findElementById("add_task_done").click();
	 
	  // Wait for contact card to appear
     wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));
     
	// MobileElement task1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
     // Assertion
     MobileElement task1 = driver.findElementById("task_name");
     Assert.assertTrue(task1.isDisplayed());
     
     String contactName = driver.findElementById("task_name").getText();
     Assert.assertEquals(contactName, "Complete Activity with Google Tasks");
	  }
	  
  @Test
  public void addTask2() {
	  driver.findElementById("tasks_fab").click();
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
	//  driver.findElementById("add_task_title").click();
	//  MobileElement task = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
	  MobileElement task1 = driver.findElementById("add_task_title");
		 
	  
	  task1.sendKeys("Complete Activity with Google Keep");
	  wait = new WebDriverWait(driver, 5);
		 driver.findElementById("add_task_done").click();
		 
		  // Wait for contact card to appear
	     wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));
	     
		// MobileElement task1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
	     // Assertion
	     MobileElement task2 = driver.findElementById("task_name");
	     Assert.assertTrue(task2.isDisplayed());
	     
	     String contactName1 = driver.findElementById("task_name").getText();
	     Assert.assertEquals(contactName1, "Complete Activity with Google Keep");
	  
  }
	//  driver.findElementById("add_task_title").click();
	 
  
  @Test
public void addTask3() {
	
	 driver.findElementById("tasks_fab").click();
	 wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.google.android.apps.tasks:id/add_task_title")));
	 
	 MobileElement task2 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
	  task2.sendKeys("Complete the second Activity Google Keep");
	 driver.findElementById("add_task_done").click();
	 
	// Wait for contact card to appear
     wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("task_name")));
     
	     // Assertion
     MobileElement task3 = driver.findElementById("task_name");
     Assert.assertTrue(task3.isDisplayed());
     
     String contactName2 = driver.findElementById("task_name").getText();
     Assert.assertEquals(contactName2, "Complete the second Activity Google Keep");
	 
	  
  }

  @AfterClass
  public void afterClass() {
	 // driver.quit();
  }

}
