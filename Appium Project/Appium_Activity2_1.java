package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Appium_Activity2_1 {
	 WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;
	
  @Test
  public void addTask1() throws Throwable {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.training-support.net/selenium");

      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View")));
	  
	//  driver.findElementByAccessibilityId("Lists Ordered and Unordered Lists").click();
	 // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//android.view.View[@content-desc=\"Lists Ordered and Unordered Lists\"]")));
      //Scroll TO DO List

      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"To-Do List\"))")).click();

	

      //add Task1
      MobileElement taskField1 = driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText"));

      taskField1.click();

      taskField1.sendKeys("Add tasks to list");

     // driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button")).click();

      driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();

      Thread.sleep(1000);

          

     //add Task2
      MobileElement taskField2 = driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText"));

      taskField2.click();

      taskField2.sendKeys("Get number of tasks");

      driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();

      Thread.sleep(1000);

      //add Task3

      

      MobileElement taskField3 = driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText"));
      taskField3.click();

      taskField2.sendKeys("Clear the list");

      driver.findElementByXPath("//android.widget.Button[contains(@text, 'Add Task')]").click();

      Thread.sleep(1000);

      

      //Strikes all tasks

      String TodoTask1= driver.findElement(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]")).getText();

  	  String TodoTask2= driver.findElement(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]")).getText();

  	  String TodoTask3= driver.findElement(MobileBy.xpath("//android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[4]")).getText();

  	 Assert.assertEquals(TodoTask1, "Add tasks to list");

  	  Assert.assertEquals(TodoTask2, "Get number of tasks");

  	  Assert.assertEquals(TodoTask3, "Clear the list");

  	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Add tasks to list\"))")).click();

  	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Get number of tasks\"))")).click();

  	  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Clear the list\"))")).click();

  	  

  	  //delete tasks

  	driver.findElement(MobileBy.xpath("//android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]")).click();



	  
  }
  
  
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException{
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "Redmi 7");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.chrome");
      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver, 5);
  }

  @AfterClass
  public void afterClass() {
	//  driver.quit();
  }

}
