package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_partiallinkText {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.com/open-source/register-to-download/");
		driver.findElement(By.linkText("Resources")).click();
		
		List<WebElement> link = driver.findElements(By.partialLinkText("Policy"));
		
		System.out.println(link.size());
		
		for(int i=0;i<link.size();i++)
		{
			System.out.println(link.get(i).getText());
		}
}

}
