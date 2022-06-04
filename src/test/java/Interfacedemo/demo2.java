package Interfacedemo;
class encap
{
	private int a;
	public void setter(int no)
	{
		a=no;
	}
	public int getter()
	{
		return a;
	}
}

public class demo2 {
	public static void main(String args[])
	{
		encap e= new encap();
		e.setter(8);
		System.out.println(e.getter());
	}

}
