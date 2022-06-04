package DataProvider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	
	@Test
	public void dropdown()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
	WebElement ele =driver.findElement(By.name("cars"));
	
	Select s=new Select(ele);
	List<WebElement> opt=s.getOptions();
	for(int i=0;i<opt.size();i++)
	{
		String text=opt.get(i).getText();
		System.out.println(text);
	}
	
	driver.close();
	}

}
