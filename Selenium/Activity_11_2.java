package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Alert;


public class Activity_11_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page is " + driver.getTitle());
		 
		
        driver.findElement(By.cssSelector("button#confirm")).click();
		
		org.openqa.selenium.Alert confirmAlert = driver.switchTo().alert();
		
		String alertText = confirmAlert.getText();
		System.out.println("Alert on the text " + alertText);
		
		//confirmAlert.accept();
		
		//cancel the alert		
		confirmAlert.dismiss();
		
		
		driver.close();
		
	}

}
