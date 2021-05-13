package book.home_104;

public class ArrayOneTwo {
	private int[] a;
	
	public ArrayOneTwo() {
		// TODO Auto-generated constructor stub
	}
	public ArrayOneTwo(int[] a) {
		setArray(a);
	}
	public void setArray(int[] a) {
		this.a = a;
		
	}
	public int[][] oneToTwo(int m, int n) {
		int[][] aa = null;
		// 3*4==> 12
		int dimen1 = a.length;
		if(dimen1 !=m*n || m*n==0) {
			System.out.println("조건이 알맞지 않는다.");
			return null;
		}else {
			aa= new int[m][n];	// 배열 선언 정의
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				aa[i][j] = a[n*i+j];
			}
			
		}
		return aa;
	}	// twoToOne

}
