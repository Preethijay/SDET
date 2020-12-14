package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobVacancy {
	WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on OrangeHRM page$")
    public void userIsOnOrangePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    
    }
    
   @When("^User logs in$")
   public void enterCredentials() {
       //Enter username
       driver.findElement(By.id("txtUsername")).sendKeys("orange");
       //Enter password
       driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
       //Click Login
       driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
   }
    
   @And("^Navigate to Recruitment page$")
    public void recruitmentPage( ) {
	   // recruitment tab
	   driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	   }

   
   @Then("^Click on the Vacancies menu item$")
   public void Vacancies( ) {
	   
	   driver.findElement(By.id("menu_recruitment_viewJobVacancy")).click();
	  //  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("menu_recruitment_viewJobVacancy")));
   }
   
   @And("^Click on the Add button$")
   public void addJobVacancy() {
	  
	  // driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
	   driver.findElement(By.cssSelector("#btnAdd")).click();
   }
   
   @Then("^Fill out the necessary details and click on save$")
   public void addDetails() {
	   WebDriverWait wait = new WebDriverWait(driver,30);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div/div[1]/h1")));
	 
	//   WebElement jobTitle = driver.findElement(By.id("addJobVacancy_jobTitle"));
	   
	 //Find element using locator
	   Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"addJobVacancy_jobTitle\"]")));

	  	    dropdown.selectByIndex(3);
 
	   
	 WebElement vacancyName =  driver.findElement(By.id("addJobVacancy_name"));
	 WebElement hiringMgr = driver.findElement(By.id("addJobVacancy_hiringManager"));
	 WebElement noOfPosition = driver.findElement(By.id("addJobVacancy_noOfPositions"));
	 WebElement description = driver.findElement(By.id("addJobVacancy_description"));
	 
	 
	   vacancyName.sendKeys("TestDevOps13");
	   hiringMgr.sendKeys("orange hrm");
	   noOfPosition.sendKeys("2");
	   description.sendKeys("Devops Job opening for gradute hires");
	   
	   driver.findElement(By.id("btnSave")).click(); 
	   
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnBack")));
	   driver.findElement(By.id("btnBack")).click(); 
	 
	
   }
   
   @And("^Verify the vacancy is created$")
     public void created() {
     
	   Select jobTitle = new Select(driver.findElement(By.id("vacancySearch_jobTitle")));
	   jobTitle.selectByIndex(3);
	   
	//   WebDriverWait wait = new WebDriverWait(driver,30);
	   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vacancySearch_jobVacancy")));
	   
	   Select Vacancy = new Select(driver.findElement(By.id("vacancySearch_jobVacancy")));
	   Vacancy.selectByValue("TestDevOps13");
	   
	   driver.findElement(By.id("btnSrch")).click();
	   
  	//   String Input = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[2]/a"));
     //  System.out.println("The checkbox Input is displayed: " + Input.isDisplayed());
	   
       String result = driver.findElement(By.id("resultTable")).getText();
       Assert.assertTrue(result.contains("TestDevOps13"));
	
	   
	   
   }
   
  
}