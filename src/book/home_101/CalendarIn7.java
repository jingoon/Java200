package book.home_101;

import java.util.Calendar;

public class CalendarIn7 {
	
	private int month[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//평년
	private int lmonth[] = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//윤년
	
	public void toDayCalendar() {
				
		Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH)+1;
        int date = today.get(Calendar.DATE);
        
        int woy = today.get(Calendar.WEEK_OF_YEAR);
        int wom = today.get(Calendar.WEEK_OF_MONTH);
        
        int doy = today.get(Calendar.DAY_OF_YEAR);
        int dom = today.get(Calendar.DAY_OF_MONTH);
        int dow = today.get(Calendar.DAY_OF_WEEK);
        
        int hour12 = today.get(Calendar.HOUR);
        int hour24 = today.get(Calendar.HOUR_OF_DAY);
        int minute = today.get(Calendar.MINUTE);
        int second = today.get(Calendar.SECOND);
        
        int milliSecond = today.get(Calendar.MILLISECOND);
        int timeZone = today.get(Calendar.ZONE_OFFSET);
        int lastDate = today.getActualMaximum(Calendar.DATE);
        
        System.out.println("오늘은 " + year +"년 " + month + "월" + date +"일");
        System.out.println("오늘은 올해의 " + woy +"째주, 이번달의 " + wom + "째주. " + date +"일");
        System.out.println("오늘은 이번 해의 " + doy +"일이자, 이번 달의 " + dom + "일. 요일은 " + dow +"일 (1:일요일)");
        System.out.println("현재 시각은 " + hour12 +":"+ minute + ":"+ second +", 24시간으로 표현하면 " + hour24+":"+ minute + ":"+ second);
        System.out.println("오늘은 " + year +"년 " + month + "월" + date +"일");
        System.out.println("1000분의 1초 (0~999): " + milliSecond);
        System.out.println("timeZone (-12~+12): " + timeZone/(60*60*1000)); // 1000분의 1초를 시간으로 표시하기 위해 60*60*1000
        System.out.println("이 달의 마지막 날: " + lastDate);
		
	}
	
	// 윤년 확인
	public boolean leapYearTF(int year) {
		boolean yearTF=false;
		/*
		 * 윤년 추가 규칙은 다음과 같다. 4로 나누어 떨어지는 해는 윤년, 그 밖의 해는 평년으로 한다.
		 * 그레고리력에는 다음과 같은 추가 규칙이 있다. 4로 나누어 떨어지지만 100으로도 나누어 떨어지는 해는 평년으로 한다. 
		 * 단, 400으로 나누어 떨어지는 해는 윤년으로 한다.(예: 2000년, 2400년)
		 */
		if((year%4==0 && year%100!=0) || year%400==0) {
			yearTF = true; // 윤년
		}
		return yearTF;
	}
	
	// 1~ year까지 윤년 횟수 구하기
	public int howManyLeapYear(int year) {
		int count =0;
		for(int i=1; i<=year;i++) {
			if(leapYearTF(i)) {
				count++;
			}
		}
		return count;
	}
	
	// 해당 년도의 1월1일을 첫날로 해당 날짜까지 총 날짜
	//int doy = today.get(Calendar.DAY_OF_YEAR);
	public int howManyDaysInYearsMonth(int years, int month, int day) {
		int count =day;
		
		if(leapYearTF(years)) {// 윤년
			for(int i =0; i<month-1;i++) {
				count+=this.lmonth[i];
			}
		}else {
			for(int i =0; i<month-1;i++) {
				count+=this.month[i];
			}
		}
		
		return count;
	}
	
	// 시작 날짜가 0:일, 1:월, 2:화, 3:수, 4:목, 5:금, 6:토
	public int startDayInCal(int year, int month) {
		int count=0;
		int leapYear = howManyLeapYear(year-1);
		int howManyDaysInYear = howManyDaysInYearsMonth(year, month, 1);// 첫날
		count = ((leapYear)*2 +(year-1-leapYear)+howManyDaysInYear);
		return (count)%7;
	}
	
	// 마지막날 
	public boolean isLastDay(int year, int month, int day) {
		boolean isL = false;
		if(!leapYearTF(year)) {
			if(day==this.month[month-1]) {	// 평년 2월 ->28
				isL=true;
			}
		}else {
			if(day==this.lmonth[month-1]) {	// 윤년 2월 ->29
				isL=true;
			}
		}
		return isL;
	}
	
	//그 달에 몇 일이 있는가?
	public int getDates(int year, int month) {
		if(leapYearTF(year)) {
			return this.lmonth[month-1];	// 윤년
		}else {
			return this.month[month-1];		// 평년
		}
		
	}
	
	// print
	public void printCalendar(int year, int month) {
		int linecheck = 0;	// 날짜를 처음 찍는 위치를 지정하는 변수
		String temp = "";	// 처음 문자 간격
		System.out.println("");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		linecheck = startDayInCal(year, month); // 1일이 무슨 요일인가?
		for(int j=0; j<linecheck; j++) {
			temp +="\t";	// 1일이 수요일이면 탭 3개(일,월,화)
		}
		System.out.print(temp);
		
		int count = getDates(year, month);	// 그 달에 몇 일이 있는가, 28,29,30,31?
		for(int i=1; i<=count;i++) {
			System.out.print(i);
			linecheck++;
			System.out.print(linecheck != 7? "\t":"");
			if(linecheck == 7) {		// 토요일
				if(this.isLastDay(year, month, i)) {
					return;	// 마지막 날이 끝나면 한줄 아래로 내릴 필요 없다.
				}
				System.out.println();
				linecheck=0;
			}
		}
	
	}
	
	
}
