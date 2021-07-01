package book.home_107;

import java.util.Calendar;

public class HowManyDays {
	// 살아온 시간 계산
	private Calendar from = Calendar.getInstance();	// 오늘
	private Calendar to = Calendar.getInstance();	// 오늘
	public int aDay = 1000*60*60*24;
	public HowManyDays() {
		// TODO Auto-generated constructor stub
	}
	public HowManyDays(Calendar from, Calendar to) {
		setFrom(from);
		setTo(to);
	}
	public long howManyDays() {
		long longTime = (long) (to.getTime().getTime() - from.getTime().getTime());
		long time = longTime/aDay;
		return time;
	}
	public void setFrom(Calendar from) {
		this.from = from;
	}
	public void setTo(Calendar to) {
		this.to = to;
	}

	public static Calendar makeDay(int year, int month, int day) {
		Calendar making = Calendar.getInstance();
		making.set(year, month-1, day);
		return making;
	}
	
	

}
