package book.home_086;

public class LeapYearTotalDays {
	
	private int[] month= {31,28,31,30,31,30,31,31,30,31,30,31};		//평년일 때 각 월의 일수
	private int[] leapMonth= {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년일 때 각 월의 일수
	
	public int getTotalDays(int year) {
		int total=0;
		IfLeapYear2 leap = new IfLeapYear2();	// 다른클레스 호출, 객체생성
		leap.setLeapYear(year);		// 필드 세팅
		if(leap.isLeapYear()) {		// 윤년 검사
			for (int i : leapMonth) {	// 윤년이면 윤년일때 각 월의 일수를 모두 더한다
				total+=i;
			}
		}else {
			for(int i : month){			// 윤년이 아니면 평년일때 각 월의 일수를 모두 더한다
				total +=i;
			}
		}
		return total;
	}

}
