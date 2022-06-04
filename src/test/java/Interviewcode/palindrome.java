package Interviewcode;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the no ");
		int n=s.nextInt();
		int temp=n;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("The no is palindrome");

	}
		else
		{
			System.out.println("The no is not palindrome");
		}

	}

}
