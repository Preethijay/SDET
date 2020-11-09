package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver = new FirefoxDriver();
      driver.get("https://www.training-support.net/selenium/simple-form");
      
      String title= driver.getTitle();
      System.out.println("Title of the page " +title);
      
      WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
      WebElement lastName = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
      
      firstName.sendKeys("Preethi");
      lastName.sendKeys("Jayakumar");
      
      WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
      email.sendKeys("aabd@example.com");
      
      driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("9886037502");
      
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[5]/textarea")).sendKeys("Hello There!!");
      
      //Submit
      driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/form/div/div[6]/div[1]/input")).click();
      
      Thread.sleep(1000);
      driver.close();
	}

}
