package ExcelsheetDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeExcel {
	
	@Test
	public void demo1() throws Exception
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Exceldata\\Testdata.xlsx";
		System.out.println(path);
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet;
		sheet=wb.getSheetAt(1);
		sheet.getRow(1).createCell(4).setCellValue("Jayanth");
		sheet.createRow(11).createCell(4).setCellValue("Jayanth");
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
		fos.close();
		
		
		
		
		
		
		
	}

}
