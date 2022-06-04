package Setdemo;

import java.util.HashSet;

public class demo1 {

	public static void main(String[] args) {
		HashSet<String> a=new HashSet<String>();
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
