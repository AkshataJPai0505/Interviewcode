package oopsConcepts;

public class thiscalling {
	
	thiscalling()
	{
		System.out.println("thiscalling constructor without parameter");
	}
	thiscalling(int a)
	{
		this();
		System.out.println("thiscalling constructor with value "+a);
	}
	thiscalling(String s,char c)
	{
		this(7);
		System.out.println("thiscalling constructor with values "+s+" and "+c);
	}

	public static void main(String[] args) {
		thiscalling t=new thiscalling("Akshata",'J');

	}

}
