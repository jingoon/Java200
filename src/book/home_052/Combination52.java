package book.home_052;

import java.util.Scanner;

public class Combination52 {

	public static void main(String[] args) {
		//���δٸ� ���� n�� �� ���� �ٸ� r���� �����ϴ� ����� ������?
		
		//ncr
		Scanner sc = new Scanner(System.in);
		System.out.println("���δٸ� ���� n�� �� ���� �ٸ� r���� �����ϴ� ����� ������?");
		System.out.print("- �� ������ ���� n: ");
		int n = sc.nextInt();
		System.out.print("- ������ ������ ���� r: ");
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

	// n!�� ���ϴ� �޼���
	private static double fec(int n) {
			double fec = 1.0;
			for(int i=n; i>0; i--) {
				fec *= i;
			}
		return fec;
	}

}
