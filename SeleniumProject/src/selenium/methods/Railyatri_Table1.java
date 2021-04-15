package selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Railyatri_Table1 {

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
		
		//CTRL+/ FOR COMMENTING ONE LINE OF CODE
		//CTRL+SHIFT+/ FOR COMMENTING MULTIPLE LINES OF CODE
		
		/*List<WebElement> cols = timetable.findElements(By.tagName("td"));
		System.out.println(cols.size());
		// o/p:6
		*/
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String trainno = cols.get(0).getText();
			String trainname = cols.get(1).getText();
			System.out.println(trainno+"  "+trainname);
			// o/p: prints all trainnumbers and names
					
		}
		
	}

}
