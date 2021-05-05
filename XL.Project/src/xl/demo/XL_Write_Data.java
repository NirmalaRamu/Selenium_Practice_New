package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Write_Data {

	public static void main(String[] args) throws IOException
	{
		File ipfile = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		File opfile = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData2.xlsx");
		FileInputStream fi = new FileInputStream(ipfile);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login_Details");
		Row row = ws.getRow(1);
		Cell cell = row.createCell(2);
		cell.setCellValue("Pass");
		FileOutputStream fo = new FileOutputStream(opfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}
}
