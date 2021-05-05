package xl.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Sample_Test {

	public static void main(String[] args) throws IOException{
		
		FileInputStream fi = new FileInputStream("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData1.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		wb.createSheet("TestData2");
		FileOutputStream fo = new FileOutputStream("F:\\Qedge Suresh Babu\\SampleTestDataExcel\\TestData2.xlsx");
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();
		
	}
	
}
