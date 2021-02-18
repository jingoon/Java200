package book.home_085;

public class Tank {
	
	/* 
	 *  메서드는 접근제한자와 반환형을 가지고 변수를 사용하는 기능 or 함수
	 *  멤버 필드는 접근제한자를 가지고 클래스영역(필드영역)에 선언된 변수
	 *	블록 변수는 메서드 안에서 선언된 변수
	 *   
	 *  메서드는 사용하려는 멤버필드가 static일 때 static으로 작성 할 수 있다
	 *  멤버필드가 static일 때 메서드는 static으로도 작성 할 수 있다.
	 *  멤버필드, 메서드 블록변수는 객체를 생성해야 사용 가능
	 *  static 메서드와 멤버필드는 객체를 생성하지 않아도 클래스이름으로 접근 후 사용가능
	 *	
	 *	메모리의 역할
	 *	static영역에는 클래스(설계도)가 올라가고, static필드도 준비된다
	 *	stack영역에는 레퍼런스(객체를 참조)와 블록변수(메서드호출~종료)가 올라간다
	 *	heap영역에는 클래스를 바탕으로 객체를 생성(new Tank())해야 객체가 올라간다.
	 *  객체가 생성된 후에 (static이 아닌) 멤버필드와 메서드를 사용할 수 있다.
	 *  
	*/
	
	public static int howmany =0;		//static 멤버필드(멤버변수)
	public int howfast =100;			// 멤버필드(멤버변수)
		
	public void input() {				// 메서드
		howmany ++;
	}
	
	public void increase() {
		howfast +=30;
	}
	
	public static int getHowMany() {	//static 메서드
		return howmany;
	}
	
	public int getHowFast() {
		return howfast;
	}
	
	public void showShortLife() {
		int age = 5;					//블록변수
		howfast -= age;
	}
	
}
