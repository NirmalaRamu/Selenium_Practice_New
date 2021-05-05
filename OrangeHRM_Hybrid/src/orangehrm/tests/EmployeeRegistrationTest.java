package orangehrm.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orangehrm.library.AdminModuleConstants;
import orangehrm.library.Employee;

public class EmployeeRegistrationTest extends AdminModuleConstants
{

	
	
	@Parameters({"fname","lname"})
	@Test
	public void checkNewEmployeeReg(String fname,String lname) throws InterruptedException
	{
		Employee emp = new Employee();
		boolean res = emp.addEmployee(fname, lname);
		Assert.assertTrue(res);
		
	}
		

	

}
