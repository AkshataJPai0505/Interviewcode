package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class Testcase10 {

	public static void main(String[] args) throws Exception {
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\Text Files\\Textfileno1.txt";
		File f=new File(path);
		
		FileReader fr= new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		LineNumberReader lr=new LineNumberReader(br);
		
		int lineno=0;
		
		while(lr.readLine()!=null)
		{
			lineno=lineno+1;
		}
		System.out.println("Total no of Lines in the file "+lineno);

	}

}
