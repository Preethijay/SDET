package stepDefinitions;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCandidate {
	
	WebDriver driver;
    WebDriverWait wait;
    File file = new File("src/test/resources/resume.txt");
    
    @Given("^User on OrangeHRM welcome page$")
   public void userIsOnOrangePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    
    }
    
    @When("^User logs in to the site$")
    public void enterCredentials() {
       //Enter username
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        //Enter password
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        //Click Login
      driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
    }
    
    @And("^Navigate to Recruitment page and click on Add button$")
    public void recruitmentPage( ) {
	   // recruitment tab
	   driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
	   }
    
    @And("^Click on the Add button to add a candidate$")
    public void addCandidate() {
 	  
 	  // driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
 	   driver.findElement(By.cssSelector("#btnAdd")).click();
 	  
    }
    
    @Then("^Fill in the details of the candidate$")
    public void details() {
    	
    	WebElement firstName = driver.findElement(By.id("addCandidate_firstName"));
    	WebElement lastName = driver.findElement(By.id("addCandidate_lastName"));
    	WebElement Email = driver.findElement(By.id("addCandidate_email"));
    	WebElement keyword = driver.findElement(By.id("addCandidate_keyWords"));
    //	WebElement jobVacancy = driver.findElement(By.id("addCandidate_vacancy"));
    	
    	//Select job title

    	WebElement JobVacancy=driver.findElement(By.id("addCandidate_vacancy"));

    	Select dropdown = new Select(JobVacancy);

    	dropdown.selectByVisibleText("Automation Test Engineer");
    	
    	firstName.sendKeys("Preethi");
    	lastName.sendKeys("Test1");
    	Email.sendKeys("preethi@email.com");
    	keyword.sendKeys("test");
    	//jobVacancy.sendKeys(keysToSend);
    	
    //	 Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"addCandidate_vacancy\"]")));
    //	 dropdown.selectByIndex(1291);
    	 	 		  		
    	     	 
    }
    
    @And("^Upload the resume and click on save$")
    public void uploadResume(){
    	
    	// WebElement resume = driver.findElement(By.id("addCandidate_resume")).click();
    
    	   WebElement uploadInput = driver.findElement(By.id("addCandidate_resume"));    	
           uploadInput.sendKeys(file.getAbsolutePath());
    	
    	
    	 driver.findElement(By.id("btnSave")).click();
    }
    
    @And("^Navigate back to the Recruitments page$")
    public void verify() {
    	
    	driver.findElement(By.id("btnBack")).click();	
  
    WebElement name =driver.findElement(By.id("candidateSearch_candidateName"));
    WebElement keyword = driver.findElement(By.id("candidateSearch_keywords"));
    
    name.sendKeys("Preethi Test1");
    keyword.sendKeys("test");	

    WebElement JobVacancy1=driver.findElement(By.id("candidateSearch_jobVacancy"));
	Select dropdown1 = new Select(JobVacancy1);

	dropdown1.selectByVisibleText("Automation Test Engineer");
    
	WebElement Status=driver.findElement(By.id("candidateSearch_status"));

	Select dropdown3 = new Select(Status);

	dropdown3.selectByVisibleText("Application Initiated");
	
	
    driver.findElement(By.id("btnSrch")).click();
    
    String name1 =driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[3]/a")).getText();
    Assert.assertEquals(name1, "Preethi Test1");
    }
    
    
   @And("^close windows$")
   public void Close()
   {
	   driver.quit();
   }
    
}
