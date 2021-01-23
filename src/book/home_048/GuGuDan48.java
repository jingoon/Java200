package book.home_048;

public class GuGuDan48 {
	
	public static void main(String[] args) {
		//GuGuDan48.printGuGu();와 동일 static메서드
		printGuGu();
		System.out.println("---------------------");
		//GuGu클래스의 객체 생성후 호출
		GuGu gu = new GuGu();
		gu.printGu();
		System.out.println("---------------------");
		//GuGu클래스의 static메서드 호출
		GuGu.printGuGu();
		
	}
	
	public static void printGuGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}

class GuGu{
	public void printGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	public static void printGuGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
}