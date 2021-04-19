package demos;

import org.testng.annotations.Test;

public class Gmail_Test1 {

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
	public void login() 
	{
		System.out.println("login Test");	
	}
	public void logout()
	{
		System.out.println("logout Test");	
	}
	/* Only @Test annotation methods will be tested.
	   o/p: Receive Mail Test
			Send Mail Test
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
