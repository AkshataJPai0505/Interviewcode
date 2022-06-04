package popup;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.setExperimentalOption("excludeSwitches",Arrays.asList("disbale-popup-blocking","enable-automation"));
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.close();
		

	}

}
