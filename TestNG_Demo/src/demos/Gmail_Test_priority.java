package demos;

import org.testng.annotations.Test;

public class Gmail_Test_priority {

	@Test(priority=0)
	public void sendMail() 
	{
		System.out.println("Send Mail Test");	
	}
	@Test(priority=1)
	public void receiveMail()
	{
		System.out.println("Receive Mail Test");	
	}
	/* o/p: Send Mail Test
			Receive Mail Test
			PASSED: sendMail
			PASSED: receiveMail
			
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
