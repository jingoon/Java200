package book.home_048;

public class GuGuDan48 {
	
	public static void main(String[] args) {
		//GuGuDan48.printGuGu();�� ���� static�޼���
		printGuGu();
		System.out.println("---------------------");
		//GuGuŬ������ ��ü ������ ȣ��
		GuGu gu = new GuGu();
		gu.printGu();
		System.out.println("---------------------");
		//GuGuŬ������ static�޼��� ȣ��
		GuGu.printGuGu();
		
	}
	
	public static void printGuGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}

class GuGu{
	public void printGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	public static void printGuGu() {
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <=9 ; j++) {
				System.out.print(j+"*"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
}