package book.home_090;

public class OtherMath {

	private double a;
	private double b;
	
	public OtherMath(double a, double b) {
		this.a=a;
		this.b=b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}
	
	public double multi() {
		BasicMath basic = new BasicMath();
		return basic.multi(a, b);
	}
	
	public double sum() {
		return BasicMath.sum(a, b);
	}
	
	public static double sub(double a, double b) {
		return BasicMath.sub(a, b);
	}
	
	
}
