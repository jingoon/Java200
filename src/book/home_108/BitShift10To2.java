package book.home_108;

public class BitShift10To2 {
	
	private int [] b = new int[32];
	
	// 10진수를 2진수로 만들기 위해 배열에 대입
	public void shift(int a) {
		b = new int[b.length];
		for (int i = 0; i < b.length; i++) {
			int aa = a%2;
			b[i] =(aa>=0)? aa: -aa;
			a>>=1;	// a/=2;
		}
	}
	
	// 배열에 대입된 수를 2진수 스트링 버퍼를 이용
	
	public String showsb() {
		StringBuffer sb = new StringBuffer();
		int count =1;
		for (int i = b.length-1; i >=0 ; i--) {
			sb.append(b[i]);
		}
		return sb.toString();
	}

}
