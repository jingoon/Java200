package book.home_061;

import java.util.Scanner;

public class Odd3nEven2 {
	
	public static void main(String[] args) {
		// n�� Ȧ���̸� 3*n+1, ¦���̸� n/2�Ͽ� 1�� �����.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		odd(n);	
		sc.close();
	}
	
	public static boolean evenOk(int n) {
		boolean even = false;
		if(n%2 == 0) {
			even = true;
		}
		return even;
	}
	
	public static void odd(int n) {
		String n2 = "";
		while(true) {
			if(evenOk(n)) {
				n /= 2;
			}else {
				n = 3*n+1;
			}
			n2 += String.valueOf(n);
			if(n<=1) {
				break;
			}
			n2 +=",";
		}
		System.out.println(n2);
	}
	

}
