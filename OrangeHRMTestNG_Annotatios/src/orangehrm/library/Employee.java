package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.AppUtils;

public class Employee extends AppUtils{
	
	public boolean addEmployee(String fname,String lname) throws InterruptedException 
	{
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		System.out.println(empid);
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee List")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[2]/input")).sendKeys(empid);
		//driver.findElement(By.name("empsearch[id]")).sendKeys(empid);
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		Thread.sleep(5000);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(5000);
		WebElement resultstable=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=resultstable.findElements(By.tagName("tr"));
		List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
		String tableempid=cols.get(1).getText();
		
		if(tableempid.equals(empid))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
