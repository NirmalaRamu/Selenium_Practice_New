package demos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_Before_After_Suite {

	@Test
	public void sendMail() 
	{
		System.out.println("Send Mail Test");	
	}
	@Test
	public void receiveMail()
	{
		System.out.println("Receive Mail Test");	
	}
	@BeforeMethod
	public void loginGmail() 
	{
		System.out.println("Login Test");	
	}
	@AfterMethod
	public void logoutGmail()
	{
		System.out.println("Logout Test");	
	}
	@BeforeTest
	public void launchGmail()
	{
		System.out.println("Launch Test");
	}
	@AfterTest
	public void closeGmail()
	{
		System.out.println("Close Test");
	}
	@BeforeSuite
	public void invokeBrowser()
	{
		System.out.println("Open Browser");
	}
	@AfterSuite
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	/* o/p: Open Browser
			Launch Test
			Login Test
			Receive Mail Test
			Logout Test
			Login Test
			Send Mail Test
			Logout Test
			Close Test
			PASSED: receiveMail
			PASSED: sendMail
			
			===============================================
			    Default test
			    Tests run: 2, Failures: 0, Skips: 0
			===============================================
			
			Close Browser
			
			===============================================
			Default suite
			Total tests run: 2, Failures: 0, Skips: 0
			===============================================
	*/
}
