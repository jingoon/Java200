package book.home_037;

public class WhileBreakChapt37 {
	
	public static void main(String[] args) {
		// 1~10���� Ȧ���� ¦���� ����
		int i=0;
		
		while(true) {
			i++;
			if(i%2==0) {
				System.out.println("¦��: "+i);
			}else {
				System.out.println("Ȧ��: "+i);
			}
			if(i==10) {
				break;
			}

		}
	}

}
