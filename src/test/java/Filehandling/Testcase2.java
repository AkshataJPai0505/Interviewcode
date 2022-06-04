package Filehandling;
/*
 * Program to create a new file and delete a new file
 */
import java.io.File;
import java.io.IOException;

public class Testcase2 {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\HP\\Desktop\\Demo.txt");
		f.createNewFile();
		if(f.exists())
		{
			System.out.println("Created Successfully");
			f.delete();
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Not Created");
		}
		
		

	}

}
