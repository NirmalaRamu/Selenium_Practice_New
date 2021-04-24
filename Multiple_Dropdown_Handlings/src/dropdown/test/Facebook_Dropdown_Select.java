package dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.UIUtils;

public class Facebook_Dropdown_Select extends UIUtils
{
	@Parameters({"day","month","year"})
	@Test
	public void selectdropdowns(String day,String month,String year) throws InterruptedException
	{		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement delement,melement,yelement;
		delement = driver.findElement(By.xpath("//*[@id='day']"));
		melement = driver.findElement(By.xpath("//*[@id='month']"));
		yelement = driver.findElement(By.xpath("//*[@id='year']"));
		
		UIUtils.selectItem(driver, delement, day);
		UIUtils.selectItem(driver, melement, month);
		UIUtils.selectItem(driver, yelement, year);
	}
	
}
