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
			System.out.println("==>���� !!!");
			System.out.println(e+"<==");
		}finally{
			System.out.println("finally�� �ݵ�� ����");
		}
		
		
		try {
			//by zero.
			int x=5;
			int y=20/(5-x);
		} catch (ArithmeticException e) {
			System.out.println("==> 0���� ������ �ȵ�!");
			e.printStackTrace();
		}
		
	}

}
