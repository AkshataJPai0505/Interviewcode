package Setdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class demo4 {

	public static void main(String[] args) {
		HashSet<String> hs= new HashSet<String>();
		hs.add("Akshata");
		hs.add("1995");
		hs.add("Vidya");
		System.out.println(hs);
		hs.add("Vidya");
		System.out.println(hs);
		
		hs.remove("Vidya");
		System.out.println(hs);
		hs.add("Vidya");
		hs.add("Pai");
		
		ArrayList<String> a=new ArrayList(hs);
		System.out.println(a.get(3));
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
