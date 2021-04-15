package selenium.methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Gmail_Window_IE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		
		String currentwindowid = driver.getWindowHandle();
		System.out.println(currentwindowid);
		
		driver.findElement(By.linkText("Sign in")).click();
		
		String anotherwindowid = driver.getWindowHandle();
		System.out.println(anotherwindowid);

	}

}
