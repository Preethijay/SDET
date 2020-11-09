package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		//Open the browser
		driver.get("https://www.training-support.net");
		Thread.sleep(1000);
			
		//Close the browser
		driver.close();
	}

}
