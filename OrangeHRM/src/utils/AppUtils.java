package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppUtils {
	
	public static WebDriver driver;
	
	public static void launchApp(String url) {
		
	/* Here public: can access throughout the application/project. It is optional.
	 * 		static: can access in both static and non-static methods.
	 * 		public static: can access this static method throughout the application/project.
	 * 		void: means method is not returning any value. 	
	 */
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	public static void closeApp() {
		
		driver.close();
		
	}

}
