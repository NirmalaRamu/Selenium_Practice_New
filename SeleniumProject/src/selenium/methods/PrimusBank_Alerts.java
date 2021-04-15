package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusBank_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		String a = driver.switchTo().alert().getText();
		System.out.println(a);
		// o/p: InCorrect BankerName/Password

	}

}
