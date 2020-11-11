package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println("Title of the page " +title );
		
		//WebElement checkInputBox = driver.findElement(By.id("input-text"));
		WebElement checkInputBox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("Check if the input box is enabled " + checkInputBox.isEnabled());
		
		driver.findElement(By.id("toggleInput")).click();
		
		System.out.println("Check if the input box is enabled " + checkInputBox.isEnabled());
		
			
		
		driver.close();
	}

}
