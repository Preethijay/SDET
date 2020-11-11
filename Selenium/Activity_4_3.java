package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     driver.get("https://www.training-support.net/selenium/target-practice");
     
   //  System.out.println("Title of the page: " + driver.getTitle());
     
     String title= driver.getTitle();
     System.out.println("Title of the page " +title);
     
     //Find the third header
     String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
     System.out.println("Third header text is " + thirdHeader);
     
     //Find the fifth header
     String fifthHeader = driver.findElement(By.xpath("//h5")).getCssValue("color");
     System.out.println("Fifth header color is " + fifthHeader);
     
     //Find Violet color
     String Violetcolor = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
     System.out.println("Class attributes for Violet color " +Violetcolor);
     
     //Find the grey button
     String GreyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
     System.out.println("Grey Button text is " +GreyButton);
     
     
     driver.close();
	}

}
