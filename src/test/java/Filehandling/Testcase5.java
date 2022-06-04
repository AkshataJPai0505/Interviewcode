package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;

public class Testcase5 {

	public static void main(String[] args) throws Exception {
	File f =new File("C:\\Users\\HP\\Desktop\\Demo.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String Data=br.readLine();
			System.out.println(Data);
			String Data2 =br.readLine();
			System.out.println(Data2);
			String Data1=br.readLine();
			System.out.println(Data1);
		   br.close();
			
			

	}

}
