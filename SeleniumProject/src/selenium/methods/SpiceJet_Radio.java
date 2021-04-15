package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet_Radio {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		
	}

}
