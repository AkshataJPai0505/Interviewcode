package Mapdemo;

import java.util.HashMap;
import java.util.Map;

public class demo1 {

	public static void main(String[] args) {
		HashMap<String, String> a= new HashMap<String,String>();
		a.put("1", "Akshata");
		a.put("2", "Vidya");
		a.put("3", "Jayanth");
		System.out.println(a);
		a.put("4", "Pai");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.keySet());
		
		
	
		for(Map.Entry<String, String> data:a.entrySet())
		{
			System.out.println(data);
		}
	}

}
