package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal_Mouse_Actions_Edge {
 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://snapdeal.com");
	
		Actions act = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[2]/ul/li[3]/a/span[2]"));
		act.moveToElement(element);
		act.build().perform();
		act.contextClick(driver.findElement(By.linkText("Smart TVs")));
		act.build().perform();

	}

}
