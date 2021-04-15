package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Dropdown_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement dayelement = driver.findElement(By.id("day"));
		Select daylistbox = new Select(dayelement);
		daylistbox.selectByIndex(28);
		
		Select monthlistbox = new Select(driver.findElement(By.id("month")));
		monthlistbox.selectByVisibleText("Dec");
		
		Select yearlistbox = new Select(driver.findElement(By.id("year")));
		yearlistbox.selectByValue("1988");

	}

}
