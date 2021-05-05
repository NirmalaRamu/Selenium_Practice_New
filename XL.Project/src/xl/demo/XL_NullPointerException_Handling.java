package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_NullPointerException_Handling {

	public static void main(String[] args) throws IOException
	{
		File f = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login_Details");
		Row row = ws.getRow(1);
		String data;
		try{
			Cell cell = row.getCell(2);
			data = cell.getStringCellValue();
		}catch(Exception e){
			data = "";
		}
		System.out.println(data);
		wb.close();
		fi.close();
	}

}
