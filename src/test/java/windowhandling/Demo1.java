package windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		
		WebElement ele=driver.findElement(By.id("windowhandling1"));
		String parentwindow=driver.getWindowHandle();
		Thread.sleep(15000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		ele.click();
		
		 Set<String> allwin=driver.getWindowHandles();
		 Iterator<String> itr=allwin.iterator();
		 
		 while( itr.hasNext())
		 {
			 String childwindow=itr.next();
			 if(!parentwindow.equals(childwindow)) {
				 driver.switchTo().window(childwindow);
				 Thread.sleep(5000);
				 System.out.println(driver.getCurrentUrl());
				 Thread.sleep(5000);
				 driver.close();
		 }
			 else
			 {
				 driver.switchTo().window(parentwindow);
			 }
		 }
		 
	driver.switchTo().window(parentwindow);
	Thread.sleep(5000);
	driver.close();

}
}
