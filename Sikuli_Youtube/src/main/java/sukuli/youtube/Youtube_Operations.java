package sukuli.youtube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Youtube_Operations {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		
		Screen s = new Screen();
		
		Pattern playImg = new Pattern("YT_Play.PNG");
		s.wait(playImg,2000);
		s.click();
		
		Pattern pauseImg = new Pattern("YT_Pause.PNG");
		s.wait(pauseImg,2000);
		s.click();
		
		Pattern settingsImg = new Pattern("YT_Settings.PNG");
		s.wait(settingsImg,2000);
		s.click();
		
		Pattern autoImg = new Pattern("YT_Auto.PNG");
		s.wait(autoImg,2000);
		s.click();
		
		Pattern qualityImg = new Pattern("YT_144.PNG");
		s.wait(qualityImg,2000);
		s.click();
	}

}
