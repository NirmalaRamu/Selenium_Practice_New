package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Equals_Method {

	@Test
	public void test()
	{
		String exptitle,acttitle;
		exptitle = "Google";
		acttitle = "Gmail";
		Assert.assertEquals(acttitle, exptitle);
	}
		/* o/p: FAILED: test
				java.lang.AssertionError: expected [Google] but found [Gmail]
				
				===============================================
				    Default test
				    Tests run: 1, Failures: 1, Skips: 0
				===============================================
				
				===============================================
				Default suite
				Total tests run: 1, Failures: 1, Skips: 0
				===============================================
		*/	
}
