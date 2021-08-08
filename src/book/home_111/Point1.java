package book.home_111;

public class Point1 {
	private double x;
	private double y;
	
	public Point1(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point1(Point1 xp) {
		this.x = xp.getX();
		this.y = xp.getY();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + " , " + y + ")";
	}
	
	

}
