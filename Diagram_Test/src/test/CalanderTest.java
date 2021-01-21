package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalanderTest {

	public static void main(String[] args) {
		Calendar c1 = new GregorianCalendar(1994,8,11);
		Calendar c2 = new GregorianCalendar();
		System.out.println((c2.getTimeInMillis()-c1.getTimeInMillis())/1000/60/60/24/365);
																	//  초   /분 /시 / 일/ 년
		Date d = new Date(c1.getTimeInMillis());
		
		SimpleDateFormat s = new SimpleDateFormat("yyyy/M/dd");
		System.out.println(s.format(d));
	}
}
