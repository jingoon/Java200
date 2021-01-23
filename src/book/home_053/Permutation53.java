package book.home_053;

import java.util.Scanner;


public class Permutation53 {
	// �������ϱ�
	
	//  n! / (n-r)!
	public static void main(String[] args) {
		// nP3 ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("[���� nPr ���ϱ�]");
		System.out.print("���δٸ� ���� n(��):");
		int n = sc.nextInt();
		System.err.print(n+"���� ���δٸ� ���� r(��):");
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
	
	// ������ ���� mP3
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
		System.out.println("�� : "+m+"C3= "+ getPermutecount(m));
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
