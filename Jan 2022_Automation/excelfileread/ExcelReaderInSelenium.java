package excelfileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\Test.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		XSSFSheet sheet=workbook.getSheet("Test");
		
		String company_name = sheet.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(company_name);
		
		String data=sheet.getRow(3).getCell(0).getStringCellValue();
		String value=sheet.getRow(3).getCell(1).getStringCellValue();
		
		System.out.println(data+":"+value);
		
		data=sheet.getRow(4).getCell(0).getStringCellValue();
		int value1=(int)sheet.getRow(4).getCell(1).getNumericCellValue();
		
		System.out.println(data+":"+value1);
		
		System.out.println(sheet.getLastRowNum());
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		int n=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<n;i++)
		{
			System.out.println(sheet.getRow(0).getCell(i).getStringCellValue());
		}
	}

}
