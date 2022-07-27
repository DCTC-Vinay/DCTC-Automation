package excelfileread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class ExcelFileRead {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileRead i=new ExcelFileRead();
		i.read_file();
	}

	public void read_file() throws IOException
	{
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\TestData.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Employee Data");
		
		String address=sheet.getRow(1).getCell(0).getStringCellValue();
		String address_value=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(address+" : "+address_value);
		
		String emp_id=sheet.getRow(3).getCell(0).getStringCellValue();
		int emp_id_value = (int)sheet.getRow(3).getCell(1).getNumericCellValue();
		
		System.out.println(emp_id+" : "+emp_id_value);
		
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println("Physical no of rows:"+n);
		
		int m=sheet.getLastRowNum();
		System.out.println("Last Row:"+m);
		
		int o=sheet.getRow(3).getLastCellNum();
		System.out.println("Last Column No :"+o);
	}
	
}
