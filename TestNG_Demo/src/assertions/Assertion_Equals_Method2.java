package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Equals_Method2 {

	@Test
	public void test()
	{
		String exptitle,acttitle;
		exptitle = "Google";
		acttitle = "google";
		Assert.assertEquals(acttitle.toLowerCase(), exptitle.toLowerCase());
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
