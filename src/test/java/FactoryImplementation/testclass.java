package FactoryImplementation;

import org.testng.annotations.Test;

public class testclass {
	int a;
	
	public testclass(int a)
	{
		this.a=a;
	}
	
	@Test
	public void f1()
	{
		System.out.println("Inside f1() "+a);
	}
    @Test
	public void f2()
	{
		System.out.println("Inside f2() "+a);
	}

    @Test
  	public void f3()
  	{
  		System.out.println("Inside f3() "+a);
  	}

}
