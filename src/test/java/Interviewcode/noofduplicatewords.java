 package Interviewcode;

import java.util.HashMap;
import java.util.Iterator;

public class noofduplicatewords {
	public static void main(String args[]) {
	String s="My name is akshata and akshata means rice";
	System.out.println(s.split("\\s+").length);
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	String words[]=s.split(" ");
	for(String w: words)
	{
		if(hm.get(w)==null)
		{
			hm.put(w,1);
		}
		else
		{
			hm.put(w,hm.get(w)+1);
		}
		
	}
	System.out.println(hm);
	Iterator<String> itr=hm.keySet().iterator();
	while(itr.hasNext())
	{
		String temp=itr.next();
		if(hm.get(temp)>1)
		{
			System.out.println(temp + 
					hm.get(temp));
		}
	}
	
}
}
