package book.home_072;

public class LaiphnizPie {
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(new LaiphnizPie().makePie(10000000));
		System.out.println(new LaiphnizPie().makePie(100000000));
		
	}
	
	public double posiNega(int start, int n, int d) {
		int oper = (n%2) ==0? 1:-1; //odd->-1
		return oper*new JohnWallisPie().nmAn(start, n, d);
	}
	
	public double mDivide(double n) {
		return 1.0/n;
	}
	
	public double makePie(int n) {
		double temp=0;
		for (int i = 0; i < n; i++) {
			temp += mDivide(posiNega(1, i, 2));
		}
		return 4.0*temp;
	}

}
