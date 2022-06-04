package Interviewcode;

import java.util.Scanner;

public class countnoofdigits {

	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count=count+1;
			
		}
		System.out.println("The total no of digits is"+count);

	}

}
