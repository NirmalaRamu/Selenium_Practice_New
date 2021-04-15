package selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Primusbank_CurrentUrls {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			links.get(i).click();
			
			String pgurl = driver.getCurrentUrl();
			
			System.out.println(pgurl);
			
			driver.navigate().back();
			
			links = driver.findElements(By.tagName("a"));
			
			// If above line is not there then program will throw StateElementReferenceException
		}

	}

}
