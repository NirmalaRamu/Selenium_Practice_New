package selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrimusBank_Handling_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(2000);
		 Alert alert = driver.switchTo().alert();
		 System.out.println(alert.getText());
		 if (alert.getText().contains("Incorrect")) {
			alert.accept();
		}else {
			alert.dismiss();
		}

	}

}
