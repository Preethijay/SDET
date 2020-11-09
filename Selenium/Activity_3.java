package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
       
		//title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		
		// find element firstname and lastname
		WebElement firstname = driver.findElement(By.id("firstName"));
		WebElement lastname = driver.findElement(By.id("lastName"));
		
		//enter firstname and lastname
		firstname.sendKeys("Preethi");
		lastname.sendKeys("Jayakumar");
		
		//find element email and contact number and submit values
		WebElement email = driver.findElement(By.id("email"));
		WebElement contactNumb = driver.findElement(By.id("number"));
		
		email.sendKeys("pj@example.com");
		contactNumb.sendKeys("1552626221");
		
		//click on submit button
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		
		driver.close();
	}

}
