package orangehrm.library;

import org.openqa.selenium.By;
import utils.AppUtils;

public class AdminLoginPage extends AppUtils
{
	public String uid = "Admin";
	public String pwd = "Qedge123!@#";
	
	public boolean adminLogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}else
		{
			return false;
		}
	}
	public void adminLogout()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
	}
	
	
}
