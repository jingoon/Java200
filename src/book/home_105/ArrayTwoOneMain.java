package book.home_105;

import book.home_104.ArrayOneTwo;
import book.home_104.ArrayPrint;

public class ArrayTwoOneMain {
	
	public static void main(String[] args) {
		
		// 1���� �迭�� 2���� �迭�� ����
		ArrayOneTwo oneToTwo = new ArrayOneTwo();
		oneToTwo.setArray(new int[] {12,11,10,9,8,7,6,5,4,3,2,1});
		int [][] two= oneToTwo.oneToTwo(4, 3); // 3x4 2���� �迭 �����
		ArrayPrint.print(two); // 2���� �迭 ���
		System.out.println();
		
		// 2���� �迭�� 1���� �迭�� ����
		ArrayTwoOne twoToOne = new ArrayTwoOne();
		int[] one= twoToOne.twoToOne(two); // �޼��� ȣ��
		ArrayPrint.print(one); // ����� 1���� �迭 ���
		
	}

}
