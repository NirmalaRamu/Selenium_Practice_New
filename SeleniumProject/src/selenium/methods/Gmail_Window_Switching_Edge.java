package selenium.methods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail_Window_Switching_Edge {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		Object[] windows = allwindows.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		// o/p: Gmail
		//      Google Account Help
		
		Thread.sleep(2000);
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		/* o/p:Gmail
			   Google Account Help
			   Gmail
		*/

	}

}
