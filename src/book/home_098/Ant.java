package book.home_098;

public class Ant {
	
	private String name = "Ant";
	
	public String getName() {
		return name;
	}
	
	public String toString() {	// Ant의 부모(Object)의 메서드 재정의 : 오버라이딩
		return "이름 :"+name;
	}
	
	public void print() {
		System.out.println(name+"은 동굴에 산다.");
	}

}
