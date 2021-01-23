package book.home_058_60;

import java.util.Scanner;

public class IsPrimeTest {

	public static void main(String[] args) {
		
		// 10000873 이 솟수 인지 확인해보자
		// 솟수는 1과 자기 자신으로만 나누어지는 수
		Scanner sc = new Scanner(System.in);
		System.out.print("솟수인지 확인해보자\n");
		System.out.print("숫자하나 입력: ");
		long i = sc.nextLong();
		
		
		for (int j = 2; j < i; j++) {
			if(i%j==0) {
				System.out.println(i+ "는 소수가 아닙니다.");
				break;
			}else if(j==i-1) {
				System.out.println(i+" 는 소수입니다.");
			}
		}
		
		// x ~ y 사이에 솟수가 몇개인지 알아보자
		System.out.print("x를 입력: ");
		int x = sc.nextInt();
		System.out.print("y를 입력: ");
		int y = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println(new IsPrimeTest().showPrimes(x , y)+"개");
		long end = System.currentTimeMillis();
		System.out.println("첫번째 검사 시간: "+ (end-start) +"밀리초");
		start = System.currentTimeMillis();
		System.out.println(new IsPrimeTest().showPrimes2(x , y)+"개");
		end = System.currentTimeMillis();
		System.out.println("두번째 검사 시간: "+ (end-start) +"밀리초");
		sc.close();
	}
	public int showPrimes(int x , int y) {
		int s = 0;
		System.out.println("x ~ y 사이에 솟수가 몇개인지 알아보자");

		
		for (int i = x; i <= y; i++) {
			for (int j = 2; j < i; j++) {
				if(i%j ==0 ) {
					//솟수가 아님
					break;
				}else if(j == i-1) {
					//System.out.println(i+" 솟수임");//솟수임
					s++;
				}
			}
			
		}
		return s;
	}
	
	public int showPrimes2(int x, int y) {
		int s = 0;
		System.out.println("솟수검사 반복횟수 줄이기");
		for (int i = x; i <= y; i++) {
			if(i/2 ==0 || i/3 ==0 || i/5 ==0 || i/7 ==0 )continue; // i가 짝수면 버려
			for (int j = 2; j < i; j++) {
				if(i%j ==0 ) {
					//솟수가 아님
					break;
				}else if(j == i-1) {
					//System.out.println(i+" 솟수임");//솟수임
					s++;
				}
			}
			
		}
		return s;
	}
}
