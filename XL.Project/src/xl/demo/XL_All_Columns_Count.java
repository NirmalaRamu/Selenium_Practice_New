package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_All_Columns_Count 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login_Details");
		int rowcount = ws.getLastRowNum();
		for (int i = 0; i < rowcount; i++) {
			Row row = ws.getRow(i);
			int colcount = row.getLastCellNum();
			System.out.println("Row no. "+i+" No. of columus: "+colcount);
		}
		wb.close();
		fi.close();
	}
	/* o/p: Row no. 0 No. of columus: 3
			Row no. 1 No. of columus: 2
			Row no. 2 No. of columus: 2
	*/
}
