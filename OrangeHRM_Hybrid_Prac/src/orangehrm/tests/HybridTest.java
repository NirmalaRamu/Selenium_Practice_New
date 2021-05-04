package orangehrm.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;
import utils.XLUtils;

public class HybridTest extends AppUtils
{
	@Test
	public void orangeHRMTestSuite() throws IOException, InterruptedException
	{
		LoginPage lp = new LoginPage();
		Employee emp = new Employee();
		User user = new User();
		String keywordfile = "F:\\Mars_Eclipse\\OrangeHRM_Hybrid_Prac\\keywordfiles\\OrangeHRMKeywords.xlsx";
		String tcsheet = "TestCases";
		String tssheet = "TestSteps";
		
		int tccount = XLUtils.getRowCount(keywordfile, tcsheet);
		int tscount = XLUtils.getRowCount(keywordfile, tssheet);
		
		String tcid,tcexeflag,tstcid,keyword;
		String adminuid,adminpwd;
		String empfname,emplname;
		String emprole,empfullname,empuname,emppwd;
		String tcresult,tsresult;
		boolean res = false;
		
		for(int i=1;i<=tccount;i++)
		{
			tcid = XLUtils.getStringCellData(keywordfile, tcsheet, i, 0);
			tcexeflag = XLUtils.getStringCellData(keywordfile, tcsheet, i, 2);
			if(tcexeflag.equalsIgnoreCase("y"))
			{
				for(int j=1;j<=tscount;j++)
				{
					tstcid = XLUtils.getStringCellData(keywordfile, tssheet, j, 0);
					if(tstcid.equalsIgnoreCase(tcid))
					{
						keyword = XLUtils.getStringCellData(keywordfile, tssheet, j, 4);
						switch (keyword.toLowerCase()) 
						{
						case "adminlogin":
							adminuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							adminpwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = lp.adminLogin(adminuid, adminpwd);
							break;
						case "adminlogout":
							res = lp.Logout();
							break;
						case "newempregadmin":
							empfname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							emplname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = emp.addEmployee(empfname, emplname);
							break;
						case "newempregess":
							empfname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							emplname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = emp.addEmployee(empfname, emplname);
							break;
						case "newuserregadmin":
							emprole = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							empfullname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							empuname = XLUtils.getStringCellData(keywordfile, tssheet, j, 7);
							emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 8);
							res = user.addUser(emprole, empfullname, empuname, emppwd);
							break;
						case "newuserregess":
							emprole = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							empfullname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							empuname = XLUtils.getStringCellData(keywordfile, tssheet, j, 7);
							emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 8);
							res = user.addUser(emprole, empfullname, empuname, emppwd);
							break;
						case "emploginadmin":
							empuname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = emp.empLoginAdmin(empuname, emppwd);
							break;
						case "emplogoutadmin":
							res = emp.logout();
							break;
						case "emploginess":
							empuname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
							emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
							res = emp.empLoginESS(empuname, emppwd);
							break;
						case "emplogoutess":
							res = emp.logout();
							break;
						}
						// Code to update TestStep Result in 2nd sheet
						if(res)
						{
							tsresult = "Pass";
							XLUtils.setCellData(keywordfile, tssheet, j, 3, tsresult);
							XLUtils.fillGreenColor(keywordfile, tssheet, j, 3);
						}else
						{
							tsresult = "Fail";
							XLUtils.setCellData(keywordfile, tssheet, j, 3, tsresult);
							XLUtils.fillRedColor(keywordfile, tssheet, j, 3);
						}
						// Code to update TestCase Result in 1st sheet
						tcresult = XLUtils.getStringCellData(keywordfile, tcsheet, i, 3);
						if(!tcresult.equalsIgnoreCase("Fail"))
						{
							XLUtils.setCellData(keywordfile, tcsheet, i, 3, tsresult);
						}
						// Code to fill colors in TestCase Result in 1st sheet
						if(tcresult.equalsIgnoreCase("Pass"))
						{
							XLUtils.fillGreenColor(keywordfile, tcsheet, i, 3);
						}else
						{
							XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
						}
					}
				}
			}else{
				XLUtils.setCellData(keywordfile, tcsheet, i, 3, "Blocked");
				XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
			}
		}
	}
}