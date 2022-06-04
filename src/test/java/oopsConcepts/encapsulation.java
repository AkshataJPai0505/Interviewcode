package oopsConcepts;

class demo{
	private int a;
	public void setdata(int a1)
	{
		a=a1;
	}
	public int getdata()
	{
		return a;
	}
}

public class encapsulation {

	public static void main(String[] args) {
		demo d=new demo();
		d.setdata(5);
		int data=d.getdata();
		System.out.println(data);

	}

}
