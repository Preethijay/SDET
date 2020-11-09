package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		//title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
		
		//Locators for "About us" using id()
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in element using ID " + idLocator.getText());
		
		//Locators using className()
		WebElement classNameLocator = driver.findElement(By.className("green"));
		System.out.println("Text in element using className "  + classNameLocator.getText());
		
		//Locators using linkText()
		WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
		System.out.println("Text in element using linkText  " + linkTextLocator.getText());
		
		//Locators using cssSelector()
		WebElement cssSelector = driver.findElement(By.cssSelector(".green"));
		System.out.println("Text in element using cssSelector " + cssSelector.getText());
		
		//Locators using cssSelector() id
		WebElement cssSelectorID = driver.findElement(By.cssSelector("#about-link"));
		System.out.println("Text in element using cssSelector ID" + cssSelectorID.getText());
		
		
		//Close the browser
		driver.close();
	}

}
