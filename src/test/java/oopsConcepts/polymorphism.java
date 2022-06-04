package oopsConcepts;
class car{
	void disp()
	{
		System.out.println("cars are manufactured in various countries");
	}
}
class hyundai extends car{
	void disp() {
		System.out.println("Hyundai cars are manufactured in South Korea");
	}
}
class suzuki extends car{
	void disp() {
		System.out.println("Suzuki cars are manufacutred in Japan");
	}
}
class mahindra extends car{
	void disp()
	{
		super.disp();
		System.out.println("Mahindra cars are manufactured in India");
	}
}

public class polymorphism {

	public static void main(String[] args) {
		car c=new suzuki();
		c.disp();
		car c1=new mahindra();
		c1.disp();
	}

}
