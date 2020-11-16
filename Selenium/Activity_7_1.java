package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Activity_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		    driver.get("https://training-support.net/selenium/selects");
		    
		    WebElement chosen = driver.findElement(By.id("single-value"));
		    
		    Select dropdwn1 = new Select(driver.findElement(By.id("single-select")));
		    
		    dropdwn1.selectByVisibleText("Option 2");
		    System.out.println("Chosen text is " +chosen.getText());
		    
		    dropdwn1.selectByIndex(3);
		    System.out.println("Chosen option is " +chosen.getText());
		    
		    dropdwn1.selectByValue("4");
		    System.out.println("Chosen option is " +chosen.getText());
		    
		    List<WebElement> options = dropdwn1.getOptions();
		    for(WebElement option : options) {
		    	System.out.println("Options are " +option.getText());
		        }
		    
		    driver.close();
	}

}
