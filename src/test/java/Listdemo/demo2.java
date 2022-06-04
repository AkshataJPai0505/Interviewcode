package Listdemo;

import java.util.ArrayList;

public class demo2 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Akshata");
		a.add("Pai");
		a.add("9731859167");
		a.add("26");
		
		int n=a.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(a.get(i));
		}
	
	}

}
