package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2_2 {
	
	AppiumDriver<MobileElement> driver = null;
	
	 @BeforeClass
	  public void beforeClass() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("deviceName", "Redmi 7");
		 caps.setCapability("platformName", "Android");
		 caps.setCapability("automationName", "UiAutomator2");
		 caps.setCapability("appPackage", "com.miui.calculator");
		 caps.setCapability("appActivity", ".cal.CalculatorActivity");
		 caps.setCapability("noReset", "true");
		 
		 URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
		 driver = new AndroidDriver<MobileElement>(appServer,caps);
		// driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		 
	  }
	
	
	
	
  @Test
  public void add() {
	  driver.findElementById("btn_5_s").click();
	  driver.findElementById("btn_plus_s").click();
	  driver.findElementById("btn_9_s").click();
	  driver.findElementByAccessibilityId("equals").click();
	 
	  String result=driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result,"= 14");
	  
	  
  }
  
  @Test
  public void subtract() {
	  driver.findElementByAccessibilityId("clear").click();
	  driver.findElementById("btn_1_s").click();
	  driver.findElementById("btn_0_s").click();
	  driver.findElementById("btn_minus_s").click();
	  driver.findElementById("btn_5_s").click();
	  driver.findElementByAccessibilityId("equals").click();
	 
	  String result=driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result,"= 5");
	  
	  
  }
  
  @Test
  public void multiply() {
	  driver.findElementByAccessibilityId("clear").click();
	  driver.findElementById("btn_5_s").click();
	  driver.findElementById("btn_mul_s").click();
	  driver.findElementById("btn_1_s").click();
	  driver.findElementById("btn_0_s").click();
	  driver.findElementById("btn_0_s").click();
	  driver.findElementByAccessibilityId("equals").click();
	 
	  String result=driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result,"= 500");
	  
	  
  }
 
  @Test
  public void divide() {
	  driver.findElementByAccessibilityId("clear").click();
	  driver.findElementById("btn_5_s").click();
	  driver.findElementById("btn_0_s").click();
	  driver.findElementById("btn_div_s").click();
	  driver.findElementById("btn_2_s").click();
	  driver.findElementByAccessibilityId("equals").click();
	 
	  String result=driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result,"= 25");
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  

}
