package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_True_Method {

	@Test
	public void Test1()
	{
		boolean res = true;
		Assert.assertTrue(res);
	}
	@Test
	public void Test2()
	{
		boolean res = false;
		Assert.assertTrue(res);
	}
	/* o/p: PASSED: Test1
			FAILED: Test2
			java.lang.AssertionError: expected [true] but found [false]
			
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
