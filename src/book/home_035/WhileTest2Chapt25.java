package book.home_035;

import java.util.Scanner;

public class WhileTest2Chapt25 {
	
	public static void main(String[] args) {
		int m=150;
		int n=330;
		while (m!=n) {	//m�� n�� ������ ������
			System.out.print("["+m+","+n+"]");
			if(m>n)m-=n;
			else if(n>m)n-=m;
		}
		System.out.println();
		System.out.println("�ִ�����:"+m);
		
		// �� ���� �Է¹޾� �ִ����� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͽ� �ִ� ������� ���ϱ�");
		System.out.print("ù��° �� �Է�: ");
		int a= sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° �� �Է�: ");
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
		System.out.println("�Է� �ִ�����:"+m);

	}

}
