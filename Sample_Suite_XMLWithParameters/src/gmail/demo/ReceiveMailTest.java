package gmail.demo;

import org.testng.annotations.Test;
import utils.AppUtils;

public class ReceiveMailTest extends AppUtils
{
	@Test
	public void checkReceiveMail()
	{
		System.out.println("Receive mail test");
		/* Here if we did not give extends class we get the below o/p
		   o/p: Receive mail test
				PASSED: checkReceiveMail
				
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
			Receive mail test
			Gmail logout
			PASSED: checkReceiveMail
			
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
