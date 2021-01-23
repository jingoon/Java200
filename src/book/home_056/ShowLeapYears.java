package book.home_056;

import java.util.Scanner;

import book.home_055.IfLeapYears;

public class ShowLeapYears {
	
	public static void main(String[] args) {
		System.out.println("윤년인 년도만 출력하기");
		System.out.print("검사할 시작 년도를 입력: ");
		Scanner sc = new Scanner(System.in);
		int startYear = sc.nextInt(); 
		System.out.print("검사할 마지막 년도를 입력: ");
		int endYear = sc.nextInt();
		for(int i= startYear; i<= endYear; i++) {
			if(IfLeapYears.isLeapYear(i)) {	//import book.home_055.IfLeapYears;
				IfLeapYears.printS(i, true);//import book.home_055.IfLeapYears;
			}
		}
		sc.close();
	}

}
