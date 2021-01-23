package book.home_043;

import book.home_041.ScannerInput;

public class NumberAn43 {
	
	public static void main(String[] args) {
		
		int toNum=10;
		
		try {
			toNum = ScannerInput.readInt();
		} catch (Exception e) {
			System.out.println("예외: 입력 타입 확인 요망");
			e.printStackTrace();
			System.exit(0);
		}
		int sum = sumAn(toNum, 1, 2);		//등차수열 1부터 +2씩 증가
		System.out.println("sum= "+sum);
		
		int sum2 = sumBn(toNum, 1, 2);		//등비수열	1부터 *2씩 증가
		System.out.println("sum= "+sum2);
		
		int sum3 = sumCn(toNum, 2, 3, -2);	//점화식 2부터 (x*3-2)씩 증가
		System.out.println("sum= "+sum3);
	}
	
	public static int numAn(int start, int n, int d) {
		return (start+n*d);
	}
	
	public static int sumAn(int n, int start, int d) {
		int sum=0;
		for (int i = 0; i < n; i++) {
			System.out.print("["+numAn(start, i, d)+"] ");
			sum += numAn(start, i, d);
		}
		System.out.println();
		return sum;
	}
	
	public static int numBn(int start, int n, int r) {
		int nums=1;
		for (int i = 0; i < n; i++) {
			nums *=start*r;
		}
		
		return nums;
	}
	
	public static int sumBn(int n, int start, int r) {
		int sum =0;
		for (int i = 0; i < n; i++) {
			System.out.print("["+numBn(start, i, r)+"] ");
			sum += numBn(start, i, r);
		}
		System.out.println();
		return sum;
	}
	
	public static int numCn(int n, int start, int a, int d) {
		//An+1=a*Am+d 점화식
		for (int i = 0; i < n; i++) {
			start = a*start+d;
		}
		return start;
	}
	public static int sumCn(int n, int start, int a, int d) {
		int sum=0;
		for (int i = 0; i < n; i++) {
			System.out.print("["+numCn(i, start, a, d)+"] ");
			sum +=numCn(i, start, a, d);
		}
		System.out.println();
		return sum;
	}
}
