package Setdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class demo5 {

	public static void main(String[] args) {
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		ls.add("Akshata");
		ls.add("Pai");
		ls.add("Selenium");
		ls.add("Java");
		System.out.println(ls);
		ls.add("Java");
		System.out.println(ls);
		ls.add("Testng");
		System.out.println(ls);
		ArrayList<String> al=new ArrayList(ls);
		System.out.println(al.get(4));
		Iterator<String> itr=ls.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}

	}

}
