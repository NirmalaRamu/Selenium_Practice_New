package retryFailTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	static int counter = 0;

	//This test will always pass
	@Test(priority=1)
	public void testLogin() {
		System.out.println("This is login test");
	}
	
	
	//This test will be executed maxRetryCount number of times, as defined in RetryFailTestCase.java
	@Test(priority=2)
	public void failTest() {
		counter++;
		System.out.println(counter +" Attempt");
		Assert.assertEquals(counter, 2);
		
	}
	
	
}