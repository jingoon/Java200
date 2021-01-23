package book.home_035;

import java.util.Scanner;

public class WhileTest2Chapt25 {
	
	public static void main(String[] args) {
		int m=150;
		int n=330;
		while (m!=n) {	//m과 n이 같으면 끝난다
			System.out.print("["+m+","+n+"]");
			if(m>n)m-=n;
			else if(n>m)n-=m;
		}
		System.out.println();
		System.out.println("최대공약수:"+m);
		
		// 두 수를 입력받아 최대공약수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("두수를 입력하여 최대 공약수를 구하기");
		System.out.print("첫번째 수 입력: ");
		int a= sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 수 입력: ");
		int b= sc.nextInt();
		sc.nextLine();
		mytest(a,b);
		sc.close();
	}
	
	private static void mytest(int m, int n) {
		while (m!=n) {
			if(m>n)m-=n;
			else if(n>m)n-=m;
		}
		System.out.println("입력 최대공약수:"+m);

	}

}
