 package Interviewcode;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Enter the no ");
		n=s.nextInt();
		int temp=0;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("The no is prime");
		}
		else
		{
			System.out.println("The no is not prime");
		}

	}

}
