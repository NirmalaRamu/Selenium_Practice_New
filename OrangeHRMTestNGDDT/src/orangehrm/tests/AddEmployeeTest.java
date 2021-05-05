package orangehrm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.library.AdminLogin;
import orangehrm.library.Employee;
import utils.AppUtils;
import utils.XLUtils;

public class AddEmployeeTest extends AppUtils
{
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		String datafile = "C:\\Users\\NIRMALA\\git\\Selenium_Practice_New\\OrangeHRMTestNGDDT\\OrangeHRMTestXLFiles\\TestData1.xlsx";
		String datasheet = "AddEmployee";
		String fname,lname;
		AdminLogin al = new AdminLogin();
		Employee addemp = new Employee();
		int rowcount = XLUtils.getRowCount(datafile, datasheet);
		for(int i=1;i<=rowcount;i++)
		{
			fname = XLUtils.getStringCellData(datafile, datasheet, i, 0);
			lname = XLUtils.getStringCellData(datafile, datasheet, i, 1);
			boolean res = addemp.addEmployee(fname, lname);
			Assert.assertTrue(res);
			if(res)
			{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Pass");
				XLUtils.fillGreenColor(datafile, datasheet, i, 2);
			}else{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Fail");
				XLUtils.fillRedColor(datafile, datasheet, i, 2);
			}
			Thread.sleep(2000);
		}
		al.adminLogout();
	}
}
