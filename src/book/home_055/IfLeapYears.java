package book.home_055;

import java.util.Scanner;

public class IfLeapYears {
	public static void main(String[] args) {
		boolean yearTF=false;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �˻��� �⵵�� �Է��ϼ���: ");
		int year=sc.nextInt();
		if((0==(year%4) && 0!=(year%100)) || 0 ==year%400){
			yearTF = true;
		}else {
			yearTF = false;
		}
		
		if(yearTF) {
			System.out.println(year+"�� �����Դϴ�");
		}else {
			System.out.println(year+"�� ������ �ƴմϴ�");
		}
		
		printS(year,isLeapYear(year));
		sc.close();
	}
	
	public static void printS(int year, boolean leapYear) {
		if(leapYear) {
			System.out.println(year+"�� �����Դϴ�");
		}else {
			System.out.println(year+"�� ������ �ƴմϴ�");
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
