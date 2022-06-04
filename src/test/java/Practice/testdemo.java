package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testdemo extends baseclass {
	
	@Test(priority=2)
	public void testcase1()
	
	{
		SoftAssert s=new SoftAssert();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		String expected="Automation1";
		String actual=driver.getTitle();
		s.assertEquals(actual, expected);
		s.assertAll();
		
	}
	
	@Test(priority=1,dependsOnMethods="testcase1",alwaysRun=true)
	public void testcase2()
	{
		SoftAssert s=new SoftAssert();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		String expected="https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html";
		String actual=driver.getCurrentUrl();
		s.assertEquals(actual, expected);
		s.assertAll();
		
	}
}

