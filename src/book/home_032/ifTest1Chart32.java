package book.home_032;

public class ifTest1Chart32 {
	
	//������ ���� ��� �ű��(��ø if��)
	//90�� �̻��̸� A, 80~89���̸� B�� �ִ� ������ ������ �Űܺ���
	public static void main(String[] args) {
		
		// myself
		int score = 78;
		System.out.println("����:"+score+"�� ������ "+mySelf(score));
		
		//study book
		int valuA=90;
		int valuB=80;
		int valuC=70;
		int valuD=60;
		
		int a=78;
		if(a>=valuA) {
			System.out.println("A");
		}else if(a>=valuB) {
			System.out.println("B");
		}else if(a>=valuC) {
			System.out.println("C");
		}else if(a>=valuD) {
			System.out.println("D");
		}else  {
			System.out.println("F");
		}
		
		
		int b=78;
		if(b>=valuA) {
			System.out.println("A");
		}else {
			if(b>=valuB) {
				System.out.println("B");
			}else {
				if(b>=valuC) {
					System.out.println("C");
				}else {
					if(b>=valuD) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		
		}
		
		
		
	}
	public static String mySelf(int a) {
		if(a>100 || a<0) {
			return "�������� ���";
		}else if(a>=90) {
			return "A";
		}else if(a>=80) {
			return "B";
		}else if(a>=70) {
			return "C";
		}else if(a>=60) {
			return "D";
		}else if(a>=50) {
			return "E";
		}else {
			return "F";
		}
	}
	

}
