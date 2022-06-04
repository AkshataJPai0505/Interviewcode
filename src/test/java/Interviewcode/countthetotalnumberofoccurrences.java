package Interviewcode;

public class countthetotalnumberofoccurrences {

	public static void main(String[] args) {
		String s="Akshata";
		int count=s.length()-s.replace("a","").length();
		System.out.println(count);

	}

}
