package Filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testcase6 {

	public static void main(String[] args) throws Exception {
		File f=new File("C:\\Users\\HP\\Desktop\\Demo.txt");
		f.createNewFile();
		System.out.println("File created");
		if(f.exists())
		{
			System.out.println("File present");
			FileWriter fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Akshata J Pai");
			bw.newLine();
			bw.write("Mangaluru");
			System.out.println("Successfully wrote ");
			bw.flush();
			bw.close();
			
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String text =br.readLine();
			System.out.println(text);
			String text1 =br.readLine();
			System.out.println(text1);
			br.close();
			Thread.sleep(10000);
			f.delete();
			System.out.println("Successfully deleted");
		}
		else
		{
			System.out.println("File not present");
		}
		
	}

}
