package book.home_080;

public class Car {
	//Field
	private int speed = 0;
	private int direction = 0;
	
	//Constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
	public void speedUP() {
		speed +=5;
	}
	public void speedDown() {
		speed -=5;
	}
	public int curSpeed() {
		return speed;
	}
	public void turnDirect(int dir) {
		direction +=dir;
	}
	public int curDiect() {
		return direction;
	}
	
}

	
