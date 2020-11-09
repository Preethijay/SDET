package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
       
		String title = driver.getTitle();
		System.out.println("Title of the page " +title);
		
		 driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		 
		 //Title of the new page
		 System.out.println("Title of the page " +driver.getTitle());
	}

}
