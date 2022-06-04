package oopsConcepts;
class  test1
{
	test1()
	{
		System.out.println("The test1 constructor");
	}
}
class sample1 extends test1
{
	sample1()
	{
		super();
		System.out.println("The sapmple1 constructor");
		
	}
}

public class demo2 {

	public static void main(String[] args) {
		sample1 s=new sample1();

	}

}
