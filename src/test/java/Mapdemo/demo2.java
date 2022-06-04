package Mapdemo;

import java.util.HashMap;
import java.util.Map;

public class demo2 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Akshata");
		hm.put(2, "1995");
		hm.put(3, "Pai");
		hm.put(4,"Selenium");
		hm.put(4,"TestNG");
		System.out.println(hm);
		System.out.println(hm.keySet());
		for(HashMap.Entry<Integer,String> data:hm.entrySet())
		{
			System.out.println(data);
		}
		System.out.println(hm.get(4));
		hm.remove(4);

System.out.println(hm);
		

	}

}
