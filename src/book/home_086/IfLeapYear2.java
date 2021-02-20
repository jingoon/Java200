package book.home_086;

public class IfLeapYear2 {

	private int leapYear= 2021;
	private static int leapYeap2 = 2020;

	public boolean isLeapYear() {
		boolean isLeap = false;
		if((0 == (leapYear%4) && 0 != (leapYear%100)) || 0== leapYear%400 ) {
		// 4의 배수이면서 100의 배수가 아닐 때, 아니면 400의 배수일 때	
			isLeap = true;
		}
		
		return isLeap;
	}

	public void setLeapYear(int leapYear) {
		this.leapYear = leapYear;
	}
	
	public void prints() {
		if(isLeapYear()) {
			System.out.println(leapYear+"년은 윤년 입니다.");
		}else {
			System.out.println(leapYear+"년은 윤년이 아닙니다");
		}
	}
	
	
	public static void staticPrint() {
		// System.out.println(leapYeap); //에러
		// static 메서드가 사용할수 있는 필드는 static 이여야 한다.
		System.out.println(leapYeap2);	//static이라 된다.
	}
	
	/*	같은 클래스 내부에서 메서드와 필드
	 * - 같은 클래스에서 메서드,필드의 호출은 클래스명을 사용하지 않아도 된다.(당연)
	 * static메서드 : static필드(o) , 멤버필드(x)
	 * 멤버 메서드 : static 필드(o), 멤버필드(o), static메서드(o)
	 */
	
	
}
