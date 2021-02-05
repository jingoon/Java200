package book.home_075;

public class ArrayTwoInit {
	
	public static void main(String[] args) {
		System.out.println("//2���� �迭 ��� 1");
		int[][] a= new int[4][3];
		a[0][0] =1;
		a[0][1] =2;
		a[3][2] =3;
		//... �̷��Դ� �Ⱦ�����
		ArrayTwoInit at = new ArrayTwoInit();
		at.println(a);
		
		System.out.println("//2���� �迭 ��� 2");
		int [][]b= new int[3][];
		b[0] = new int[4];
		b[1] = new int[5];
		b[2] = new int[6];
		at.println(b);
		
		System.out.println("//2���� �迭 ��� 3");
		int[][]c=new int[][] {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		at.println(c);
		
		System.out.println("//2���� �迭 ��� 4");
		int[][]cc=null;
		cc=new int[][] {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		at.println(cc);
		
		System.out.println("//2���� �迭 ��� 5");
		int[][]g= {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};
		at.println(g);
		
		System.out.println("copy 1");
		int[][]dd=at.copy(b);
		at.println(dd);
		
		System.out.println("copy 2");
		int[][]d=new int[b.length] [b[0].length];//b[0].length ������ NullPointerException
		for (int i = 0; i < b.length; i++) {
			System.arraycopy(b[i], 0, b[i], 0, b[i].length);
		}
		b[0][0]=-5;
		at.println(d);// ���� ����
		
		System.out.println("copy 3");
		int[][]e =new int[b.length][];
		System.arraycopy(b, 0, e, 0, b.length);
		b[0][0]=-4;
		at.println(e);// ���� ���� b�� ���� ���ϸ�, e�� ���� ���Ѵ�.
				
		System.out.println("copy 4 *** �̰Ŵ�");
		int[][]f =new int[b.length][];
		f=e; //shallow copy
		e[0][0]=-400;
		at.println(f);
				
	}
	
	public void println(int[][] p) {
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				System.out.print(p[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public int[][] copy(int[][] p) {
		int[][]d=new int[p.length] [];
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				int k=p[i].length;
				d[i]=new int[k];
			}
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[i].length; j++) {
				d[i][j]= p[i][j];
			}
		}
		return d;
	}
	
}
