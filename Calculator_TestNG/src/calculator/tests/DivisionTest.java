package calculator.tests;

import org.testng.annotations.Test;
import calculator.library.Division;
import utils.AppUtils;

public class DivisionTest extends AppUtils
{
	@Test
	public void division()
	{
		Division div = new Division();
		div.div();
	}
}
