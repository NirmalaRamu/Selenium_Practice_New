package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJet_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://spicejet.com");
		
		driver.findElement(By.xpath("//*[contains(@id,'StudentDiscount')]")).click();
	}

}
