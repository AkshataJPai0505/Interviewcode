package Setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demo2 {

	public static void main(String[] args) {
		LinkedHashSet<String> a=new LinkedHashSet<String>();
		a.add("Akshata");
		a.add("Pai");
		a.add("1995");
		a.add("jvp");
		System.out.println(a);
		int n=a.size();
		System.out.println(n);
		for(String ab:a)
		{
			System.out.println(ab);
		}

	}

}
