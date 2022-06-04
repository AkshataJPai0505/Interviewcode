package Filehandling;

import java.io.File;

public class Testcase4 {

	public static void main(String[] args)
	{
		File f =new File("C:\\Users\\HP\\Desktop\\Credentials");
		String a[]=f.list();
		
		System.out.println("Total no of files Present are "+a.length);
		
		for( int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
				

	}

}
