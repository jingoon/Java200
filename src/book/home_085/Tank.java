package book.home_085;

public class Tank {
	
	/* 
	 *  �޼���� ���������ڿ� ��ȯ���� ������ ������ ����ϴ� ��� or �Լ�
	 *  ��� �ʵ�� ���������ڸ� ������ Ŭ��������(�ʵ念��)�� ����� ����
	 *	��� ������ �޼��� �ȿ��� ����� ����
	 *   
	 *  �޼���� ����Ϸ��� ����ʵ尡 static�� �� static���� �ۼ� �� �� �ִ�
	 *  ����ʵ尡 static�� �� �޼���� static���ε� �ۼ� �� �� �ִ�.
	 *  ����ʵ�, �޼��� ��Ϻ����� ��ü�� �����ؾ� ��� ����
	 *  static �޼���� ����ʵ�� ��ü�� �������� �ʾƵ� Ŭ�����̸����� ���� �� ��밡��
	 *	
	 *	�޸��� ����
	 *	static�������� Ŭ����(���赵)�� �ö󰡰�, static�ʵ嵵 �غ�ȴ�
	 *	stack�������� ���۷���(��ü�� ����)�� ��Ϻ���(�޼���ȣ��~����)�� �ö󰣴�
	 *	heap�������� Ŭ������ �������� ��ü�� ����(new Tank())�ؾ� ��ü�� �ö󰣴�.
	 *  ��ü�� ������ �Ŀ� (static�� �ƴ�) ����ʵ�� �޼��带 ����� �� �ִ�.
	 *  
	*/
	
	public static int howmany =0;		//static ����ʵ�(�������)
	public int howfast =100;			// ����ʵ�(�������)
		
	public void input() {				// �޼���
		howmany ++;
	}
	
	public void increase() {
		howfast +=30;
	}
	
	public static int getHowMany() {	//static �޼���
		return howmany;
	}
	
	public int getHowFast() {
		return howfast;
	}
	
	public void showShortLife() {
		int age = 5;					//��Ϻ���
		howfast -= age;
	}
	
}
