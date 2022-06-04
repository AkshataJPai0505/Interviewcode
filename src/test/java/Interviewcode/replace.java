package Interviewcode;

public class replace {
	public static void main(String args[])
	{
		String a="JAVA";
		System.out.println("The String  before replacement is "+a);
		 a=a.replace("JAVA","SELENIUM");
		System.out.println("The String is "+a);
		
		String c="akshata";
		c=c.replaceAll("a","q");
		System.out.println("The String is "+c);
		
		String b="akshata";
		
		System.out.println(b.substring(1, 4));
		System.out.println(b.startsWith("ak"));
		
		String r="akshata";
		r=r.replaceFirst("a","q");
		System.out.println("The String is "+r);
	}

}
