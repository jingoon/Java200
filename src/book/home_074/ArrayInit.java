package book.home_074;

public class ArrayInit {

	public static void main(String[] args) {
		// �⺻ Ÿ���� �迭 ��� ��� 
		// 1 ����
		int [] a=null;	//����
		a=new int[5];	//����
		a[0]=2;			//�ʱ�ȭ	
		a[1]=5;
		a[2]=3;
		a[3]=9;
		a[4]=8;
		
		int[] aa = new int [5];
		
		// 2 ���� ���� �ʱ�ȭ
		int[] b= new int[] {2,5,3,9,8};
		
		// 3 ���� ���� �ʱ�ȭ
		int[] c= {2,5,3,9,8};
		int cc[]= {2,5,6,2,3};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}	
		System.out.println();
		
		int[]d =a;
		a[4]=55;// ���� ����
		for (int val : d) {
			System.out.print(val+" ");
		} 
		System.out.println();
		
		int []e=new int[5];
		System.arraycopy(d, 0, e, 0, d.length);	//value assignment 0�� ����
		d[4]=100;	//d�� ���� ������Ű�� e�� ���� ���ұ�
		for (int val : e) {
			System.out.print(val+ " ");
		}
		System.out.println();
		reString();
		
	}
	
	public static void reString() {
		String a="�����ٶ󸶹ٻ�4eawdadasd23w����ew��aīŸesdfaffbqv23b453qbv6aesdaqwd����";
		String b="";
	
		for (int i =0; i < a.length(); i++) {
			b += a.charAt(a.length()-1-i);
		}
		System.out.println(b);
		
	}
}
