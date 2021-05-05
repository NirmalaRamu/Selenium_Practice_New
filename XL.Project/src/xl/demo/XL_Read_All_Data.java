package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Read_All_Data 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login_Details");
		int rowcount = ws.getLastRowNum();
		for (int i = 1; i <= rowcount; i++) {
			Row row = ws.getRow(i);
			Cell c1 = row.getCell(0);
			Cell c2 = row.getCell(1);
			String uid = c1.getStringCellValue();
			String pwd = c2.getStringCellValue();
			System.out.println(uid+" "+pwd);
		}
		wb.close();
		fi.close();
	}
	/* o/p: Ramu Ramu123
			Nirmala Nimmi123
			Nimmi Ramu123
	*/
}
