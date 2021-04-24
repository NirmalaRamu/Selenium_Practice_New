package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UIUtils extends AppUtils
{

	public static void selectItem(WebDriver driver,WebElement element,String item)
	{
		Select dropdownlist = new Select(element);
		dropdownlist.selectByVisibleText(item);
	}
	
}
