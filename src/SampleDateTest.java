import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SampleDateTest {

	public static void main(String[] args) {
		
		
		Date d =new Date();
		
		Calendar calendar =new GregorianCalendar();
		SimpleDateFormat sdf =new SimpleDateFormat();
		
		String dateTime =sdf.format(d);
		
		//calendar.getTime();
		
		System.out.println(dateTime);
		
		System.out.println(calendar.getTime());

	}

}
