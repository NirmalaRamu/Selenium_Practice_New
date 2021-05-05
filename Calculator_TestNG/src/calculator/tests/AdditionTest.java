package calculator.tests;

import org.testng.annotations.Test;
import calculator.library.Addition;
import utils.AppUtils;

public class AdditionTest extends AppUtils
{
	@Test
	public void addition()
	{
		Addition add = new Addition();
		add.add();
	}
}
