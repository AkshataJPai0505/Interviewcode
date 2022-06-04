package Listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo5 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Akshata");
		a.add("Pai");
		a.add("9731859167");
		a.add("26");
		
		Iterator<String> itr=a.iterator();
		
		while(itr.hasNext())
		{
			String data=itr.next();
			System.out.println(data);
		}
	
	}

}
