package book.home_070;

public class SevenModules {

	// 2004�� 11�� 16���� ���� �����ΰ�?
	public static void main(String[] args) {
		
		int start = 0;
		int yearStart = 1;
		int sum = 0;
		int year =2004;
		int month = 11;
		int day = 16;
		
		//0001�� ~ 2003�� 12�� 31�ϰ��� ����
		for(int i = yearStart; i <year; i++) {
			for (int j = 1; j < 13; j++) {
				sum += dates(i,j);
			}
		}
		
		// 2004�� 1�� 1�� ~ 10�� 31�ϱ��� ����
		for (int j = 1; j < month; j++) {
			sum+= dates(year, j);
		}
		
		//11�� 16�� --> 16�� ��
		System.out.println(year+"/"+month+"/"+dayMode(relativeMode(sum+day+start)));
		printCal(2004, 12, 25);
	}
	
	public static void printCal(int year, int month, int day) {
		int start=3;
		int yearStart= 1970;
		int sum = 0;
		for(int i = yearStart; i <year; i++) {
			for (int j = 1; j < 13; j++) {
				sum += dates(i,j);
			}
		}
		for (int j = 0; j < month; j++) {
			sum += dates(year,j);
		}
	}
	
	
	
	public static int relativeMode(int day) {
		return (day%7);
	}
	
	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		if((year%4== 0 ) && (year%100 !=0) || (year%400 == 0)  ){
			isLeap = true;
		}
		return isLeap;
	}
	
	public static String  dayMode(int day) {
		String temp="";
		switch (day) {
		case 0:	temp = "sun"; break;
		case 1:	temp = "mon"; break;
		case 2:	temp = "tue"; break;
		case 3:	temp = "wed"; break;
		case 4:	temp = "thu"; break;
		case 5:	temp = "fri"; break;
		case 6:	temp = "sat"; break;
		default: temp = "why not error ?";	break;
		}
		return temp;
	}
	
	public static int dates(int year, int month) {
		int temp = 0;
		if(!isLeapYear(year)) {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: temp = 31; break;
			case 4:
			case 6:
			case 9:
			case 11: temp = 30; break;
			case 2: temp = 28; break;
			}
		}else {
			if(month == 1 ||month == 3 ||month == 5 ||month == 7
					||month == 8 ||month == 10 ||month == 12) {
				temp =31;
			}else if(month == 4 || month == 6 || month == 9 || month == 11 ) {
				temp = 30;
			}else {
				temp = 29;
			}
		}
		return temp;
	}
	
	
	
	
	
	
	
	
}
