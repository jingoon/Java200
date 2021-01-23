package book.home_052;

import java.util.Scanner;

public class Combination52 {

	public static void main(String[] args) {
		//서로다른 숫자 n개 중 서로 다른 r개를 선택하는 방법의 개수는?
		
		//ncr
		Scanner sc = new Scanner(System.in);
		System.out.println("서로다른 숫자 n개 중 서로 다른 r개를 선택하는 방법의 개수는?");
		System.out.print("- 총 숫자의 개수 n: ");
		int n = sc.nextInt();
		System.out.print("- 선택할 숫자의 개수 r: ");
		int r = sc.nextInt();
		double combi = combi(n, r);
		System.out.println(n+"C"+r+" = "+combi);
		//System.out.printf("%d%s%d= %d",n,'C',r,combi);
		sc.close();
	}

	private static double combi(int n, int r) {
		
		double nF = fec(n); // n!
		double nMrF = fec(n-r); // (n-r)!
		double rF = fec(r); // r!
		double combi = nF/(nMrF*rF); // n!/((n-r)!*r!)
		return combi;
	}

	// n!를 구하는 메서드
	private static double fec(int n) {
			double fec = 1.0;
			for(int i=n; i>0; i--) {
				fec *= i;
			}
		return fec;
	}

}
