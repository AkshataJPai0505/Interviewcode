package PropertiesDEmo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProperty {
	public Properties prop;
	
	public readProperty(String path) throws IOException
	{
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
	}
	public String getBrowser()
	{
		String a=prop.getProperty("Browser");
		return a;
	}
	
	public String getTester()
	{
		String a=prop.getProperty("Tester");
		return a;
	}
	
}
