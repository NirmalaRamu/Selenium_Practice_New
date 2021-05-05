package xl.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Cell_Colors {

	public static void main(String[] args) throws IOException
	{
		File ipfile = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		File opfile = new File("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData2.xlsx");
		FileInputStream fi = new FileInputStream(ipfile);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet ws = wb.getSheet("Login_Details");
		Row row = ws.getRow(1);
		Row row1 = ws.getRow(2);
		Cell cell = row.createCell(2);
		Cell cell1 = row1.createCell(2);
		cell.setCellValue("Pass");
		cell1.setCellValue("Fail");
		CellStyle style1 = wb.createCellStyle();
		style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell.setCellStyle(style1);
		CellStyle style2 = wb.createCellStyle();
		style2.setFillForegroundColor(IndexedColors.RED.getIndex());
		style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		cell1.setCellStyle(style2);
		FileOutputStream fo = new FileOutputStream(opfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
	}

}
