package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     driver.get("https://training-support.net/selenium/dynamic-controls");
     
     String title = driver.getTitle();
     System.out.println("Title of the page " +title);
     
     WebElement findCheckbox = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
     System.out.println("The checkbox input is displayed " + findCheckbox.isDisplayed());
     
     driver.findElement(By.id("toggleCheckbox")).click();
     
          
     System.out.println("The checkbox input is displayed " + findCheckbox.isDisplayed());
     
     driver.close();
     
	}

}
