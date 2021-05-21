package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://selenium.dev");
		
		driver.findElement(By.linkText("Downloads")).click();
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("F:\\seleniumdownload.exe");
		
	}

}
