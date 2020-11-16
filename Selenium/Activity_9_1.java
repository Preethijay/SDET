package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/selenium/dynamic-attributes");
    
	System.out.println("Print the title of the page " +driver.getTitle());
    
    WebElement userName = driver.findElement(By.xpath("//input(contains[@class,'username'])"));
    WebElement password = driver.findElement(By.xpath("//input(starts-with[@class,'password'])"));
    
    userName.sendKeys("admin");
    password.sendKeys("password");
    
    driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
    
    String loginMessage= driver.findElement(By.id("action-confirmation")).getText();
    System.out.println("Login Message " + loginMessage);
    
    driver.close();
    
	}

}
