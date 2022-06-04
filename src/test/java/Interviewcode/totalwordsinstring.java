package Interviewcode;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class totalwordsinstring {

	public static void main(String[] args) {
		String s="My name is Akshata J Pai and mnaglore";
		System.out.println("The total no.of words : "+s.split("\\s+").length);
		
		String date=  new SimpleDateFormat("dd-MM-yyyy,hh-mm-ss").format(new Date());
		System.out.println(date);
	}

	
	

}
