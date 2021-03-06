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

public class Appium_Activity2_3 {
	 WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;
	
  @Test
  public void Login_Popups() {
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



      driver.get("https://www.training-support.net/selenium");

      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View")));

		  

		  //Scroll Popups

	      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Popups\"))")).click();

		  

	      // Click on Sign in

	      MobileElement singIn = driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.widget.Button"));

	      singIn.click();

	      

        //Successful Scenario

	      

	        driver.findElementByXPath("//android.widget.EditText[@resource-id='username']").click();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='username']").sendKeys("admin");

			

			driver.findElementByXPath("//android.widget.EditText[@resource-id='password']").click();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='password']").sendKeys("password");

			

			driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();

			

			String loginSuccess = driver.findElementByXPath("//android.view.View[@text='Welcome Back, admin']").getText();

			

			Assert.assertEquals(loginSuccess, "Welcome Back, admin");

			System.out.println("Login Successful");

			

			

		  //Failure Scenario

			driver.findElementByXPath("//android.widget.Button[@text='Sign In']").click();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='username']").click();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='username']").clear();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='username']").sendKeys("Admin");

			

			driver.findElementByXPath("//android.widget.EditText[@resource-id='password']").click();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='password']").clear();

			driver.findElementByXPath("//android.widget.EditText[@resource-id='password']").sendKeys("Password");

			

			driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();

			

			String loginFailure = driver.findElementByXPath("//android.view.View[@text='Invalid Credentials']").getText();

			

			Assert.assertEquals(loginFailure, "Invalid Credentials");

			System.out.println("Login Failed");
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
	  driver.quit();
  }

}
