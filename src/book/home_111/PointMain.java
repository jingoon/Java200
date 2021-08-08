package book.home_111;

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		Point p3 = new Point(4, 3);

		System.out.println("p1==p2 ?"+(p1==p2));
		System.out.println("p1.equals(p2) ?"+(p1.equals(p2)));
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		Point p4 = new Point(p1);
		System.out.println(p4.hashCode());
		System.out.println("p1.equals(p4) ?"+(p1.equals(p4)));
		
		// new 생성 객체는 == 로 비교 불가
		// equals와 hashCode를 오버라이딩 하면  equals로 비교가능
		// p1과 p2는 (equals)같고,  p1과 p4는 (equals)같다 
	}
}
