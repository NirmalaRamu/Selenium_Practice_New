package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Window_FireFox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
		String currentwindowid = driver.getWindowHandle();
		System.out.println(currentwindowid);
		
		driver.findElement(By.linkText("Help")).click();
		
		String anotherwindowid = driver.getWindowHandle();
		System.out.println(anotherwindowid);

	}

}
