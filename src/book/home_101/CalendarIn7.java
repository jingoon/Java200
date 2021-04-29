package book.home_101;

import java.util.Calendar;

public class CalendarIn7 {
	
	private int month[] = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};//���
	private int lmonth[] = new int[] {31,29,31,30,31,30,31,31,30,31,30,31};//����
	
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
        
        System.out.println("������ " + year +"�� " + month + "��" + date +"��");
        System.out.println("������ ������ " + woy +"°��, �̹����� " + wom + "°��. " + date +"��");
        System.out.println("������ �̹� ���� " + doy +"������, �̹� ���� " + dom + "��. ������ " + dow +"�� (1:�Ͽ���)");
        System.out.println("���� �ð��� " + hour12 +":"+ minute + ":"+ second +", 24�ð����� ǥ���ϸ� " + hour24+":"+ minute + ":"+ second);
        System.out.println("������ " + year +"�� " + month + "��" + date +"��");
        System.out.println("1000���� 1�� (0~999): " + milliSecond);
        System.out.println("timeZone (-12~+12): " + timeZone/(60*60*1000)); // 1000���� 1�ʸ� �ð����� ǥ���ϱ� ���� 60*60*1000
        System.out.println("�� ���� ������ ��: " + lastDate);
		
	}
	
	// ���� Ȯ��
	public boolean leapYearTF(int year) {
		boolean yearTF=false;
		/*
		 * ���� �߰� ��Ģ�� ������ ����. 4�� ������ �������� �ش� ����, �� ���� �ش� ������� �Ѵ�.
		 * �׷����¿��� ������ ���� �߰� ��Ģ�� �ִ�. 4�� ������ ���������� 100���ε� ������ �������� �ش� ������� �Ѵ�. 
		 * ��, 400���� ������ �������� �ش� �������� �Ѵ�.(��: 2000��, 2400��)
		 */
		if((year%4==0 && year%100!=0) || year%400==0) {
			yearTF = true; // ����
		}
		return yearTF;
	}
	
	// 1~ year���� ���� Ƚ�� ���ϱ�
	public int howManyLeapYear(int year) {
		int count =0;
		for(int i=1; i<=year;i++) {
			if(leapYearTF(i)) {
				count++;
			}
		}
		return count;
	}
	
	// �ش� �⵵�� 1��1���� ù���� �ش� ��¥���� �� ��¥
	//int doy = today.get(Calendar.DAY_OF_YEAR);
	public int howManyDaysInYearsMonth(int years, int month, int day) {
		int count =day;
		
		if(leapYearTF(years)) {// ����
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
	
	// ���� ��¥�� 0:��, 1:��, 2:ȭ, 3:��, 4:��, 5:��, 6:��
	public int startDayInCal(int year, int month) {
		int count=0;
		int leapYear = howManyLeapYear(year-1);
		int howManyDaysInYear = howManyDaysInYearsMonth(year, month, 1);// ù��
		count = ((leapYear)*2 +(year-1-leapYear)+howManyDaysInYear);
		return (count)%7;
	}
	
	// �������� 
	public boolean isLastDay(int year, int month, int day) {
		boolean isL = false;
		if(!leapYearTF(year)) {
			if(day==this.month[month-1]) {	// ��� 2�� ->28
				isL=true;
			}
		}else {
			if(day==this.lmonth[month-1]) {	// ���� 2�� ->29
				isL=true;
			}
		}
		return isL;
	}
	
	//�� �޿� �� ���� �ִ°�?
	public int getDates(int year, int month) {
		if(leapYearTF(year)) {
			return this.lmonth[month-1];	// ����
		}else {
			return this.month[month-1];		// ���
		}
		
	}
	
	// print
	public void printCalendar(int year, int month) {
		int linecheck = 0;	// ��¥�� ó�� ��� ��ġ�� �����ϴ� ����
		String temp = "";	// ó�� ���� ����
		System.out.println("");
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		linecheck = startDayInCal(year, month); // 1���� ���� �����ΰ�?
		for(int j=0; j<linecheck; j++) {
			temp +="\t";	// 1���� �������̸� �� 3��(��,��,ȭ)
		}
		System.out.print(temp);
		
		int count = getDates(year, month);	// �� �޿� �� ���� �ִ°�, 28,29,30,31?
		for(int i=1; i<=count;i++) {
			System.out.print(i);
			linecheck++;
			System.out.print(linecheck != 7? "\t":"");
			if(linecheck == 7) {		// �����
				if(this.isLastDay(year, month, i)) {
					return;	// ������ ���� ������ ���� �Ʒ��� ���� �ʿ� ����.
				}
				System.out.println();
				linecheck=0;
			}
		}
	
	}
	
	
}
