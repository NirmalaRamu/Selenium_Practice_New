package orangehrm.library;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utils.AppUtils;

public class Employee extends AppUtils{

	public String empid,empfname,emplname,empfullname,emppassword,empusername;
	
	public void addEmp(String fname,String lname,String photo) throws InterruptedException {
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		//driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.id("lastName")).sendKeys(lname);
		
		empid = driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.id("photofile")).sendKeys(photo);
		driver.findElement(By.id("btnSave")).click();
		
	}
	
	public void editemp(String fname,String lname,String date,String month,String year,String gender,String mstatus) throws InterruptedException {
		
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys(fname);
		driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute(fname);
		empfname = driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value");
		
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).getAttribute(lname);
		emplname = driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
		
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys(lname);
		emplname = driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value");
		driver.findElement(By.id("personal_txtLicExpDate")).click();
		empfullname = empfname+" "+emplname;
		
		// Code for License Expiry date
		Select monthlist,yearlist;
		
		monthlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		monthlist.selectByVisibleText(month);
		
		yearlist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		yearlist.selectByVisibleText(year);
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows = cal.findElements(By.tagName("tr"));
		boolean flag = false;
		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) {
				String caldate = cols.get(j).getText();
				if (caldate.equals(date)) {
					cols.get(j).click();
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		
		// Code for Gender Male Radio Button
		WebElement gmale = driver.findElement(By.id("personal_optGender_1"));
		if (gender.equalsIgnoreCase("Male")) {
			gmale.click();
		}
		
		// Code for Gender Male Radio Button
		WebElement gfemale = driver.findElement(By.id("personal_optGender_2"));
		if (gender.equalsIgnoreCase("Female")) {
			gfemale.click();
		}
		
		//Code for Marital Status dropdown		
		Select status = new Select(driver.findElement(By.id("personal_cmbMarital")));
		status.selectByVisibleText(mstatus);
		
		driver.findElement(By.xpath("//form/fieldset/p/input")).click();
	}
	
	public void adminCreateUser(String username,String password) throws InterruptedException
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu_admin_viewAdminModule"))).build().perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("menu_admin_UserManagement"))).build().perform();
		
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empfullname);		
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		empusername = driver.findElement(By.id("systemUser_userName")).getAttribute("value");
		driver.findElement(By.id("systemUser_password")).sendKeys(password);
		emppassword = driver.findElement(By.id("systemUser_password")).getAttribute("value");
		Thread.sleep(2000);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(password);
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
	}
	
	public boolean searchUser() throws InterruptedException
	{
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys(empusername);
		driver.findElement(By.className("searchbutton")).click();
		Thread.sleep(5000);
		WebElement result = driver.findElement(By.id("resultTable"));
		List<WebElement> rows = result.findElements(By.tagName("tr"));
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		if(cols.get(1).getText().equalsIgnoreCase(empusername))
		{
			return true;
		}else{
			return false;
		}
		
	}
	public boolean emplogin()
	{
		driver.findElement(By.id("txtUsername")).sendKeys(empusername);
		driver.findElement(By.id("txtPassword")).sendKeys(emppassword);
		driver.findElement(By.id("btnLogin")).click();
		try {
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return false;
		} catch (Exception e) {
			return true;
		}
		
	}
	
	public void emplogout()
	{
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	public boolean searchemp() throws InterruptedException 
	{
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		//driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(ename);
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();	
		
		WebElement resultstable=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=resultstable.findElements(By.tagName("tr"));
		List<WebElement> cols=rows.get(1).findElements(By.tagName("td"));
		String tableempid=cols.get(1).getText();
		
		if(tableempid.equals(empid))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void empListNext() throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		Thread.sleep(2000);
		
		//Last Button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[10]/a")).click();
		Thread.sleep(2000);
		//First Button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		//Next Button
		driver.findElement(By.xpath("//*[@id=\"frmList_ohrmListComponent\"]/div[1]/ul/li[9]/a")).click();
		Thread.sleep(2000);
		//Previous
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[3]/a")).click();
		
	}
	
	public void resetemp(String ename,String eid,String status) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("PIM"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(ename);
		driver.findElement(By.id("empsearch_id")).sendKeys(eid);
		
		Select empstatus = new Select(driver.findElement(By.id("empsearch_employee_status")));
		empstatus.selectByVisibleText(status);
		
		Thread.sleep(2000);
		driver.findElement(By.id("resetBtn")).click();
	}
	
	public void deleteemp() throws InterruptedException {
		
		//code for single row delete
		//driver.findElement(By.name("chkSelectRow[]")).click();
		
		//code for multiple rows deletion
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		driver.findElement(By.className("delete")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[3]/input[1]")).click();
		
		driver.findElement(By.id("resetBtn")).click();
		
	}
}
