package book.home_106;

import java.util.Calendar;
import java.util.Date;

public class calendarAndDate {
	public static void main(String[] args) {
		// Date
		System.out.println("Date");
		Date d1 = new Date();							// 오늘
		System.out.println(d1.toString());
		
		Date d2 = new Date(System.currentTimeMillis()); // 오늘
		System.out.println(d2.toString());
		
		System.out.println(d1.compareTo(d2)); 			// d1기준 d2와 비교 밀리세컨드 단위 시간 비교, (d1)앞서면 음수, (d1)뒤쳐지면 양수, 같으면 0
		System.out.println(d1.after(d2));				// d1 이 d2 after 인가? false/ true
		System.out.println(d1.before(d2)); 				// d1 이 d2 before 인가? false/ true
		
		long longDays=d1.getTime();						// 1970.1.1 ~
		Date d3 = (Date) d1.clone();
		//Date d3 = d1;
		d3.setTime(longDays + 1000*60*60*24*3); 		// 오늘(long) + 3일(1/1000초,분,시,일) 3일 후
		System.out.println(d3);							// d3.toString();
		System.out.println(d1);
		
		// Calender
		System.out.println("\nCalendar");
		Calendar cal = Calendar.getInstance();			// 오늘 
		// Calendar 객체는 new 키워드 사용 불가
		System.out.println(cal.toString());
		System.out.println(cal.getTime());				// Date
		System.out.println(cal.getTime().getTime());	// Long
		System.out.println(cal.get(Calendar.YEAR));		// 년
		System.out.println(cal.get(Calendar.MONTH)+1);	// 월
		System.out.println(cal.get(Calendar.DATE));		// 일
		System.out.println(cal.get(Calendar.HOUR));		// 시
		
		System.out.println(new Date(cal.getTime().getTime()));	//오늘
		System.out.println(new Date(cal.getTimeInMillis()));	//오늘
	}

}
