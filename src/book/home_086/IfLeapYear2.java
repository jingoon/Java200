package book.home_086;

public class IfLeapYear2 {

	private int leapYear= 2021;
	private static int leapYeap2 = 2020;

	public boolean isLeapYear() {
		boolean isLeap = false;
		if((0 == (leapYear%4) && 0 != (leapYear%100)) || 0== leapYear%400 ) {
		// 4�� ����̸鼭 100�� ����� �ƴ� ��, �ƴϸ� 400�� ����� ��	
			isLeap = true;
		}
		
		return isLeap;
	}

	public void setLeapYear(int leapYear) {
		this.leapYear = leapYear;
	}
	
	public void prints() {
		if(isLeapYear()) {
			System.out.println(leapYear+"���� ���� �Դϴ�.");
		}else {
			System.out.println(leapYear+"���� ������ �ƴմϴ�");
		}
	}
	
	
	public static void staticPrint() {
		// System.out.println(leapYeap); //����
		// static �޼��尡 ����Ҽ� �ִ� �ʵ�� static �̿��� �Ѵ�.
		System.out.println(leapYeap2);	//static�̶� �ȴ�.
	}
	
	/*	���� Ŭ���� ���ο��� �޼���� �ʵ�
	 * - ���� Ŭ�������� �޼���,�ʵ��� ȣ���� Ŭ�������� ������� �ʾƵ� �ȴ�.(�翬)
	 * static�޼��� : static�ʵ�(o) , ����ʵ�(x)
	 * ��� �޼��� : static �ʵ�(o), ����ʵ�(o), static�޼���(o)
	 */
	
	
}
