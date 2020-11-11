package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String title = driver.getTitle();
		System.out.println("Title of the page " +title);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox element " +checkbox1.isSelected());
		
		checkbox1.click();
		
		System.out.println("Checkbox element " +checkbox1.isSelected());
		
		driver.close();
	}

}
