package book.home_045;

import book.home_041.ScannerInput;

public class NumberAn45 {
	
	public static void main(String[] args) {
		int toNum = 0;
		
		try {
			toNum = ScannerInput.readInt();
		} catch (Exception e) {
			System.out.println("예외 타입확인");
			System.exit(1);
		}
		
		double sum = sumAn(1,toNum, 1);//1/n, 1/n+1 , 1/n+2, ...
		System.out.println("\n1 to "+toNum+" summation="+sum+"\n");
	
		double sum2 = sumAn(1,toNum, 2);// 1/n, 1/n+3, 1/n+5, 1/n+7, ...
		System.out.println("\n1 to "+toNum+"odd summation="+sum2+"\n");
	}
	
	public static int numAn(int start, int n, int d) {
		return (start+n*d);
	}
	
	public static double divNum(int start, int n, int d) {
		return 1.0/numAn(start, n, d);
	}
	
	public static double sumAn(int start, int n, int d) {
		double sum = 0;
		for (int i = 0; i < n; i++) {
		System.out.println("["+divNum(start, i, d)+"]");
		sum+=divNum(start, i, d);
		}
		return sum;
	}
	
	

}
