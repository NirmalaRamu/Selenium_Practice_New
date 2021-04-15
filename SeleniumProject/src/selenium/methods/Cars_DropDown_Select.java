package selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Cars_DropDown_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Qedge%20Suresh%20Babu/cars.html");
		
		WebElement carelement = driver.findElement(By.id("cars"));
		
		Select carlist = new Select(carelement);
		
		carlist.selectByValue("b");
		
		carlist.selectByVisibleText("Mercedes");
		
		List<WebElement> carlistbox = carlist.getOptions();
		
		System.out.println(carlistbox.size());
				
		for (int i = 1; i < carlistbox.size(); i++) {
			
			String carname = carlistbox.get(i).getText();
			
			System.out.println(carname);
			
		}
	}
}
