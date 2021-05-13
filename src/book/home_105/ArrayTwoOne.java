package book.home_105;

public class ArrayTwoOne {
	
	public ArrayTwoOne() {
		
	}
	
	public int[] twoToOne(int[][] aa) {
		int[] a=null;
		int y = aa.length;
		int x = aa[0].length;
		if(y<0 || x<0) {	// 1이어야 하지 않나?
			System.out.println("변경하고자 하는 배열의 크기가 잘못되었습니다.");
		}else {
			a= new int [y*x];
			
			for (int i = 0; i < y; i++) {
				for (int j = 0; j < x; j++) {
					a[i*x+j] = aa[i][j];
				}
			}
		}
		
		return a;
	}

}
