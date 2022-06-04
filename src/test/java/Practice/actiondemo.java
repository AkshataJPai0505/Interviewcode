package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actiondemo extends baseclass {
	@Test
	public void testcase1() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.xpath("//input[@name='firstname']"));
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Actions a=new Actions(driver);
		Thread.sleep(7000);
		a.moveToElement(ele).click().sendKeys("Akshata J").perform();
		Thread.sleep(7000);
		
		
		
	}
	@Test
	public void testcase2() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		WebElement ele=driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(7000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Actions a=new Actions(driver);
		Thread.sleep(7000);
		Action act=a.moveToElement(ele).click().sendKeys("Pai").build();
		act.perform();
		Thread.sleep(7000);
		
		
	}

}
