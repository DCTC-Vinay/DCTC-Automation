package filereadinselenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadInSelenium2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\DataRead.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		//ArrayList<String> key=new ArrayList();
		//ArrayList<String> value=new ArrayList();
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int n=sheet.getRow(0).getLastCellNum();
		
		
		
		for(int i=0;i<n;i++)
		{
			String str1=sheet.getRow(0).getCell(i).getStringCellValue();
			String str2=sheet.getRow(1).getCell(i).getStringCellValue();
			System.out.println(str1+" : "+str2);
		}
		
		
		
	}

}
