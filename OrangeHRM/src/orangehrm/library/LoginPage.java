package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils{
	
	public boolean adminLogin(String uname,String upass) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(upass);
		driver.findElement(By.id("btnLogin")).click();
		
		if(driver.findElement(By.linkText("Admin")).isDisplayed()) 
		{
			return true;
		}else {
		return false;
		}
		
	}
	
	public void adminLogout() {
		
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
