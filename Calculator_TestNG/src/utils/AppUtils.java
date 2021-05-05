package utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class AppUtils {

	public static WebDriver driver;
	//public static String url = "http://calc.qedgetech.com";
	
	@Parameters("url")
	@BeforeTest
	public static void launchApp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	@AfterTest
	public static void closeApp()
	{
		driver.close();
	}
}
