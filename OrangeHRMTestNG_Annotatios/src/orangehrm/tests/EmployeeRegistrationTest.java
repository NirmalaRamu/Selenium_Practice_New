package orangehrm.tests;

import org.testng.annotations.Test;
import orangehrm.library.Employee;

public class EmployeeRegistrationTest extends AdminLoginPageTest
{
	@Test
	public void empRegistration() throws InterruptedException
	{
		Employee emp = new Employee();
		emp.addEmployee("Ramya", "New");
	}
	/*@Test
	public void empRegistration() throws InterruptedException
	{
		LoginPage lp = new LoginPage();
		lp.adminLogin("Admin", "Qedge123!@#");
		
		Employee emp=new Employee();
		emp.addEmployee("First", "Last");
		
		Thread.sleep(2000);
		lp.adminLogout();
	}*/
	/*public static void main(String[] args) throws InterruptedException  {
		
		AppUtils.launchApp();
		
		LoginPage lp = new LoginPage();
		lp.adminLogin("Admin", "Qedge123!@#");
		
		Employee emp=new Employee();
		boolean res=emp.addEmployee("Rahim", "qedge");
		if(res)
		{
			System.out.println("employee test case passs ");
		}
		else
		{
			System.out.println("test case fail");
		}
		
	}*/

}
