package calculator.tests;

import org.testng.annotations.Test;
import calculator.library.Subtraction;
import utils.AppUtils;

public class SubtractionTest extends AppUtils
{
	@Test
	public void subtraction()
	{
		Subtraction sub = new Subtraction();
		sub.sub();
	}
}
