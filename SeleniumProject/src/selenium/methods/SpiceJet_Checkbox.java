package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet_Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_chk_Govt")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_chk_Govt")).click();

	}

}
