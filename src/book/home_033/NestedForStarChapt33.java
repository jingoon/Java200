package book.home_033;

public class NestedForStarChapt33 {
	
	public static void main(String[] args) {
		// ������ �Ʒ��� ������ ���� #�� ������ �þ���� ���
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for(int i=0;i<11;i++) {
			for(int j=0;j<=10-i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
