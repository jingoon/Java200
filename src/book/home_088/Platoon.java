package book.home_088;

public class Platoon {
	
	private String name;
	
	// �⺻ ������
	public Platoon() {
		name="Platoon"; //�ʵ��ʱ�ȭ
	}
	
	// ����� ������
	public Platoon(String name) {
		this.name = name; //�ʵ� ���� ��ü����
	}

	// �ʵ��ȯ �޼���
	public String getPlatoonName() {
		return name;
	}
	
	
	public void showPlatoonName() {
		System.out.println("The "+ name +" platoon");
	}
	
	
	

}
