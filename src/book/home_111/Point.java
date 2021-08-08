package book.home_111;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point xp) {
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

	@Override
	public int hashCode() {
		int temp=0;
		temp =  ((int)this.x+(int)this.y)+37;
		return temp;
	}

	@Override
	public boolean equals(Object obj) {
		boolean isE = false;
		Point temp = (Point) obj;
		if(temp.getX() ==x && temp.getY()==y) {
			isE=true;
		}
		return isE;
	}
	
	
	
}
