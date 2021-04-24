package onTestFailScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    public static WebDriver driver;
    
    //Browser should only opened once during whole test execution
    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
    }
    
    //Browser will be closed after all the methods in FirstTest are finished execution
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}