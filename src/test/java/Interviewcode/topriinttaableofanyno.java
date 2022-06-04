package Interviewcode;

import java.util.Scanner;

public class topriinttaableofanyno {

	public static void main(String[] args) {
		int res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int n=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			res=n*i;
			System.out.println(n+"*"+i+"="+res);
		}

	}

}
