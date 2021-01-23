package book.home_041;

import java.util.Scanner;

public class ScannerInput {
	
		final static String help1= "정수형의 숫자 하나만 입력 부탁 드립니다:";
		
		
		public static int readInt() {
			System.out.println(help1);
			Scanner input = new Scanner(System.in);
			return input.nextInt();
			
		}

}
