package filereadinselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\DataRead.xlsx";
		
		File f=new File(actual_path);
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		String data=sheet.getRow(1).getCell(0).getStringCellValue();
		
		String value=sheet.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(data+" : "+value);
		
		data=sheet.getRow(4).getCell(0).getStringCellValue();
		
		int n=(int)sheet.getRow(4).getCell(1).getNumericCellValue();
		
		//double n=sheet.getRow(4).getCell(1).getNumericCellValue();
		
		System.out.println(data+" : "+n);
		
		short x = sheet.getRow(0).getLastCellNum();
		System.out.println("0th Row Last Cell :"+x);
		
		System.out.println("Last Row: "+sheet.getLastRowNum());
		
		System.out.println("Physical Rows: "+sheet.getPhysicalNumberOfRows());
	}

}
