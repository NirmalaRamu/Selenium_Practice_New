package selenium.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM_Calendar_Select {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("Recruitment")).click();
		driver.findElement(By.linkText("Candidates")).click();
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		
		String appdate = "11/Dec/2020";
		String[] temp = appdate.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		
		Select monthlist,yearlist;
		
		monthlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		monthlist.selectByVisibleText(month);
		
		yearlist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		yearlist.selectByVisibleText(year);
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		
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
			if (flag) {
				break;
			}
		}
		
		driver.findElement(By.id("candidateSearch_toDate")).click();
		
		String appdate1 = "28-Nov-2022";
		String[] temp1 = appdate1.split("-");
		String date1 = temp1[0];
		String month1 = temp1[1];
		String year1 = temp1[2];
		
		Select monthlist1,yearlist1;
		
		monthlist1 = new Select(driver.findElement(By.className("ui-datepicker-month")));
		monthlist1.selectByVisibleText(month1);
		
		yearlist1 = new Select(driver.findElement(By.className("ui-datepicker-year")));
		yearlist1.selectByVisibleText(year1);
		
		WebElement cal1 = driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> rows1 = cal1.findElements(By.tagName("tr"));
		boolean flag1 = false;
		for (int i = 1; i < rows1.size(); i++) {
			List<WebElement> cols1 = rows1.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols1.size(); j++) {
				String caldate1 = cols1.get(j).getText();
				if (caldate1.equals(date1)) {
					cols1.get(j).click();
					flag1 = true;
					break;
				}
				
			}
			if (flag1) {
				break;
			}
		}

	}

}
