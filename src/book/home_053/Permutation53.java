package book.home_053;

import java.util.Scanner;


public class Permutation53 {
	// 순열구하기
	
	//  n! / (n-r)!
	public static void main(String[] args) {
		// nP3 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("[순열 nPr 구하기]");
		System.out.print("서로다른 숫자 n(개):");
		int n = sc.nextInt();
		System.err.print(n+"개중 서로다른 숫자 r(개):");
		int r = sc.nextInt();
		double fn = fac(n);
		double fnMr = fac(n-r);
		
		double permu = fn / fnMr;
		System.out.println(n+"P"+r+" = "+permu);
		sc.close();
		
		printPermute(n);
	}
	private static double fac(int n) {
		double fec = 1.0;
		for(int i=n; i>0; i--) {
			fec *= i;
		}
	return fec;
	}
	
	// 순열의 원리 mP3
	private static void printPermute(int m) {
		int iters = 0;
		for (int i = 1; i <= m ; i++) {
			for (int j = 1; j <= m ; j++) {
				for (int k = 1; k <=m ; k++) {
					if((i!=j) && (j!=k) && (i!=k)) {
						System.out.printf("[%d,%d,%d] ",i,j,k);
						iters++;
						if((iters%5) ==0) {
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("총 : "+m+"C3= "+ getPermutecount(m));
	}

	private static int getPermutecount(int m) {
		int count = 0;
		for (int i = 1; i <= m ; i++) {
			for (int j = 1; j <= m ; j++) {
				for (int k = 1; k <=m ; k++) {
					if((i!=j) && (j!=k) && (i!=k)) {
						count++;
					}
				}
			}
		}
		return count;
	}

}
