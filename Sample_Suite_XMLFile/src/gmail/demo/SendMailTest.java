package gmail.demo;

import org.testng.annotations.Test;

import utils.AppUtils;

public class SendMailTest extends AppUtils
{
	@Test
	public void checkSendMail()
	{
		System.out.println("Send mail test");
		/* Here if we did not give extends class we get the below o/p
		   o/p: Send mail test
				PASSED: checkSendMail
				
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
	/* o/p: Launch gmail app
			Gmail login
			Send mail test
			Gmail logout
			PASSED: checkSendMail
			
			===============================================
			    Default test
			    Tests run: 1, Failures: 0, Skips: 0
			===============================================
			
			Close gmail app
			
			===============================================
			Default suite
			Total tests run: 1, Failures: 0, Skips: 0
			===============================================
	*/
}
