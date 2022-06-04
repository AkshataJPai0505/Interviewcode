package Setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class demo3 {

	public static void main(String[] args) {
		LinkedHashSet<String> a=new LinkedHashSet<String>();
		a.add("Akshata");
		a.add("Pai");
		a.add("1995");
		a.add("jvp");
		System.out.println(a);
		int n=a.size();
		System.out.println(n);
		ArrayList<String> l=new ArrayList<String>(a);
		System.out.println(l.get(3));
		

	}

}
