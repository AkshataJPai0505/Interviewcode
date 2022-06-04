package thisDemo;

public class demo1 {
	
	int a=100;
	int b=200;
	
	public demo1(int a,int b)
	{
	    this.a=a;
		this.b=b;
	}
	
	public void add()
	{
		int sum=a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		demo1 d=new demo1(10,20);
		d.add();
		

	}

}
