package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class CloseBrowser {
   
	WebDriver driver;
	 
    @And("^close the browser$")
    public void Close()
    {
 	   driver.quit();
    }
}
