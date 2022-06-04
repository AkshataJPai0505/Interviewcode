package Interfacedemo;
interface demo{
	void test();
	void disp();
}
class sample implements demo
{
	public void test()
	{
		System.out.println("Test Method");
	}
	public void disp()
	{
		System.out.println("Disp Method");
	}
}

public class demo1 {

	public static void main(String[] args) {
		sample s=new sample();
		s.test();
		s.disp();

	}

}
