
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
		Thread.sleep(2000);
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
		
		
		driver.findElement(By.id("btnSave")).click();
		
		
		driver.findElement(By.linkText("Employee List")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
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
	public boolean empLoginAdmin(String uname,String upass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(upass);
		driver.findElement(By.id("btnLogin")).click();
		try {
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	public boolean empLoginESS(String uname,String upass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(upass);
		driver.findElement(By.id("btnLogin")).click();
		try {
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return false;
		} catch (Exception e) {
			return true;
		}
		
	}
	public boolean logout() {

		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		if(driver.findElement(By.id("btnLogin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
}
