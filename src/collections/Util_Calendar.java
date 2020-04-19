package collections;
import java.util.*;
import java.text.*;
public class Util_Calendar {
	
	public static String convertWithTZ(long milliSec,TimeZone tz)
	{
		Calendar calendar = new GregorianCalendar();
			
		SimpleDateFormat dtFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		dtFormat.setTimeZone(tz);
		
		String result = dtFormat.format(calendar.getTime());
				
		return result;
	}
	
	public static void main(String[] args) {
		
		
		TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
		TimeZone EdZone  =TimeZone.getTimeZone("America/Edmonton");

		
		

		Calendar calendar = new GregorianCalendar();
		
		System.out.println("Los Angeles Time "+ Util_Calendar.convertWithTZ(calendar.getTimeInMillis(), timeZone1));
		System.out.println("UTC Time" + Util_Calendar.convertWithTZ(calendar.getTimeInMillis(), timeZone2));
		System.out.println("Edmonton Time" + Util_Calendar.convertWithTZ(calendar.getTimeInMillis(), EdZone));
		
		

		
		

	}

}
