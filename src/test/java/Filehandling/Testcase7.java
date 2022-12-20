package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testcase7 {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\HP\\Desktop\\Automation";
		String path2="C:\\Users\\HP\\Desktop\\Automation\\Test.txt";
		File f=new File(path);
		f.mkdir();
		System.out.println("created new folder");
		File f1=new File(path2);
		System.out.println("created new file");
		f1.createNewFile();
		boolean value=f1.canWrite();
		if(value==true)
			{
			FileWriter fw=new FileWriter(f1);
			BufferedWriter bw=new BufferedWriter(fw);
			String line1="My Name is Akshata Jayanth Pai";
			bw.write(line1);
			bw.newLine();
			String line2="Mangaluru";
			bw.write(line2);
			bw.flush();
			bw.close();
		System.out.println("File is Writable");
	     }
			else
			{
				System.out.println("File is not  Writable");
			}
			
			boolean value1=f1.canRead();
					if(value1==true)
			{
				FileReader fr=new FileReader(f1);
				BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
						System.out.println(line);
				String a=br.readLine();
				System.out.println(a);
				br.close();
				System.out.println("File is readable");
			}
					else
					{
						System.out.println("File is not  readable");
					}
					
					if(f1.exists())
					{
						System.out.println("File is Present");
						f1.delete();
						System.out.println("File is Deleted");
					}
					else
					{
						System.out.println("File is not  Present");
					}
					
					if(f.exists())
					{
						System.out.println("Folder is Present");
						f.delete();
						System.out.println("Folder is Deleted");
					}
					else
					{
						System.out.println("Folder is not  Present");
					}
						
			
	}

}
