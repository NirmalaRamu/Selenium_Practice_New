package dropdown.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.UIUtils;

public class PrimusBank_Dropdown_Select extends UIUtils
{
	@Parameters("item")
	@Test
	public void selectDropdown(String item)
	{
		WebElement element = driver.findElement(By.xpath("//*[@id='drlist']"));
		UIUtils.selectItem(driver, element, item);
	}
	
}
