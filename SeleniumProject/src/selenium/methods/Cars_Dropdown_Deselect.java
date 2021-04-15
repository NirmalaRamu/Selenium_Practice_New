package selenium.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cars_Dropdown_Deselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/Qedge%20Suresh%20Babu/cars.html");
		
		WebElement carelement = driver.findElement(By.id("cars"));
		
		Select carlistbox = new Select(carelement);
		
		carlistbox.selectByVisibleText("BMW");
		
		carlistbox.selectByIndex(1);
		
		Thread.sleep(2000);
		
		carlistbox.deselectAll();
		/* it will work only for the code having MULTIPLE word in it
		 
		    <label for="cars">Choose a car:</label>
			<select name="cars" id="cars" multiple>    
			  <option>Select</option>
			  <option value="v">Volvo</option>
			  <option value="b">BMW</option>
			  <option value="m">Mercedes</option>
			  <option value="a">Audi A6. Rs. 54.42 - 59.42 Lakh* (Price in New Delhi)</option>
			</select> 
		 */
		
	}

}
