package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Rows_Count 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws1 = wb.getSheet("Login_Details");
		//Here names are also case sensitive
		//here we have to import the class having package import org.apache.poi.ss.usermodel.Sheet; for XSSF
		//For HSSF we have to import import org.apache.poi.sl.usermodel.Sheet;
		Sheet ws2 = wb.getSheet("Employee_Details");
		int ws1rowcount = ws1.getLastRowNum();
		int ws2rowcount = ws2.getLastRowNum();
		System.out.println("No. of rows in Sheet1 "+ws1rowcount);
		System.out.println("No. of rows in Sheet2 "+ws2rowcount);
		wb.close();
		fi.close();
	}
	/* o/p: No. of rows in Sheet1 3
			No. of rows in Sheet2 2
	*/
}
