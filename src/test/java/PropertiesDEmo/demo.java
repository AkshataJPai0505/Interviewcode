package PropertiesDEmo;

import java.io.IOException;

import org.testng.annotations.Test;

public class demo {
	@Test
	
	public void testcase1() throws Exception{	
	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Configutaion\\config.properties";
	System.out.println(path);
	readProperty r= new readProperty(path);
		String browsername=r.getBrowser();
		System.out.println(browsername);
		String testername=r.getTester();
		System.out.println(testername);
		
	}

}
