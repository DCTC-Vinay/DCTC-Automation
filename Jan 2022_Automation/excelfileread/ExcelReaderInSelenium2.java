package excelfileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderInSelenium2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\Test.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		XSSFSheet sheet=workbook.getSheet("Test");
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println(n);
		
		for(int i=0;i<n;i++)
		{
			System.out.print(sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.print(":"+sheet.getRow(i).getCell(1).getStringCellValue());
			System.out.println();
		}
	}

}
