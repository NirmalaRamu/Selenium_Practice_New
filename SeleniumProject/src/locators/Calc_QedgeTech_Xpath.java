package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calc_QedgeTech_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://calc.qedgetech.com");
		
		/*
		driver.findElement(By.xpath("//*[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='+']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='=']")).click();
		*/
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='+']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='=']")).click();
		
		String result = driver.findElement(By.name("display")).getAttribute("value");
		
		System.out.println(result);

	}

}
