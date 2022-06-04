package Listdemo;

import java.util.ArrayList;

public class demo1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Akshata");
		a.add("Pai");
		a.add("9731859167");
		a.add("26");
		System.out.println(a);
		System.out.println(a.size());
		a.add("Mangaluru");
		System.out.println(a);
		System.out.println(a.size());
		a.remove(4);
		System.out.println(a);
		System.out.println(a.size());
		
	}

}
