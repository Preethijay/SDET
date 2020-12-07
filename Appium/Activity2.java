package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity2 {
	
	WebDriverWait wait;
	
	  AppiumDriver<MobileElement> driver = null;
@BeforeClass
public void calc() throws InterruptedException, IOException {
    // Set the Desired Capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceName", "Redmi 7 ");
    caps.setCapability("platformName", "Android");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("appPackage", "com.miui.calculator");
    caps.setCapability("appActivity", ".cal.CalculatorActivity");
    caps.setCapability("noReset", "true");
    
try {
	// Initialize driver
    driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
   // wait = new WebDriverWait(driver, 50);
    System.out.println("Calculator is open");
    
} catch (MalformedURLException e) {
    System.out.println(e.getMessage());
}
}
    
	
	
	
  @Test
  public void Multiply()
  {
	
	
	  driver.findElementById("btn_7_s").click();
	  driver.findElementByAccessibilityId("multiply").click();
	  driver.findElementById("btn_4_s").click();
	  driver.findElementByAccessibilityId("equals").click();
	  //driver.findElementById("btn_equal_s").click();
	 
	  String result=driver.findElementById("result").getText();
	  System.out.println(result);
	  Assert.assertEquals(result,"= 28");
	 
  }
  
  
  
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
