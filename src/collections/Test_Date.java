package collections;

import java.util.Date;


public class Test_Date {
	
	final void m1(){
		
		System.out.println("Hello");
	}
	
	final void  m1(String a){
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		Date date =new Date();
		
		System.out.println(date.toString());
		
		//Time from 1st January 1970 in milliseconds
		
		System.out.println(date.getTime());
		
		
		//Month start from 0 .so you need to add 1
		//System.out.println(date.getMonth()+1);
		
		//System.out.println(date.getDate());
		
	//	System.out.println(date.getDay());
		
		//System.out.println(date.getYear()+1900);
		
		/*
		TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
		
		Calendar calendar =new GregorianCalendar();
		
		calendar.setTimeZone(timeZone2);
		
		System.out.println("The current day on UTC "+calendar.get(Calendar.DATE));
		
		
		calendar.setTimeZone(timeZone1);
		
		System.out.println("The current day on PST "+calendar.get(Calendar.DATE));
		
		System.out.println("The current hour on PST Hour  "+calendar.get(Calendar.HOUR_OF_DAY) +" Minute"+calendar.get(Calendar.MINUTE));
		
	*/
		Test_Date td=new Test_Date();
		
		//Test_Date td1=new Test_Date();
		
		td.m1();
		
		td.m1("check");
		
	
		
			}

}
