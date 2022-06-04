package ExcelsheetDemo;

import org.testng.annotations.Test;

public class sheetDemo {
	@Test
	public void demo1() throws Exception
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Exceldata\\Testdata.xlsx";
		readexcel r=new readexcel(path);
		
		String a =r.getdata(0, 1, 1);
		System.out.println(a);
		r.readall("Sheet1");
		 
	}
	
	

}
