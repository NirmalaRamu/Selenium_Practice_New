package selenium.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_getTitle {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();
		
		String pgtitle = driver.getTitle();
		
		System.out.println(pgtitle);
		
		//driver.close();
	}

}
