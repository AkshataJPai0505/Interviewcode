package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Program to create  a folder
 */

public class Testcase3 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\HP\\Desktop\\Test");
		f.mkdir();
		if(f.exists())
		{
			System.out.println("Created Successfully");
			File f1= new File("C:\\Users\\HP\\Desktop\\Test\\Demo.txt");
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw =new BufferedWriter(fw);
			String name="This is Demo";
			bw.write(name);
			String name1="Done for demo purpose";
			bw.newLine();
			bw.write(name1);
            bw.flush();
            bw.close();
            
			
		}
		else
		{
			System.out.println("Not Created");
			
			
		}
		
	}

}
