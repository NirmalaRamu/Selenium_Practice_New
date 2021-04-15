package selenium.methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Gmail_Window_MicrosoftEdge {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://gmail.com");
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		Object[] windows = allwindows.toArray();
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		System.out.println(window1);
		System.out.println(window2);
		/* o/p:[CDwindow-3AFA1DFDCF6F7E4B445902BDA17FA4F1, CDwindow-B091A80F560066D66B17BB8364639AF1]
			   CDwindow-3AFA1DFDCF6F7E4B445902BDA17FA4F1
			   CDwindow-B091A80F560066D66B17BB8364639AF1
		*/

	}

}
