package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Checking_Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		if(driver.findElement(By.xpath("//input[@value='Reset Password']")).isDisplayed())
		{
			System.out.println("True");
		}else {
			System.out.println("False");
		}

	}

}
