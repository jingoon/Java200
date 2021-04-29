package book.home_101;

public class CalendarMain {
	
	public static void main(String[] args) {
		CalendarIn7 cal7 = new CalendarIn7();
		int year = 2021;
		for (int i=1;i<13;i++) {
			System.out.printf("\t\t %d³â \t %d¿ù \n\n ", year, i);
			cal7.printCalendar(year, i);
			System.out.println();
			System.out.println();
			
		}
	}

}
