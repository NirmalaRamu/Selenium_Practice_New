package selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Window_Handling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		String windowid = driver.getWindowHandle();
		
		System.out.println(windowid);
		// o/p: CDwindow-A8CDE4720D8371D00D432F1D495389E8
		// Here id value will change with session to session
	}

}
