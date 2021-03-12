package book.home_089;

public class BitShifting {
	
	public static final int BITMASK =1;
	
	public String makeBit(int value) {
		// char 배열을 String으로 만들기 위해
		char[] val = new char[32];
		for(int i=31; i>=0;i--) {
			if((value&BITMASK)==1) {
				val[i]='1';
			}else {
				val[i]='0';
			}
			value >>>=1;
		}
		
		return new String(val);

	}
	
	// 양수이면 오른쪽 이동, 음수이면 왼쪽이동
	
	public String makeBit(int orgin, int shift) {
		String temp ="";
		if(shift>=0) {
			temp=makeBit(orgin>>shift);
		}else {
			temp=makeBit(orgin<<(-shift));
		}
		return temp;
	}

}
