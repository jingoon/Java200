package book.home_054;

import java.util.Scanner;

public class MultipleOf2And3 {
	
	public static void main(String[] args) {
		//2 or 3 �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n�� ����� �ƴ� m�� ��� i����>");
		
		System.out.print("1�̻��� ���(n)�� �Է�: ");
		int n = sc.nextInt();
		System.out.print("1�̻��� ���(m)�� �Է�: ");
		int m = sc.nextInt();
		System.out.print("1�̻��� ���(i)�� �Է�: ");
		int i = sc.nextInt();
		
		if(n<0 || m<0 || i<0) {
			System.out.println("�˸��� ���� �Է��Ͻÿ�");
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
