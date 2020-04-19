package collections;
import java.util.*;

import java.text.*;
public class PracticeDate {
	
	public  static int dateConversion(TimeZone timeZ){
		
		Calendar calendar =new GregorianCalendar();
		
		calendar.setTimeZone(timeZ);
				
		int result =calendar.get(Calendar.DATE);
	
		return result;
	}
	
	public static String timeConversion(long timeMillis,TimeZone timezz){
		
		Calendar calendar =new GregorianCalendar();
		
				
		SimpleDateFormat dtFormat =new SimpleDateFormat("YYYY-MM-DD  HH:mm:ss");
		
		dtFormat.setTimeZone(timezz);
		
		//dtFormat.format(calendar.getTime());
		String newResult=dtFormat.format(calendar.getTime());
		
		
		return newResult;
	}
	
	 

	public static void main(String[] args) {
		
		
		TimeZone UTCtz=TimeZone.getTimeZone("UTC");
		
		TimeZone pacifictz=TimeZone.getTimeZone("America/Los_Angeles");
		
		
		//Calendar interface
		
		Calendar calendar =new GregorianCalendar();
		
		
		
		System.out.println("The current date on UTC time zone is "+ PracticeDate.dateConversion(UTCtz));
		
		System.out.println("The current date on UTC time zone is "+ PracticeDate.dateConversion(pacifictz));
		
		
		
		System.out.println("The current date on UTC time zone is "+ PracticeDate.timeConversion(calendar.getTimeInMillis(),UTCtz));
		
		System.out.println("The current date on Pacific time zone is "+ PracticeDate.timeConversion(calendar.getTimeInMillis(),pacifictz));	
			
		}
	

}
