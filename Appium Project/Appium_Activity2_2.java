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

public class Appium_Activity2_2 {
	 WebDriverWait wait;
	    AppiumDriver<MobileElement> driver = null;
	
  @Test
  public void Login() {
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.get("https://www.training-support.net/selenium");

      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View")));

			  //Scroll Login Form

	      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Login Form\"))")).click();

        //add Username

	      MobileElement userName = driver.findElement(By.xpath("//android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[1]"));

	      userName.click();

	      userName.sendKeys("admin");

	     

	      driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Password\"))")).click();

	      //add Password
  

	      driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").click();

		  driver.findElementByXPath("//android.view.View/android.view.View[3]/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("password");

	      

		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();

        

        //String loginSuccess = driver.findElementByXPath("//android.view.View[@text='Welcome Back, admin']").getText();

			String loginSuccess = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();

		  Assert.assertEquals(loginSuccess, "Welcome Back, admin");

		  System.out.println("Ligin Success");


		  MobileElement userName1 =driver.findElement(By.xpath("//android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[1]"));

		  userName1.click();

		  userName1.clear();

	

		  userName1.sendKeys("Admin");

		  

		  driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(UiSelector().scrollable(true)).scrollIntoView(text(\"Password\"))")).click();

		  MobileElement passWord1=driver.findElementByXPath("//android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.EditText[2]");

		  //MobileElement passWord1=driver.findElementById("password");

		  passWord1.click();

		  passWord1.clear();

		  passWord1.sendKeys("Password");

		  driver.findElementByXPath("//android.widget.Button[@text='Log in']").click();


		  String loginFailure = driver.findElementByXPath("//android.view.View[@resource-id='action-confirmation']").getText();

		  Assert.assertEquals(loginFailure, "Invalid Credentials");

		  System.out.println("Login Failed");

		  
	  
	  
  }
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
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
