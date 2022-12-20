package Setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class demo6 {

	public static void main(String[] args) {
	HashSet<String> s1=new HashSet<String>();
	s1.add("Akshata");
	s1.add("Selenium");
	System.out.println(s1);
	
	ArrayList<String> al =new ArrayList(s1);
	System.out.println(al.size());
	System.out.println(al);
	

	}

}
