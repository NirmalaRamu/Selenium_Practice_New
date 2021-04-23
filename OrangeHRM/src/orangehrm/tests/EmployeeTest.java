package orangehrm.tests;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeTest extends AppUtils{
	
	public static void main(String[] args) throws InterruptedException {
		
		launchApp("http://orangehrm.qedgetech.com");
		
		LoginPage login = new LoginPage();
		login.adminLogin("Admin", "Qedge123!@#");
		
		Employee emp = new Employee();
		emp.addEmp("Qedge", "Suresh Babu", "G:\\Kids\\0.jpg");
		Thread.sleep(2000);
		emp.editemp("Nirmala", "Mattapalli", "28", "May", "1978", "Female", "Married");
		Thread.sleep(2000);
		emp.adminCreateUser("Qedge123!@#", "Qedge123!@#");
		Thread.sleep(2000);
		
		login.adminLogout();
		
		Thread.sleep(2000);
		emp.emplogin();
		Thread.sleep(2000);
		emp.emplogout();
		
		/*boolean res = emp.searchemp();
		if(res)
		{
			System.out.println("employee test case passs ");
		}
		else
		{
			System.out.println("test case fail");
		}
		
		Thread.sleep(2000);
		
		emp.deleteemp();
		
		//login.adminLogout();
		
		//closeApp();
*/		
	}

}
