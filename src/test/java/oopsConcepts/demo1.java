package oopsConcepts;
class test
{
	test()
	{
		System.out.println("The test Constructor");
	}
}
class sample extends test{
	sample()
	{
		System.out.println("The sample constructor");
	}
}

public class demo1 {

	public static void main(String[] args) {
		sample s=new sample();

	}

}
