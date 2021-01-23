package book.home_039;

import java.util.Scanner;

public class ScannerChapt39 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("숫자를 입력:");
		int n = input.nextInt();
		
		System.out.println("입력숫자:"+n);
		
		input.close();
	}

}
