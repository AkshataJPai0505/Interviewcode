package Interviewcode;

public class palindromestring {

	public static void main(String[] args) {
		String s="mam";
		String s1=s;
		int  l=s.length();
		String rev="";
		for(int i=l-1;i>=0;i--)
			
		{
			rev=rev+s.charAt(i);
		}
		
		  if(s1.contains(rev)) { System.out.println("The string is palindrome"); } else
		  { System.out.println("The string is  not palindrome"); }
		 
		

	}

}
