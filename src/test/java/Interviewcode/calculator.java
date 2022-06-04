
package Interviewcode;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		int res;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s.nextInt();
		System.out.println("Enter the value of b");
		int b=s.nextInt();
		System.out.println("Enter the value of operand");
		char c=s.next().charAt(0);
		
		switch(c)
		{
		case '+' :res=a+b;
		          System.out.println(res);
		          break;
		case '-' :res=a-b;
                  System.out.println(res);
                  break;
		case '*' :res=a*b;
                  System.out.println(res);
                  break;          
		case '/' :res=a/b;
                  System.out.println(res);
                  break; 
        default  :System.out.println("Invalid"); 
                  break;
		}
		

	}

}
