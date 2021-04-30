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
		String datafile = "F:\\Mars_Eclipse\\OrangeHRMTestNGDDT\\OrangeHRMTestXLFiles\\TestData1.xlsx";
		String datasheet = "AdminLoginInvalidData";
		String uname,upass;
		
		AdminLogin al = new AdminLogin();
		int rowcount = XLUtils.getRowCount(datafile, datasheet);
		for (int i=1;i<=rowcount;i++) {
			uname = XLUtils.getStringCellData(datafile, datasheet, i, 0);
			upass = XLUtils.getStringCellData(datafile, datasheet, i, 1);
			boolean res = al.adminLoginforInvalidData(uname, upass);
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