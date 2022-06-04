package Interviewcode;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=s.nextInt();
		if((year%400==0) ||((year%4==0) && (year%100!=0)))
		{
			System.out.println("The year is leap year");	
		}
		else
		{
			System.out.println("The year is  not leap year");
		}
		

	}

}
