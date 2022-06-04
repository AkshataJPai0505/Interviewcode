package Interviewcode;

import java.util.Scanner;

public class evvenorodd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("The no is even");
		}
		else
		{
			System.out.println("The no is odd");	
		}

	}

}
