package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends baseclass {
	@Test
	public void simple() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(9000);
		WebElement ele=driver.findElement(By.id("simpleAlert"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(9000);
		ele.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(9000);
		
	}
	
	@Test
	public void confirmation1() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(9000);
		WebElement ele=driver.findElement(By.id("confirmationAlert"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(9000);
		ele.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().dismiss();
		Thread.sleep(9000);
		
	}
	@Test
	public void confirmation2() throws Exception
	{
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(9000);
		WebElement ele=driver.findElement(By.id("confirmationAlert"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		Thread.sleep(9000);
		ele.click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(9000);
		
	}
	@Test
	public void prompt() throws Exception
	{
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(9000);
		WebElement ele=driver.findElement(By.xpath("//a[contains(text(),\"Alert with Textbox\")]"));
		Thread.sleep(9000);
		ele.click();
		driver.findElement(By.xpath("//button[contains(text(),\"click the button to demonstrate the prompt box \")]")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Akshata");
		driver.switchTo().alert().accept();
		Thread.sleep(9000);
		
	}

}
