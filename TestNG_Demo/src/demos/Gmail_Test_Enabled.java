package demos;

import org.testng.annotations.Test;

public class Gmail_Test_Enabled {

	@Test
	public void sendMail() 
	{
		System.out.println("Send Mail Test");
	}
	@Test(enabled=false)
	//If enabled = false means it will stops execution of that method by default enabled = true
	public void receiveMail()
	{
		System.out.println("Receive Mail Test");	
	}
	/* o/p: Send Mail Test
			PASSED: sendMail
			
			===============================================
			    Default test
			    Tests run: 1, Failures: 0, Skips: 0
			===============================================
			
			===============================================
			Default suite
			Total tests run: 1, Failures: 0, Skips: 0
			===============================================
	*/
}
