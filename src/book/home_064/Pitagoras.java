package book.home_064;

public class Pitagoras {

	public static void main(String[] args) {
		// 피타고라스 정의를 만족하는 수 찾기
		// 피타고라스의 정의 한변의제곱은 다른 두변의 제곱의 합과 같다
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
					System.out.println("a가" + a + " 일때 b:" + b + " c:" + c);
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
