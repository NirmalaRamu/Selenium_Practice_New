package selenium.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Window_Handling2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		String currentwindowid = driver.getWindowHandle();
		
		System.out.println(currentwindowid);
		
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindowids = driver.getWindowHandles();
		
		System.out.println(allwindowids);
		/* o/p: curreentwindowid
				allwindowids=[currentwindowid,new window id]
				
				CDwindow-924BBE10AC042EEB847F3AA5A0F7CA84
				[CDwindow-924BBE10AC042EEB847F3AA5A0F7CA84, CDwindow-19FECCB2769538866879711727B42B29]
		*/

	}

}
