package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Registration {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/open-source/register-to-download/");
		
		driver.findElement(By.name("FirstName")).sendKeys("Nirmala");
		driver.findElement(By.name("LastName")).sendKeys("Mattapalli");
		driver.findElement(By.name("CompanyName")).sendKeys("Ramu");
		driver.findElement(By.name("Industry")).sendKeys("Testing");
		driver.findElement(By.name("JobTitle")).sendKeys("Tester");
		driver.findElement(By.name("Email")).sendKeys("nirmalamattapalli11@gmail.com");
		driver.findElement(By.name("Phone")).sendKeys("8484616655");
		driver.findElement(By.name("NoOfEmployees")).sendKeys("0-10");
		driver.findElement(By.name("Country")).sendKeys("India");
		


}

	
}
