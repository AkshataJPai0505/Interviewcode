package ExcelsheetDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel {
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	
	
	public readexcel(String Path) throws Exception
	{
		File src=new File(Path);
		FileInputStream fis= new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
	}
	
	public String getdata(int sheetno,int row,int col)
	{
		sheet=wb.getSheetAt(sheetno);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
	public void readall(String sheetname)
	{
		sheet=wb.getSheet(sheetname);
		int rowcount=sheet.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				String data=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
			
		}
		System.out.println(" ");
		
	}
	
	

}













