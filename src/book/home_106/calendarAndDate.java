package book.home_106;

import java.util.Calendar;
import java.util.Date;

public class calendarAndDate {
	public static void main(String[] args) {
		// Date
		System.out.println("Date");
		Date d1 = new Date();							// ����
		System.out.println(d1.toString());
		
		Date d2 = new Date(System.currentTimeMillis()); // ����
		System.out.println(d2.toString());
		
		System.out.println(d1.compareTo(d2)); 			// d1���� d2�� �� �и������� ���� �ð� ��, (d1)�ռ��� ����, (d1)�������� ���, ������ 0
		System.out.println(d1.after(d2));				// d1 �� d2 after �ΰ�? false/ true
		System.out.println(d1.before(d2)); 				// d1 �� d2 before �ΰ�? false/ true
		
		long longDays=d1.getTime();						// 1970.1.1 ~
		Date d3 = (Date) d1.clone();
		//Date d3 = d1;
		d3.setTime(longDays + 1000*60*60*24*3); 		// ����(long) + 3��(1/1000��,��,��,��) 3�� ��
		System.out.println(d3);							// d3.toString();
		System.out.println(d1);
		
		// Calender
		System.out.println("\nCalendar");
		Calendar cal = Calendar.getInstance();			// ���� 
		// Calendar ��ü�� new Ű���� ��� �Ұ�
		System.out.println(cal.toString());
		System.out.println(cal.getTime());				// Date
		System.out.println(cal.getTime().getTime());	// Long
		System.out.println(cal.get(Calendar.YEAR));		// ��
		System.out.println(cal.get(Calendar.MONTH)+1);	// ��
		System.out.println(cal.get(Calendar.DATE));		// ��
		System.out.println(cal.get(Calendar.HOUR));		// ��
		
		System.out.println(new Date(cal.getTime().getTime()));	//����
		System.out.println(new Date(cal.getTimeInMillis()));	//����
	}

}
