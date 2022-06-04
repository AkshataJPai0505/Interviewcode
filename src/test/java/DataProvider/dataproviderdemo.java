package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {
	@DataProvider
	public Object[][] data() {
		
		Object[][] a=new Object[2][2];
		a[0][0]="Akshata";
		a[0][1]="Pai";
		a[1][0]="Vidya";
		a[1][1]="Pai";
		return a;
		
	}
	
	@Test(dataProvider="data")
	public void run(String a,String b)
	{
		System.out.println(a +" "+b);
	}

}
