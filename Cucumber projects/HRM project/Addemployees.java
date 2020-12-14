package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addemployees {
	WebDriver driver;
    WebDriverWait wait;
	
    @Given("^User on OrangeHRM page.$")
    public void serIsOnOrangePage() throws Throwable {
    	            //Create a new instance of the Firefox driver
            driver = new FirefoxDriver();
            wait = new WebDriverWait(driver, 15);
                    
            //Open the browser
            driver.get("http://alchemy.hguy.co/orangehrm");
               
    }
    
    @When("^user enter\"(.*)\"and\"(.*)\"$")
      	 public void user_enter_and(String username, String password) throws Throwable {	
    	        //Enter username from Feature file	
    	        driver.findElement(By.id("txtUsername")).sendKeys(username);	

    	        //Enter password from Feature file	
    	        driver.findElement(By.id("txtPassword")).sendKeys(password);	

    	        //Click Login	
    	        driver.findElement(By.xpath("//input[@type='submit']")).click();
    	 }
    
    
	@Then("^Find the PIM option in the menu and click it$")
	public void NavigateToPim() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Welcome")));   
		
		//Read the page title and heading

        String pageTitle = driver.getTitle();        

        //Print the page title and heading

        System.out.println("Page title is: " + pageTitle);

        //Navigate to PIM

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("menu")));

        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		
		
	}
	
	@And("^Click the Add button to add a new Employee$")

    public void ClickonAdd(){

    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnAdd")));

         driver.findElement(By.xpath("//input[@id='btnAdd']")).click();	
     //    driver.findElement(By.id("btnAdd")).click();
    }
	
	  @And("^Fill out the necessary details\"(.*)\"and\"(.*)\"$")

	    public void Fill_out_the_necessary_detailsand(String firstname, String lastname) throws Throwable{

	    	// Entering Firstname

		    WebElement First_Name = driver.findElement(By.xpath("//input[@id = 'firstName']"));	    

		    First_Name.sendKeys(firstname);

		    // Entering Lastname

	        WebElement  Last_Name= driver.findElement(By.xpath("//input[@id='lastName']"));

	        Last_Name.sendKeys(lastname);
	        
	      

	    }
	
	  @Then("^Save and Verify that the employees have been created\"(.*)\"$")
	  	  public void Save_and_Verify_that_the_employees_have_been_createdand(String employeeid) throws Throwable{

		  driver.findElement(By.xpath("//input[@id='btnSave']")).click();

	    	driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();	

	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchBtn")));    	

	    	WebElement ID= driver.findElement(By.xpath("//input[@id='empsearch_id']"));

	        ID.sendKeys(employeeid);
	       
	        
	        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();

	        String employee_id = driver.findElement(By.linkText(employeeid)).getText();

	    	Assert.assertEquals(employee_id,employeeid);

	    	driver.close();
	
}


}
