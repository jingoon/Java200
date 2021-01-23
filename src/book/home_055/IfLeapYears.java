package book.home_055;

import java.util.Scanner;

public class IfLeapYears {
	public static void main(String[] args) {
		boolean yearTF=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년을 검사할 년도를 입력하세요: ");
		int year=sc.nextInt();
		if((0==(year%4) && 0!=(year%100)) || 0 ==year%400){
			yearTF = true;
		}else {
			yearTF = false;
		}
		
		if(yearTF) {
			System.out.println(year+"는 윤년입니다");
		}else {
			System.out.println(year+"는 윤년이 아닙니다");
		}
		
		printS(year,isLeapYear(year));
		sc.close();
	}
	
	public static void printS(int year, boolean leapYear) {
		if(leapYear) {
			System.out.println(year+"는 윤년입니다");
		}else {
			System.out.println(year+"는 윤년이 아닙니다");
		}
		
	}

	public static boolean isLeapYear(int year) {
		boolean isLeap =false;
		if((0==(year%4) && 0!=(year%100)) || 0 ==year%400){
			isLeap = true;
		}
		
		return isLeap;
	}
	
}
