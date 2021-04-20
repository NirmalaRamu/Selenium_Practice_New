package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_False_Method {

	@Test
	public void Test1()
	{
		boolean res = true;
		Assert.assertFalse(res);
	}
	@Test
	public void Test2()
	{
		boolean res = false;
		Assert.assertFalse(res);
	}
	/* o/p: PASSED: Test2
			FAILED: Test1
			java.lang.AssertionError: expected [false] but found [true]
			
			===============================================
			    Default test
			    Tests run: 2, Failures: 1, Skips: 0
			===============================================
			
			
			===============================================
			Default suite
			Total tests run: 2, Failures: 1, Skips: 0
			===============================================
	*/
}
