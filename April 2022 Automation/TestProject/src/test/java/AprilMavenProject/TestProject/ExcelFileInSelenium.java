package AprilMavenProject.TestProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ExcelFileInSelenium e=new ExcelFileInSelenium();
		e.read_file();
	}
	
	public void read_file() throws IOException
	{
		File f=new File("C:\\Users\\ip-slim-3\\Desktop\\Employee Data.xlsx");
		FileInputStream fread=new FileInputStream(f);
		
		XSSFWorkbook w=new XSSFWorkbook(fread);
		XSSFSheet sheet=w.getSheet("TEST");
		
		
		System.out.println("Physical Rows :"+sheet.getPhysicalNumberOfRows());
		System.out.println("Last Row Number :"+sheet.getLastRowNum());
		
		System.out.println("Last Column No :"+sheet.getRow(3).getLastCellNum());
		
		String name_label = sheet.getRow(0).getCell(0).getStringCellValue();
		String name_value = sheet.getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(name_label+" : "+name_value);
		
		String loc_label= sheet.getRow(2).getCell(0).getStringCellValue();
		String loc_value= sheet.getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(loc_label+" : "+loc_value);
		
		String sal_label=sheet.getRow(3).getCell(0).getStringCellValue();
		 double sal_value = sheet.getRow(3).getCell(1).getNumericCellValue();
		
		System.out.println(sal_label+" : "+sal_value);
		
		boolean x=sheet.getRow(5).getCell(1).getBooleanCellValue();
		System.out.println("x:"+x);
		
		
	}
	
}





