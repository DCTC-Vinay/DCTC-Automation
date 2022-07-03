package DCTCFeb.TestMavenFeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadInSelenium {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadInSelenium j=new ExcelReadInSelenium();
		j.read_file();
	}

	public void read_file() throws IOException
	{
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\Test555.xlsx");
		FileInputStream fin=new FileInputStream(f);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int n=sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<n;i++)
		{
		
			String address=sheet.getRow(i).getCell(0).getStringCellValue();
			String address_value=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(address+":"+address_value);
		}	
		
		
	}

}
