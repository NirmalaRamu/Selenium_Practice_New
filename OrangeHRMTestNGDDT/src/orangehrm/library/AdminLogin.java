package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class AdminLogin extends AppUtils
{
	public boolean adminLoginforValidData(String aname,String apass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(aname);
		driver.findElement(By.id("txtPassword")).sendKeys(apass);
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else{
			return false;
		}
	}
	
	public boolean adminLoginforInvalidData(String aname,String apass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(aname);
		driver.findElement(By.id("txtPassword")).sendKeys(apass);
		driver.findElement(By.id("btnLogin")).click();
		String errmsg = driver.findElement(By.id("spanMessage")).getText();
		if(errmsg.toLowerCase().contains("invalid"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void adminLogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
