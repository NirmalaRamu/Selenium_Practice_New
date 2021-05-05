package orangehrm.library;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import utils.AppUtils;

public class Employee extends AppUtils
{
	public String empid;
	public boolean addEmployee(String fname,String lname)
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println(empid);
		driver.findElement(By.id("btnSave")).click();
		return true;
	}
}
