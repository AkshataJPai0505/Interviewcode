package Interviewcode;

import java.util.Scanner;

public class fibacciseries {

	public static void main(String[] args) {
		int c;
		int a=0;
		int b=1;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();

		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
