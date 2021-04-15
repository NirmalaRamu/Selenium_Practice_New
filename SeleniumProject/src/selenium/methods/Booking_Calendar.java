package selenium.methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Booking_Calendar {

	public static void main(String[] args) {
		
		String flydate = "23/March/2022";
		String[] temp = flydate.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://booking.com");
		
		driver.findElement(By.xpath("//form/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span")).click();
		
		String calmonthyear = driver.findElement(By.className("bui-calendar__month")).getText();
		String[] x = calmonthyear.split(" ");
		String calmonth = x[0];
		String calyear = x[1];
		
		while(!calyear.equals(year)) {
			driver.findElement(By.xpath("//form/div[1]/div[2]/div[2]/div/div/div[2]")).click();
			calmonthyear = driver.findElement(By.className("bui-calendar__month")).getText();
			x = calmonthyear.split(" ");
			calmonth = x[0];
			calyear = x[1];
		}
		while(!calmonth.equalsIgnoreCase(month)) {
			driver.findElement(By.xpath("//form/div[1]/div[2]/div[2]/div/div/div[2]")).click();
			calmonthyear = driver.findElement(By.className("bui-calendar__month")).getText();
			x = calmonthyear.split(" ");
			calmonth = x[0];
			calyear = x[1];
		}
		
		WebElement cal = driver.findElement(By.className("bui-calendar__dates"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		boolean flag = false;
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				String caldate = cols.get(j).getText();
				if(caldate.equals(date)) {
					cols.get(j).click();
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
		
	}

}
