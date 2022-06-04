package Interviewcode;

public class equalsoperator {

	public static void main(String[] args) {
		String s1=new String("akshata");
		String s2=new String("akshata");
		boolean value=s1==s2;
		System.out.println(value);
		boolean value1=s1.equals(s2);
		System.out.println(value1);
		String s3="akshata";
		String s4="akshata";
		boolean value2=s3==s4;
		System.out.println(value2);
		boolean value3=s3.equals(s4);
		System.out.println(value3);


	}

}
