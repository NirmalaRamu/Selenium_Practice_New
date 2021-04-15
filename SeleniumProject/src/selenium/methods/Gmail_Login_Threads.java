package selenium.methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login_Threads {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Firefox Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("http://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("kakkereninirmala@gmail.com");
		
	
	}

}
