package Interviewcode;

public class reverseastring {

	public static void main(String[] args) {
		String s="Akshata";
		int  l=s.length();
		System.out.println("The length is  "+l);
		String rev="";
		for(int i=l-1;i>=0;i--)
			
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("The  revverse is  "+rev);

	}

}
