package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Checking_Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		String pgtitle = driver.getTitle();
		
		System.out.println(pgtitle);
		
		String exptitle,acttitle;
		
		exptitle = "sign up for facebook";
		acttitle = driver.getTitle();
		
		if(acttitle.toLowerCase().contains(exptitle))
		{
			System.out.println("Sign up link working, Test Pass");
		}else
		{
			System.out.println("Sign up link not working, Test Fail");
		}

	}

}
