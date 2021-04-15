import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simplealert{
 public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
  // This step will result in an alert on screen
    Thread.sleep(5000);
    driver.findElement(By.id("alertButton")).click();
    Alert simpleAlert = driver.switchTo().alert();
    simpleAlert.accept();
  }
}