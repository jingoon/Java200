package book.home_105;

public class ArrayTwoOne {
	
	public ArrayTwoOne() {
		
	}
	
	public int[] twoToOne(int[][] aa) {
		int[] a=null;
		int y = aa.length;
		int x = aa[0].length;
		if(y<0 || x<0) {	// 1�̾�� ���� �ʳ�?
			System.out.println("�����ϰ��� �ϴ� �迭�� ũ�Ⱑ �߸��Ǿ����ϴ�.");
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
