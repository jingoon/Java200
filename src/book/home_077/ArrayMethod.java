package book.home_077;

public class ArrayMethod {
	
	public void copyV(int[]q, int[]p) {
		for (int i = 0; i < q.length; i++) {
			p[i]=q[i];
		}
	}

	
	public void bbsort(int[]a) {
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	
	public void copyR(int[]q,int[]p) {
		p=q;
	}

	public void copyRChange(int[]q,int[]p) {
		p=q;
		p[0]=35;
	}
	public void copyVInt(int q,int p) {
		p=q;
	}
	public void multi(int q) {
		q=q*10;
	}
	public void print(int[]p) {
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]+" ");
		}
		System.out.println();
	}
}
