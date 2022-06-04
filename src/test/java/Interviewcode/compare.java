package Interviewcode;

public class compare {
	public static void main(String args[])
	{
		String a="akshata";
		String b="AKSHATA";
		if(a.equals(b))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");	
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");	
		}
		if(a.contains("sh"))
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");	
		}
	}

}
