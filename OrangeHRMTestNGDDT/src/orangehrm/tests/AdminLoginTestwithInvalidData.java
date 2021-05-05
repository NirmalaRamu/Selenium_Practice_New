package orangehrm.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.library.AdminLogin;
import utils.AppUtils;
import utils.XLUtils;

public class AdminLoginTestwithInvalidData extends AppUtils
{

	@Test
	public void checkAdminLogin() throws IOException, InterruptedException
	{
		String datafile = "C:\\Users\\NIRMALA\\git\\Selenium_Practice_New\\OrangeHRMTestNGDDT\\OrangeHRMTestXLFiles\\TestData1.xlsx";
		String datasheet = "AdminLoginInvalidData";
		String aname,apass;
		
		AdminLogin al = new AdminLogin();
		int rowcount = XLUtils.getRowCount(datafile, datasheet);
		for (int i=1;i<=rowcount;i++) {
			aname = XLUtils.getStringCellData(datafile, datasheet, i, 0);
			apass = XLUtils.getStringCellData(datafile, datasheet, i, 1);
			boolean res = al.adminLoginforInvalidData(aname, apass);
			Assert.assertTrue(res);
			if(res)
			{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Pass");
				XLUtils.fillGreenColor(datafile, datasheet, i, 2);
			}else
			{
				XLUtils.setCellData(datafile, datasheet, i, 2, "Fail");
				XLUtils.fillRedColor(datafile, datasheet, i, 2);
			}
			Thread.sleep(2000);
		}
	}

}
