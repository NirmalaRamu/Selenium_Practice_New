package demos;

import org.testng.annotations.Test;

public class Gmail_Test {

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
	/* o/p: @Test annotation follows ALPHABETICAL order
			Receive Mail Test
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
