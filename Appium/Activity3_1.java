package Appium;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;


public class Activity3_1 {
	
	 AppiumDriver<MobileElement> driver = null;
	   WebDriverWait wait;
	 
@BeforeClass
	  public void beforeClass() throws MalformedURLException {
		  DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("deviceName", "Redmi 7");
		   caps.setCapability("platformName", "Android");
			 caps.setCapability("automationName", "UiAutomator2");
			 caps.setCapability("appPackage", "com.android.mms");
			 caps.setCapability("appActivity", ".ui.MmsTabActivity");
			 caps.setCapability("noReset", "true");
			 
			 URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AndroidDriver<MobileElement>(appServer,caps);
			 wait = new WebDriverWait(driver, 5);
	
			 
}
	
  @Test
  public void smsTest(){
	  
	 // driver.findElementByAccessibilityId("Messaging").click();
	
	 // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.miui.home:id/icon_icon")));
	//  driver.findElementById("fab").click();
	//  driver.findElementByAccessibilityId("Compose").click();
	  driver.findElement(MobileBy.AndroidUIAutomator("description(\"Compose\")")).click();
	  
	  String contactBox = "resourceId(\"com.android.mms:id/recipients_editor\")";
			  
    driver.findElement(MobileBy.AndroidUIAutomator(contactBox)).sendKeys("9986037503");
    driver.findElementById("com.android.mms:id/confirm_recipient").click();
    
  //  wait = new WebDriverWait(driver, 5);
    String messageBoxLocator = "resourceId(\"com.android.mms:id/message_content_panel\")";
    driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator)).click();
    
    // Type in a message
    
    messageBoxLocator ="resourceId(\"com.android.mms:id/embedded_text_editor\")";
    MobileElement composeMessageInput = driver.findElement(MobileBy.AndroidUIAutomator(messageBoxLocator));
    composeMessageInput.sendKeys("Hello from Appium");
    
 // Send the message
    
    driver.findElement(MobileBy.AndroidUIAutomator("description(\"Send message\")")).click();
  //     "description(\"com.android.mms:id/send_button\")"
    // Wait for message to show
    driver.findElementById("com.android.mms:id/tv_title").click();
    driver.findElement(MobileBy.AndroidUIAutomator("resourceId(\"miui:id/up\")"));
  
    wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("message_body")));
	
     
    
    // Assertion
    String messageLocator = "resourceId(\"com.microsoft.android.smsorganizer:id/message_text_view\")";
    String sentMessageText = driver.findElement(MobileBy.AndroidUIAutomator(messageLocator)).getText();
    Assert.assertEquals(sentMessageText, "Hello from Appium");
  }
  
 
	  
    

@AfterClass
  public void afterClass() {
	// driver.quit();
  }

}
