package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = new GregorianCalendar(1994,8,11);
		Date d = new Date(c.getTimeInMillis());
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy년 MM월 d일");
		System.out.println(s.format(d));
	}
}
