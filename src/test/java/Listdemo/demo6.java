package Listdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class demo6 {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Akshata");
		ar.add("9731859167");
		ar.add("Engineer");
		System.out.println(ar);
		ar.add("26");
		System.out.println(ar);
		System.out.println(ar.get(2));
		ar.add("eeee");
		ar.add("selemium");
		ar.add("Java");
		System.out.println(ar);
		ar.add("Java");
		System.out.println(ar);
		ar.remove(4);
		System.out.println(ar);
		System.out.println();
		System.out.println("Retreiving using for loop");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println();
		System.out.println("Retreiving using for Iterator");
		Iterator <String> itr=ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Retreiving using for each");
		for(String a:ar)
		{
			System.out.println(a);
		}

	}

}
