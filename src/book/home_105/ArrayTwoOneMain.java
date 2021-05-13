package book.home_105;

import book.home_104.ArrayOneTwo;
import book.home_104.ArrayPrint;

public class ArrayTwoOneMain {
	
	public static void main(String[] args) {
		
		// 1차원 배열을 2차원 배열로 변경
		ArrayOneTwo oneToTwo = new ArrayOneTwo();
		oneToTwo.setArray(new int[] {12,11,10,9,8,7,6,5,4,3,2,1});
		int [][] two= oneToTwo.oneToTwo(4, 3); // 3x4 2차원 배열 만들기
		ArrayPrint.print(two); // 2차원 배열 출력
		System.out.println();
		
		// 2차원 배열을 1차원 배열로 변경
		ArrayTwoOne twoToOne = new ArrayTwoOne();
		int[] one= twoToOne.twoToOne(two); // 메서드 호출
		ArrayPrint.print(one); // 변경된 1차원 배열 출력
		
	}

}
