package book.home_056;

import java.util.Scanner;

import book.home_055.IfLeapYears;

public class ShowLeapYears {
	
	public static void main(String[] args) {
		System.out.println("������ �⵵�� ����ϱ�");
		System.out.print("�˻��� ���� �⵵�� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int startYear = sc.nextInt(); 
		System.out.print("�˻��� ������ �⵵�� �Է�: ");
		int endYear = sc.nextInt();
		for(int i= startYear; i<= endYear; i++) {
			if(IfLeapYears.isLeapYear(i)) {	//import book.home_055.IfLeapYears;
				IfLeapYears.printS(i, true);//import book.home_055.IfLeapYears;
			}
		}
		sc.close();
	}

}
