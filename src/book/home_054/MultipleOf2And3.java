package book.home_054;

import java.util.Scanner;

public class MultipleOf2And3 {
	
	public static void main(String[] args) {
		//2 or 3 의 배수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n의 배수가 아닌 m의 배수 i까지>");
		
		System.out.print("1이상의 양수(n)를 입력: ");
		int n = sc.nextInt();
		System.out.print("1이상의 양수(m)를 입력: ");
		int m = sc.nextInt();
		System.out.print("1이상의 양수(i)를 입력: ");
		int i = sc.nextInt();
		
		if(n<0 || m<0 || i<0) {
			System.out.println("알맞은 수를 입력하시오");
		}
		
		for(int j=1; j<i;j++) {
			if(j%n!=0 && j%m==0) {
				System.out.print("["+j+"]");
			}
		}
		System.out.println();
		sc.close();
	}

}
