package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_linktext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.com/open-source/register-to-download/");
		driver.findElement(By.linkText("Resources")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		//System.out.println(links.get(0).getText());
		
		//System.out.println(links.get(10).getText());
		
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
		//driver.quit();
		

	}

}
