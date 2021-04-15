package selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet_Radio1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://spicejet.com");
		List<WebElement> traveltype = driver.findElement(By.id("travelOptions")).findElements(By.tagName("label"));
		System.out.println(traveltype.size());
		// o/p:3
		for (int i = 0; i < traveltype.size(); i++) {
			System.out.println(traveltype.get(i).getText());
			/* o/p: One Way
					Round Trip
					Multicity
			*/
		}
	}

}
