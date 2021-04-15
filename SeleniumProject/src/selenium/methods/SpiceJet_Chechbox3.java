package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet_Chechbox3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		WebElement chkbox = driver.findElement(By.id("ctl00_mainContent_chk_Govt"));
		if(!chkbox.isSelected()) {
			chkbox.click();
		}
		
	}

}
