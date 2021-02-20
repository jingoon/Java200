package book.home_086;

public class IfLeapYear2Main {
	
	public static void main(String[] args) {
		IfLeapYear2 leap = new IfLeapYear2();
		leap.setLeapYear(2000);		// 메서드(기능-멤버필드 변경) 호출
		System.out.println(leap.isLeapYear());	// 윤년여부 검정결과 , true & false
		leap.prints(); 	 //2000에 대한 결과, 윤년 여부 결과		
		
		leap.setLeapYear(2030);	// 멤버필드를 변경
		leap.prints(); 			// 2040의 윤년 여부
	}

}
