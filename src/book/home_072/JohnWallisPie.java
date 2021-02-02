package book.home_072;


public class JohnWallisPie {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(new JohnWallisPie().makePie(1000000));
		System.out.println(new JohnWallisPie().makePie(10000000));
	}
	public int nmAn(int start, int n, int d) {
		return (start+n*d);
	}
	
	public double mDivide(double n) {
		return (n*n)/(n-1)/(n+1);
	}
	
	public double makePie(int n) {
		double temp=1;
		for (int i = 0; i < n; i++) {
			temp *= mDivide(nmAn(2, i, 2));
		}
		return 2.0*temp;
	}
}
