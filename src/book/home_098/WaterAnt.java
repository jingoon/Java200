package book.home_098;

public class WaterAnt extends Ant{

	private String where ="water";
	
	public void show() {
		System.out.println(where+"�ֺ�");
	}
	
	public void print() {
		System.out.println(getName()+"�� "+where+"�� ���." );
	}
}