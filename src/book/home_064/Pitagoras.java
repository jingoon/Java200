package book.home_064;

public class Pitagoras {

	public static void main(String[] args) {
		// ��Ÿ��� ���Ǹ� �����ϴ� �� ã��
		// ��Ÿ����� ���� �Ѻ��������� �ٸ� �κ��� ������ �հ� ����
		// a*a = b*b  + c*c
		Pitagoras p = new Pitagoras();
		
		for(int a=20; a<30;a++) {
			p.pita(a);
		}
		
		
	}
	
	public void pita(int a) {
		int b = 0;
		int c = 0;
		
		for (b = 0; b < a; b++) {
			for (c = 0; c < a; c++) {
				if (pitaOk(a, b, c) && b > c) {
					System.out.println("a��" + a + " �϶� b:" + b + " c:" + c);
				}
			}
		}

	}
	
	public boolean pitaOk(int a, int b, int c) {
		boolean pOk = false;
		if(a*a == (b*b)+(c*c) ) {
			pOk=true;
		}
		
		return pOk;
	}
}
