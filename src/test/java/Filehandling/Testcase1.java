/*
 * Program to check canRead,canWrite,length,getAbsolutePath and getName();
 */
package Filehandling;

 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Testcase1 {

	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\HP\\Desktop\\Credentials.docx");
		
	    System.out.println( f.canRead());
	    System.out.println( f.canWrite());
	    System.out.println( f.length());
	    System.out.println( f.getAbsolutePath());
	    System.out.println( f.getName());
	}

}
