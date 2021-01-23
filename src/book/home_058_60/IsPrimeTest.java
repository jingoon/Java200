package book.home_058_60;

import java.util.Scanner;

public class IsPrimeTest {

	public static void main(String[] args) {
		
		// 10000873 �� �ڼ� ���� Ȯ���غ���
		// �ڼ��� 1�� �ڱ� �ڽ����θ� ���������� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�ڼ����� Ȯ���غ���\n");
		System.out.print("�����ϳ� �Է�: ");
		long i = sc.nextLong();
		
		
		for (int j = 2; j < i; j++) {
			if(i%j==0) {
				System.out.println(i+ "�� �Ҽ��� �ƴմϴ�.");
				break;
			}else if(j==i-1) {
				System.out.println(i+" �� �Ҽ��Դϴ�.");
			}
		}
		
		// x ~ y ���̿� �ڼ��� ����� �˾ƺ���
		System.out.print("x�� �Է�: ");
		int x = sc.nextInt();
		System.out.print("y�� �Է�: ");
		int y = sc.nextInt();
		long start = System.currentTimeMillis();
		System.out.println(new IsPrimeTest().showPrimes(x , y)+"��");
		long end = System.currentTimeMillis();
		System.out.println("ù��° �˻� �ð�: "+ (end-start) +"�и���");
		start = System.currentTimeMillis();
		System.out.println(new IsPrimeTest().showPrimes2(x , y)+"��");
		end = System.currentTimeMillis();
		System.out.println("�ι�° �˻� �ð�: "+ (end-start) +"�и���");
		sc.close();
	}
	public int showPrimes(int x , int y) {
		int s = 0;
		System.out.println("x ~ y ���̿� �ڼ��� ����� �˾ƺ���");

		
		for (int i = x; i <= y; i++) {
			for (int j = 2; j < i; j++) {
				if(i%j ==0 ) {
					//�ڼ��� �ƴ�
					break;
				}else if(j == i-1) {
					//System.out.println(i+" �ڼ���");//�ڼ���
					s++;
				}
			}
			
		}
		return s;
	}
	
	public int showPrimes2(int x, int y) {
		int s = 0;
		System.out.println("�ڼ��˻� �ݺ�Ƚ�� ���̱�");
		for (int i = x; i <= y; i++) {
			if(i/2 ==0 || i/3 ==0 || i/5 ==0 || i/7 ==0 )continue; // i�� ¦���� ����
			for (int j = 2; j < i; j++) {
				if(i%j ==0 ) {
					//�ڼ��� �ƴ�
					break;
				}else if(j == i-1) {
					//System.out.println(i+" �ڼ���");//�ڼ���
					s++;
				}
			}
			
		}
		return s;
	}
}
