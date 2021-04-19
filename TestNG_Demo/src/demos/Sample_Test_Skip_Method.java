package demos;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Sample_Test_Skip_Method {

	@Test
	public void a()
	{
		System.out.println("Print A");
	}
	@Test
	public void b()
	{
		System.out.println("Print B");
		throw new SkipException("This method skipped for some reason");
	}
	@Test
	public void c()
	{
		System.out.println("Print C");
	}
	/* o/p: Print A
			Print B
			Print C
			PASSED: a
			PASSED: c
			SKIPPED: b
			org.testng.SkipException: This method skipped for some reason
			
			===============================================
			    Default test
			    Tests run: 3, Failures: 0, Skips: 1
			===============================================
			
			===============================================
			Default suite
			Total tests run: 3, Failures: 0, Skips: 1
			===============================================
	*/
}
