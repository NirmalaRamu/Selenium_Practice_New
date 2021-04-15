package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Window_Handling1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		String currentwindowid = driver.getWindowHandle();
		
		System.out.println(currentwindowid);
		
		driver.findElement(By.linkText("Help")).click();
		
		String anotherwindowid = driver.getWindowHandle();
		
		System.out.println(anotherwindowid);
		// o/p: Here currentwindowid and anotherwindowid both are same

	}

}
