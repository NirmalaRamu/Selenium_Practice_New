package orangehrm.tests;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class LoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage login = new LoginPage();
		boolean res = login.adminLogin("Admin", "Qedge123!@#");
		if (res) {
			System.out.println("Admin Login Test Pass");
		} else {
			System.out.println("Admin Login Test Fail");
		}
		
		Thread.sleep(2000);
		
		login.adminLogout();
		
		AppUtils.closeApp();
		
	}

}
