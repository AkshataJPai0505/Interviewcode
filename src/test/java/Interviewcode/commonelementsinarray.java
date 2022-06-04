package Interviewcode;

import java.util.HashSet;

public class commonelementsinarray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,20,60,30};
		HashSet<Integer> h=new HashSet<Integer>();
		for(Integer l:a){
			boolean value=h.add(l);
			if(value==false) {
			System.out.println(l);
			}
			
		}
		

	}

}
