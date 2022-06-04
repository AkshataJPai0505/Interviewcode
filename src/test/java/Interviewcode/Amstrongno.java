
package Interviewcode;

import java.util.Scanner;

public class Amstrongno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of ");
		int t=s.nextInt();
		int no=t;
		int count=0;
		while(no!=0)
		{
			no=no/10;
			count=count+1;
		}
		System.out.println(count);
		
		int n=t;
		int arm=0; 
		int rem;
		while(n!=0)
		{ int mul=1;
			rem=n%10;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			System.out.println(arm);
			n=n/10;
		}
		if(arm==t)
		{
			System.out.println("The no is amstrong");
		}
		else
		{
			System.out.println("The no is not amstrong");
		}
		
	}		

}
