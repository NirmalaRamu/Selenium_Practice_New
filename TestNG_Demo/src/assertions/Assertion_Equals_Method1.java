package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Equals_Method1 {

	@Test
	public void test()
	{
		String exptitle,acttitle;
		exptitle = "Google";
		acttitle = "Google";
		Assert.assertEquals(acttitle, exptitle);
	}
		/* o/p: PASSED: test

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
