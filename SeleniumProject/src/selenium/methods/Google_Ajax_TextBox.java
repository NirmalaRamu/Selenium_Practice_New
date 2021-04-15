package selenium.methods;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Ajax_TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		List<WebElement> keywordlist = driver.findElement(By.className("erkvQe")).findElements(By.tagName("li"));
		
		System.out.println(keywordlist.size());
		//o/p: here if we did not give timeout condition o/p will be '0'
		//If we give o/p is 10
		
		//String keyword = keywordlist.get(0).getText();
		
		//System.out.println(keyword);
		//o/p:10
		//	  Selenium
		
		/*
		for (int i = 0; i < keywordlist.size(); i++) {
			
			String keyword = keywordlist.get(i).getText();
			System.out.println(keyword);
			
		}
		
		/* o/p: 10
				selenium
				selenium interview questions
				selenium tutorial
				selenium download
				selenium webdriver
				selenium testing
				seleniumhq
				selenium ide
				selenium rich foods
				selenium webdriver download
				
		*/
		
		
		//I want to click the Selenium download option
		
		keywordlist.get(3).click();
		
		

	}

}
