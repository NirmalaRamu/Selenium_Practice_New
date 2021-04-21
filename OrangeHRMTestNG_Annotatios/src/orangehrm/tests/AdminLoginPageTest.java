package orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import orangehrm.library.AdminLoginPage;
import utils.AppUtils;

public class AdminLoginPageTest extends AppUtils
{
	AdminLoginPage lp = new AdminLoginPage();
	@BeforeTest
	public void adminLoginTest()
	{
		boolean res = lp.adminLogin();
		Assert.assertTrue(res);
	}
	@AfterTest
	public void adminLogoutTest()
	{
		lp.adminLogout();
	}
	/*@Test
	public void adminLoginTest(){
		
		LoginPage lp = new LoginPage();
		boolean res = lp.adminLogin();
		Assert.assertTrue(res);
		
		lp.adminLogout();
	}*/
	/*public static void main(String[] args) 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage lp = new LoginPage();		
		boolean res = lp.adminLogin("Admin", "Qedge123!@#");
		if(res)
		{
			System.out.println("Admin Login Test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");
		}
		lp.adminLogout();
		AppUtils.closeApp();

	}
*/
}
