package demos;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail_Before_After_Method {

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
	/* o/p: Login Test
			Receive Mail Test
			Logout Test
			Login Test
			Send Mail Test
			Logout Test
			PASSED: receiveMail
			PASSED: sendMail
			
			===============================================
			    Default test
			    Tests run: 2, Failures: 0, Skips: 0
			===============================================
			
			===============================================
			Default suite
			Total tests run: 2, Failures: 0, Skips: 0
			===============================================
	*/
}
