package api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CakebdarTest2 {

	public static void main(String[] args) {
		Calendar birthday = new GregorianCalendar(1994,8,11);
//		System.out.println(birthday.getTimeInMillis());
		Calendar today = Calendar.getInstance();
//		System.out.println(today.getTimeInMillis());
		
//		double kkkk = (((double)today.getTimeInMillis()-birthday.getTimeInMillis())/1000/60/60/24/365);
//		System.out.println(kkkk);
		System.out.println(((double)today.getTimeInMillis()-birthday.getTimeInMillis())/1000/60/60/24/365);
		
	}
}
