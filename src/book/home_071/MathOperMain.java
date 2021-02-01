package book.home_071;

public class MathOperMain {
	public static void main(String[] args) {
		MathOper mo = new MathOper();
		System.out.println(mo.banOlimAtNums(mo.abs(123.567), 3));
		System.out.println("-----------------------");
		System.out.println(mo.burimAtNums(mo.abs(123.567), 3));
		System.out.println("-----------------------");
		System.out.println(mo.OlimAtNums(mo.abs(123.567), 3));
		System.out.println("-----------------------");
		System.out.println(Math.sinh(1));
		System.out.println(Math.cosh(1));
		System.out.println(Math.tanh(1));
	
		
	}
}
