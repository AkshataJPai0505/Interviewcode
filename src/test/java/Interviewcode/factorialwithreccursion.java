package Interviewcode;

import java.util.Scanner;

public class factorialwithreccursion {
	  int fact=1;
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		factorialwithreccursion f=new factorialwithreccursion();
		int res=f.calculatefactorial(n);
		System.out.println("The factorial of "+n+" is  "+res);
	}
    int calculatefactorial(int n) 
      {
    	  if(n>0)
    	  {
    		  fact=fact*n;
    		  calculatefactorial(n-1);

    	  }
    	  return fact;
      }
}
