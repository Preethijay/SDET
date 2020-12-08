package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3_2 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
  @Test
  public void imageScrollTest() {
	  // wait for page to load
      MobileElement pageTitle = driver.findElementByClassName("android.widget.TextView");
      wait.until(ExpectedConditions.textToBePresentInElement(pageTitle, "Lazy Loading"));

      // Count the number of images shown on the screen
      List<MobileElement> numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
      System.out.println("Number of image shown currently: " + numberOfImages.size());
      
      // Assertion before scrolling
      Assert.assertEquals(numberOfImages.size(), 2);
      
      // Scroll to Helen's post
      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollTextIntoView(\"helen\")"));
      
      // Find the number of images shown after scrolling
      numberOfImages = driver.findElementsByXPath("//android.view.View/android.view.View/android.widget.Image");
      System.out.println("Number of image shown currently: " + numberOfImages.size());
      
      // Assertion after scrolling
      Assert.assertEquals(numberOfImages.size(), 4);
	  
  }
  
   
  
  
  
  
  @BeforeClass
  public void beforeClass()throws MalformedURLException {
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

      driver.get("https://www.training-support.net/selenium/lazy-loading");
	  
  }
  
  

  @AfterClass
  public void afterClass() {
	//  driver.quit();
  }

}
