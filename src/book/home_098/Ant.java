package book.home_098;

public class Ant {
	
	private String name = "Ant";
	
	public String getName() {
		return name;
	}
	
	public String toString() {	// Ant�� �θ�(Object)�� �޼��� ������ : �������̵�
		return "�̸� :"+name;
	}
	
	public void print() {
		System.out.println(name+"�� ������ ���.");
	}

}
