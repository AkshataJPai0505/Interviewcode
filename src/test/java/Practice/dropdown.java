package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdown extends baseclass {

	@Test
	public void testcase1() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(9000);
	}
	@Test
	public void testcase2() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		s.selectByValue("audi");
		Thread.sleep(9000);
	}
	
	@Test
	public void testcase3() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		s.selectByVisibleText("Saab");
		Thread.sleep(9000);
	}
	
	@Test
	public void testcase4() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.name("cars"));
		Select s=new Select(ele);
		List<WebElement> options=s.getOptions();
		for(int i=0;i<options.size();i++)
		{
			String text=options.get(i).getText();
			System.out.println(text);
		}
		
	}
	
}
