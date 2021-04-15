package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Checking_Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String expurl,acturl;
		
		expurl = "gmail";
		acturl = driver.getCurrentUrl();
		
		System.out.println(acturl);
		
		if(acturl.toLowerCase().contains(expurl))
		{
			System.out.println("Pass");
		}else
		{
			System.out.println("Fail");
		}
	}
}
