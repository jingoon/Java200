package book.home_042;

import book.home_041.ScannerInput;

public class ForOddEvenSum42 {
	
	public static void main(String[] args) {
		
		int toNum=100;
		try {
			toNum= ScannerInput.readInt();
		} catch (Exception e) {
			System.out.println("����: Ÿ�� Ȯ��");
			System.exit(1);
		}
		
		int sumOdd=0;
		int sumEven=0;
		
		sumEven = summEven(1,toNum);
		System.out.println("1 to "+ toNum +" even sum" + sumEven);
		
		sumOdd = summOdd(1,toNum);
		System.out.println("1 to "+ toNum +" odd sum" + sumOdd);
	}
	
	public static int summEven(int strart, int end) {
		int sumEven=0;
		//¦�� ��
		for(int i=1;i<=end;i++) {
			if(i%2 !=0) {
				continue;
			}
			sumEven+=i;
		}
		
		return sumEven;
	}
	public static int summOdd(int strart, int end) {
		int sumOdd=0;
		//Ȧ�� ��
		for(int i=1;i<=end;i++) {
			if(i%2 ==0) {
				continue;
			}
			sumOdd+=i;
		}
		
		return sumOdd;
	}
	

}
