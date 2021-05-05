package calculator.library;

import org.openqa.selenium.By;
import utils.AppUtils;

public class Multiplication extends AppUtils
{
	public void mul()
	{
		driver.findElement(By.xpath("//input[@value='6']")).click();
		driver.findElement(By.xpath("//input[@value='x']")).click();
		driver.findElement(By.xpath("//input[@value='8']")).click();
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		String res = driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(res);
	}
}
