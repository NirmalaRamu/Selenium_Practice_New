package selenium.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Window_Focusing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		Object[] windows = allwindows.toArray();
		//String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		
		driver.switchTo().window(window2);
		driver.findElement(By.linkText("Community")).click();

	}

}
