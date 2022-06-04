package Wrapperdemo;

public class demo6 {

	public static void main(String[] args) {
		//Autoboxing
		int a=20;
		Integer b=a;
		System.out.println("Autoboxing "+b);
		
		//Boxing
		int a1=100;
		Integer b1=Integer.valueOf(a1);
		System.out.println("Boxing "+b1);
		
		//Autounboxing
		Integer c1=500;
		int c2=c1;
		System.out.println("Autounboxing "+c2);
		
		//Unboxing
		Integer m=300;
		int m1=Integer.valueOf(m);
		System.out.println("unboxing "+m1);
		

	}

}
