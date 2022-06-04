package Interviewcode;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateformat {
	public static void main(String args[])
	{
		SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yyyy,hh-mm-ss");
		Date d=new Date();
		System.out.println(sf.format(d));
	}

}
