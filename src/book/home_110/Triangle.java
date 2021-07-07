package book.home_110;

public class Triangle {
	// 정삼각형
	public double area(double x) {
		return Math.sqrt(3)/4.0*x*x;
	}
	
	// 이등변 삼각형 1/2 * 밑변 * 높이
	public double area(double x, double y) {
		return 1.0/2.0*x*y;
	}
	
	// 두 변과 두 변 사이에 낀 각
	public double area(double x, double y, Radian radian) {
		double rad = radian.getRadian();
		return 1.0/2.0*x*y*Math.sin(rad);
	}
	
	// 한 변과 두 양각
	public double area(double x, Radian radian1, Radian radian2) {
		double rad1 = radian1.getRadian();
		double rad2 = radian2.getRadian();
		return 1.0/2.0*x*x*Math.sin(rad1)*Math.sin(rad2)/Math.sin(rad1+rad2);
	}
	
	// 헤론의 공식 -- 세 변의 길이를 줄 때
	public double area(double x, double y, double z) {
		double s = (x+y+z)/2.0;
		return Math.sqrt(s*(s-x)*(s-y)*(s-z));
	}
}
