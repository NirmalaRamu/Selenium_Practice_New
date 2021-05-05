package calculator.tests;

import org.testng.annotations.Test;
import calculator.library.Multiplication;
import utils.AppUtils;

public class MultiplicationTest extends AppUtils
{
	@Test
	public void multiplication()
	{
		Multiplication mul = new Multiplication();
		mul.mul();
	}
}
