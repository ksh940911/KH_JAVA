package kh.java.api.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * java.util.Calendar
 * java.util.Date 기본생성자, long타입생성자를 제외하고 사용금지 deprecated
 * java.time.LocalDateTime 
 *
 */
public class DateTimeTest {

	public static void main(String[] args) {
		DateTimeTest dt = new DateTimeTest();
//		dt.test1();
//		dt.test2();
		dt.test3();
	}
	
	/**
	 * Date()
	 * Date(long millis)
	 * 위 생성자만 사용가능하다.
	 */
	public void test3() {
		
		Date now = new Date();
		System.out.println(now);
		
		//to Calendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		
		System.out.println(cal);
		
		//to Date
		long millis = cal.getTimeInMillis();
		Date date = new Date(millis);
		
		System.out.println(date);
	}
	
	/**
	 * 특정일 특정시각을 Calendar객체로 생성
	 */
	public void test2() {
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2021, 0, 1, 0, 0, 0);
		printCalendar(cal1);
		
		Calendar cal2 = new GregorianCalendar(2021, 1, 1, 0, 0, 0);
		printCalendar(cal2);
		
		//날짜 차이 계산하기
		Calendar now = Calendar.getInstance();
		//밀리초 단위로 변환해서 차이를 구한후, 다시 초분시일 단위로 환산
		//unix second : 1970년 1월 1일 자정기준으로 흐른 밀리초
		long num1 = now.getTimeInMillis();
		long num2 = cal1.getTimeInMillis();
		// millis / 1000(초) / 60(분) / 60(시) / 24(일) 
		long diff = (num2 - num1) / 1000 / 60 / 60 / 24;
		
		System.out.println(diff);
		System.out.println("새해까지 D-" + (diff + 1) + "일 남았습니다.");
	}
	
	/**
	 * Calendar
	 */
	public void test1() {
		//현재 날짜. 시각 정보 조회
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
		
//		System.out.println(cal1);
		
		//조회
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH) + 1);
		System.out.println(cal1.get(Calendar.DATE));
		
		System.out.println(cal1.get(Calendar.HOUR)); //12
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY)); //24
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));
		
		//요일(일1, 월2, 화3, 수4, 목5, 금6, 토7)
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK)); // 3
		char[] dayOfWeek = {'일','월','화','수','목','금','토'};
		System.out.println(dayOfWeek[cal1.get(Calendar.DAY_OF_WEEK) - 1]);
		
		printCalendar(cal1);
	
	}
	
	/**
	 * 
	 * yyyy/MM/dd hh24:mm:ss
	 * 
	 * @param c
	 * 
	 */
	public void printCalendar(Calendar c) {
		
		System.out.printf("%d/%02d/%02d %02d:%02d:%02d%n",
				c.get(Calendar.YEAR),
				c.get(Calendar.MONTH) + 1,
				c.get(Calendar.DATE),
				c.get(Calendar.HOUR_OF_DAY),
				c.get(Calendar.MINUTE),
				c.get(Calendar.SECOND));
	}
}
