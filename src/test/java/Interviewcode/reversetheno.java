package Interviewcode;

import java.util.Scanner;

public class reversetheno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the no ");
		int n=s.nextInt();
		int rev=0;
		int rem;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("The reverse of n is "+rev);

	}

}
