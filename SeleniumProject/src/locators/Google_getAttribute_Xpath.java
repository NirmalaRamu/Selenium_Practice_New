package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_getAttribute_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		//driver.findElement(By.linkText("Gmail")).click();
		
		String x = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(x);
		
		// here getting the link of gmail in google.com page
		// o/p: Value in href="https://mail.google.com/mail/&ogbl"
		
		String y = driver.findElement(By.name("q")).getAttribute("title");
		System.out.println(y);
		
		//o/p: Value in title="Search"
		
		//String z = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).getAttribute("value");
		
		String z = driver.findElement(By.xpath("//center/input[1]")).getAttribute("value");
		System.out.println(z);
		
		// o/p: Google Search
		
		String a = driver.findElement(By.name("btnI")).getAttribute("value");
		System.out.println(a);
		
		// o/p: I'm Feeling Lucky

	}

}
