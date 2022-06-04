package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrOME"))
		{
		WebDriverManager.chromedriver().setup();
		/*
		 * ChromeOptions opt=new ChromeOptions();
		 * opt.setExperimentalOption("excludeSwitches", "enable-automation"); driver=
		 * new ChromeDriver(opt);
		 */
		
		driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FiReFox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver= new ChromeDriver();
		}
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();		
	}
	

}
