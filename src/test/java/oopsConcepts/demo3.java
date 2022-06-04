package oopsConcepts;
class test3 
{
	test3(int a)
	{
		System.out.println("The test3 constructor "+a);
	}
}
class sample3 extends test3{
	sample3(String s,char c)
	{
		super(5);
		
		System.out.println("The sample3 values are "+ s +" and "+ c);
	}
}

public class demo3 {

	public static void main(String[] args) {
		sample3 s=new sample3("Akshata",'J');
	}

}
