package Abstraction;
abstract class demo{
	abstract void disp();
}
class test extends demo{
	void disp() {
		System.out.println("Display method");
	}
}

public class sample {

	public static void main(String[] args) {
test t=new test();
t.disp();
	}

}
