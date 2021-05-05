package calculator.library;

import org.openqa.selenium.By;
import utils.AppUtils;

public class Division extends AppUtils
{
	public void div()
	{
		driver.findElement(By.xpath("//input[@value='5']")).click();
		driver.findElement(By.xpath("//input[@value='/']")).click();
		driver.findElement(By.xpath("//input[@value='9']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		String res = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(res);
	}
}
