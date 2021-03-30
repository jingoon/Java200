package book.home_091;

public class ArrayNotUsinAPI {
	
	//System.arraycopy
	public static void arraycopy(int q[], int p[]) {
		for(int i=0; i<q.length; i++) {
			p[i] =q[i];
		}
	}
	
	//a[] == b[] ?
	public static boolean eq(int a[], int b[]) {
		boolean isS = false;
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i]==b[i]) {
					isS = true;
				}else {
					isS = false;
					break;
				}
			}
		}
		
		return isS;
	}// equals
	
	//�迭 a�� b������ �ʱ�ȭ
	public static void fill(int a[], int b) {
		for(int i=0; i<a.length; i++) {
			a[i] = b;
		}
	}

	// ���������� ����
	public static void sort(int[] a) {
		if (a.length<=0) {
			return;
		}
		int n = a.length-1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j]= temp;
				}
			}
		}
	}// ����
	
	// int �迭�� ���
	
	public static void prints(int[] a) {
		
		for(int i : a) {
			System.out.print(i==a[0]? "[ ": "");
			System.out.print(i);
			System.out.print(i==a[a.length-1]? " ]": ", ");
		}
		
	}
	
	
	
}
