package Filehandling;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Testcase8 {

	public static void main(String[] args) throws Exception {
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Text Files\\Textfileno1.txt";
		System.out.println(path);
		File f=new File(path);
		if(Desktop.isDesktopSupported())
		{
			System.out.println("Desktop is Supported");
		}
		else{
			System.out.println("Desktop is not Supported");
		}
		Desktop d= Desktop.getDesktop();
		d.open(f);
	}

}
