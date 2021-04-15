package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBank_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.xpath("//img[@src='images/mainlinks_03.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='images/mainlinks_04.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='images/mainlinks_05.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='images/mainlinks_06.jpg']")).click();

	}

}
