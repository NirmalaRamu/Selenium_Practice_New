package assertions;

import org.testng.annotations.Test;

public class Sample_Test {

	@Test
	public void check()
	{
		String exptitle,acttitle;
		exptitle = "Google";
		acttitle = "Gmail";
	}
		/* Here their is no comparison for acttitle and exptitle but test result is pass
		   to overcome this problem we go for Assertions
		   o/p: PASSED: check
			
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
