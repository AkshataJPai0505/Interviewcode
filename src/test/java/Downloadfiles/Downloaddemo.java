
package Downloadfiles;

import java.io.File;
import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloaddemo {
	public static Logger log =LogManager.getLogger("Downloaddemo");
	@Test
	public void download() throws Exception
	{
		SoftAssert s=new SoftAssert();
		String downloadfile=System.getProperty("user.dir")+"\\Download";
		System.out.println(downloadfile);
		WebDriverManager.chromedriver().setup();
		log.info("Browser is launched");
		ChromeOptions opt=new ChromeOptions();
		HashMap<String,Object> chromePrefs=new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory",downloadfile);
		opt.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.selenium.dev/downloads/");
		log.info("URL is Opened in the browser");
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		WebElement ele=driver.findElement(By.linkText("32 bit Windows IE"));
		ele.click();
		log.info("Clicked on download button");
		Thread.sleep(5000);
		File src=new File(System.getProperty("user.dir")+"\\Download\\IEDriverServer_Win32_4.0.0.zip");
		Boolean present =src.exists();
		s.assertTrue(present, "File has been downloaded Successfully");	
		log.info("File has been downloaded successfully");
		src.delete();
		
		present =src.exists();
		s.assertFalse(present,"File has been deleted Successfully");
		log.info("File has been deleted successfully");
		s.assertAll();
		driver.close();
		
		
	}

}
