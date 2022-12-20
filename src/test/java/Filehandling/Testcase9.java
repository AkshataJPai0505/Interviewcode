package Filehandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Testcase9 {
	public static void main(String args[]) throws Exception 
	{
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Text Files\\Sample.txt";
		File f=new File(path);
		f.createNewFile();
		System.out.println("Is file Present "+f.exists());
		System.out.println("Is file is readable "+f.canRead());
		System.out.println("Is file is writable "+f.canWrite());
		System.out.println("Absolute path name "+f.getAbsolutePath());
		System.out.println("Name of file is "+f.getName());
		System.out.println("Size of file is "+f.length());
		Thread.sleep(15000);
		if(f.delete())
		{
			System.out.println("File is deleted");
		}
		else
		{
			System.out.println("File is not deleted");
		}
		
	}

}
