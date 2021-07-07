package book.home_110;

public class Radian {
	// »ï°¢Çü ³ĞÀÌ ±¸ÇÏ±â
	private double radian;
	public Radian(double theta) {
		radian=Math.PI/180.0*theta;
	}
	public double getRadian() {
		return radian;
	}
	public void setRadian(double theta) {
		this.radian=Math.PI/180.0*theta;;
	}
	public static double radianToTheta(double radian) {
		return 180.0/Math.PI*radian;
	}
	public static double thetaToRadian(double theta) {
		return Math.PI/180.0*theta;
	}

}
