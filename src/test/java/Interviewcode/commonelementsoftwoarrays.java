package Interviewcode;

import java.util.HashSet;

public class commonelementsoftwoarrays {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {5,3,6,7,8,9};
		HashSet<Integer> h1=new HashSet<Integer>();
		HashSet<Integer> h2=new HashSet<Integer>();
		
		for(int l:a1)
		{
			h1.add(l);
		}
		for(int l:a2)
		{
			h2.add(l);
		}
		for(int l:h1)
		{
			boolean value=h2.add(l);
			if(value==false)
			{
				System.out.println(l);
			}
		}
	}

}
