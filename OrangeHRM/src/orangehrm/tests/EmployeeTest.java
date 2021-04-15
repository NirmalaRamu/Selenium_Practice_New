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
		//emp.addEmp("Ramu", "Mattapalli", "G:\\Kids\\0.jpg");
		
		//Thread.sleep(2000);
		
		//emp.editemp("Nirmala", "Mattapalli", "28", "May", "1978", "Female", "Married");
		
		Thread.sleep(2000);
		
		emp.searchemp("0595");
		
		Thread.sleep(2000);
		
		emp.deleteemp();
		
		//login.adminLogout();
		
		//closeApp();
		
	}

}
