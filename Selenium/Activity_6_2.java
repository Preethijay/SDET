package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new FirefoxDriver();
     driver.get("https://training-support.net/selenium/tables");
     
     List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'ui sortable')]/thead/tr/th"));
     
     List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'ui sortable')]/tbody/tr"));
     
     System.out.println("Number of columns = " + cols.size());
     System.out.println("Number of rows = " + rows.size());
     
     WebElement cellValueBeforeSort = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable')]/tbody/tr[2]/td[2]"));
     System.out.println("Second row and second column value (before sort) :" +cellValueBeforeSort.getText());
     
     driver.findElement(By.xpath("//table[contains(@class, 'ui sortable')]/thead/tr/th[2]")).click();
     
     WebElement cellValueAfterSort = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable')]/tbody/tr[2]/td[2]"));
     System.out.println("Second row and second column value (after sort) :" +cellValueAfterSort.getText());
     
     WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
     System.out.println("Table footer values: " + footer.getText());

     //Close browser
     driver.close();
     
	}

}
