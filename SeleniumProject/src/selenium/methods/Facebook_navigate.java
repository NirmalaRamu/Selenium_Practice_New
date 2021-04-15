package selenium.methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_navigate {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.close();
	}
}
