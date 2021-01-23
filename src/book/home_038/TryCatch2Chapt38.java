package book.home_038;

public class TryCatch2Chapt38 {
	public static void main(String[] args) {
		String sNum="123";
		String nNum="h";
		
		try {
			int a=Integer.parseInt(nNum);
			System.out.println(a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("==>에러 !!!");
			System.out.println(e+"<==");
		}finally{
			System.out.println("finally는 반드시 수행");
		}
		
		
		try {
			//by zero.
			int x=5;
			int y=20/(5-x);
		} catch (ArithmeticException e) {
			System.out.println("==> 0으로 나누면 안됨!");
			e.printStackTrace();
		}
		
	}

}
