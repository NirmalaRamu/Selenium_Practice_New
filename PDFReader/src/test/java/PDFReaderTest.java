import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PDFReaderTest {

	@Test
	public void readPDFTest() throws IOException
	{
		/*System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.axmag.com/download/UserGuide.pdf");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		URL url = new URL(currentUrl);
		*/
		
		// url in localdrive
		URL url = new URL("file:///cucumber_tutorial.pdf");
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument document = null;
		document = PDDocument.load(fileParse);
		String pdfContent = new PDFTextStripper().getText(document);
		System.out.println(pdfContent);
		
		Assert.assertTrue(pdfContent.contains("Table"));
	}
}
//https://www.youtube.com/watch?v=jeN9WeTowGg