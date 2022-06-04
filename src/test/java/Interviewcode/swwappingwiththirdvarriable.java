package Interviewcode;

import java.util.Scanner;

public class swwappingwiththirdvarriable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int a=s.nextInt();
		System.out.println("Enter the no");
		int b=s.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a "+a);
		System.out.println("The value of b "+b);
		

	}

}
