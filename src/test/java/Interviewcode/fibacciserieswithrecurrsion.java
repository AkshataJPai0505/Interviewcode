package Interviewcode;

import java.util.Scanner;

public class fibacciserieswithrecurrsion {
	int c;
	int a=0;
	int b=1;

	public static void main(String[] args) {
		
		fibacciserieswithrecurrsion f=new fibacciserieswithrecurrsion();
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		f.fibacci(n);
}
	void fibacci(int n)
	{
		if(n>0)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			fibacci(n-1);
		}
	}

}
