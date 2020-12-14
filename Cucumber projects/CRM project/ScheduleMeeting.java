package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScheduleMeeting {
	WebDriver driver;
    WebDriverWait wait;
    
    

    @Given("^The user is at welcome page$")

    public void Welcome() {
   	  	driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://alchemy.hguy.co/crm/index.php?action=Login&module=Users");

    }
    
    @And("^User enters details Username and Password$")
    public void Admin_user_login_and() throws Throwable {
 	   	driver.findElement(By.id("user_name")).sendKeys("admin");
	    driver.findElement(By.id("username_password")).sendKeys("pa$$w0rd");
	    driver.findElement(By.id("bigbutton")).click();

	    }
    
    @When ("^User navigates to Activities option$")
    public void ClickActivities() {
    	
    	//Activities tab
   			WebElement ActivitiesTab = driver.findElement(By.xpath("//*[@id='grouptab_3']"));
   			wait.until(ExpectedConditions.elementToBeClickable(ActivitiesTab));
    			//click on activities tab

    		//	ActivitiesTab.click();
    }
    
    @And ("^Select the Meeting option")

    public void ClickMeeting() throws InterruptedException {
    	Thread.sleep(1000);
    WebElement Meetingoption= driver.findElement(By.xpath("//*[@id='moduleTab_9_Meetings']"));
   
 //  WebElement Meetingoption= driver.findElement(By.id("moduleTab_Meetings']"));
   
     	
    Meetingoption.click();
   	Meetingoption.click();
		Thread.sleep(5000);
		
		/html/body/div[3]/div/div/div[1]/ul/li[1]/a/div[1]/span

    }
    
    @And ("^Clicks on Schedule a Meeting option$")
    public void ClickScheduleMeeting()  throws InterruptedException {
    	driver.findElement(By.linkText("Schedule Meeting")).click();
    	Thread.sleep(5000);

    }
    
    @And ("^User first enters the\"(.*)\"and add to meeting$")

    public void AddFirstinvitee (String FirstName) throws Throwable {
 	   	WebElement FirstInvitee = driver.findElement(By.id("search_first_name"));
    	FirstInvitee.sendKeys(FirstName);
    	Thread.sleep(3000);
    	driver.findElement(By.id("invitees_search")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("invitees_add_1")).click();
    	    }
    
    @And ("^User second enters the\"(.*)\"and add to meeting$")

    public void AddSecondinvitee(String SecondName) throws Throwable {
    	WebElement SecondInvitee = driver.findElement(By.id("search_first_name"));
    	SecondInvitee.clear();
    	SecondInvitee.sendKeys(SecondName);
      	driver.findElement(By.id("invitees_search")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("invitees_add_1")).click();
    }
    
    @And ("^User third enters the\"(.*)\"and add to meeting$")

    public void AddThirdinvitee(String ThirdName) throws Throwable {
    	WebElement ThirdInvitee = driver.findElement(By.id("search_first_name"));
    	ThirdInvitee.clear();
    	ThirdInvitee.sendKeys(ThirdName);
    	driver.findElement(By.id("invitees_search")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.id("invitees_add_1")).click();

    }
    
    @Then ("^Navigates to the View Meetings Page$")
    public void ClickViewMeeting() throws InterruptedException {
    	driver.findElement(By.linkText("View Meetings")).click();
      Thread.sleep(3000);

    }
    
    @And ("^confirm the meeting")
    public void ValidateMeeting()  {
       	if(driver.findElement(By.linkText("Meeting to Discuss Business")).isDisplayed())
    	{
    		System.out.println("The Meeting is scheduled successfully");
		    	}
    	

    	else
    	{
    		System.out.println("The meeting could not be scheduled");
    	}

    }
    
    @And ("^Close$")

    public void closebrowser() {
    	driver.close();

    }
    
}
