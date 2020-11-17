package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		  WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.training-support.net/selenium/javascript-alerts");
			System.out.println("Title of the page is " + driver.getTitle());
			 
		driver.findElement(By.cssSelector("button#prompt")).click();
			
			Alert promptAlert = driver.switchTo().alert();
			
			String alertText = promptAlert.getText();
	        System.out.println("Alert text is: " + alertText);
	 
	        //Type "Awesome!" into the prompt
	        promptAlert.sendKeys("Yes,you are!");
	 
	        //Close the prompt
	        promptAlert.accept();
	 
	        //Close the Browser
	        driver.close();
		
	}

}
