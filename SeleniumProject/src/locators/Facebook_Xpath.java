package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("kakkereninirmala@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("mummynimmi");
		driver.findElement(By.xpath("//*[starts-with(@id,'u_0_d_')]")).click();

	}

}
