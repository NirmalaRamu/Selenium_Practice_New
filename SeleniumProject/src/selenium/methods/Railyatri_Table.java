package selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Railyatri_Table {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://railyatri.in/time-table");
		WebElement timetable = driver.findElement(By.tagName("table"));
		List<WebElement> rows = timetable.findElements(By.tagName("tr"));
		System.out.println(rows.size()-1);
		// o/p:26
		
	}

}
