package screenshot.capture;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_ScreenShot {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://gmail.com");
		screenShot("Gmail_ScreenShot");
		
	}

	public static void screenShot(String filename) throws IOException
	{
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/NIRMALA/git/"
				+ "Selenium_Practice_New/SeleniumProject/ScreenShots/"+filename+".jpg"));
	}
}
