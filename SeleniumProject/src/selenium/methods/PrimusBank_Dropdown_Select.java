package selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusBank_Dropdown_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		Select branchlistbox = new Select(driver.findElement(By.id("drlist")));
		
		List<WebElement> branchlist = branchlistbox.getOptions();
		
		System.out.println(branchlist.size());
		
		for (int i = 0; i < branchlist.size(); i++) {
			
			System.out.println(branchlist.get(i).getText());
		}
		

	}

}
