package book.home_041;

import java.util.Scanner;

public class ScannerInput {
	
		final static String help1= "�������� ���� �ϳ��� �Է� ��Ź �帳�ϴ�:";
		
		
		public static int readInt() {
			System.out.println(help1);
			Scanner input = new Scanner(System.in);
			return input.nextInt();
			
		}

}
