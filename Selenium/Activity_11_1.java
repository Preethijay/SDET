package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Alert;

public class Activity_11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println("Title of the page is " + driver.getTitle());
		 
	driver.findElement(By.cssSelector("button#simple")).click();
		
		Alert simpleAlert = driver.switchTo().alert();
		
		String alertText = simpleAlert.getText();
		System.out.println("Alert on the text " + alertText);
		
		simpleAlert.accept();
		
		driver.close();
		
			
	}

}
