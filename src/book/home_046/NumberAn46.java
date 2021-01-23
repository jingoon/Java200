package book.home_046;

import book.home_041.ScannerInput;

public class NumberAn46 {
	public static void main(String[] args) {
		int toNum = 10;
		
		try {
			toNum = ScannerInput.readInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		
		double sum = sumAn(1, toNum, 1); 
		System.out.println("1 to "+toNum+" : = "+sum);
		System.out.println();
		double sum2 = sumAn(1, toNum, 2); 
		System.out.println("1 to "+toNum+" : = "+sum2);
		System.out.println();
	}
	
	public static int numAn(int start, int n, int d) {
		return (start+n*d);
	}
	
	public static double divNum(int n) {
		return 1.0/fact(n);
	}
	public static double fact(int m) {
		double temp=1;
		if(m<=0) temp=1;
		for(int i =m; i>0;i--) {
			temp*=i;
		}
		return temp;
	}
	
	public static double sumAn(int start, int n, int d) {
		double sum=0;
		for (int i = 0; i < n; i++) {
			System.out.println("["+divNum(numAn(start, i, d))+"]");
			sum += divNum(numAn(start, i, d));
		}
		return sum;
	}

}
