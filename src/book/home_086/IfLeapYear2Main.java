package book.home_086;

public class IfLeapYear2Main {
	
	public static void main(String[] args) {
		IfLeapYear2 leap = new IfLeapYear2();
		leap.setLeapYear(2000);		// �޼���(���-����ʵ� ����) ȣ��
		System.out.println(leap.isLeapYear());	// ���⿩�� ������� , true & false
		leap.prints(); 	 //2000�� ���� ���, ���� ���� ���		
		
		leap.setLeapYear(2030);	// ����ʵ带 ����
		leap.prints(); 			// 2040�� ���� ����
	}

}
