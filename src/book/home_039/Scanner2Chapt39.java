package book.home_039;

import java.util.Scanner;

public class Scanner2Chapt39 {
	public static void main(String[] args) {
		
		String str = readString();
		char[] charStr=str.toCharArray();
		int count=charStr.length;
		
		int count2= str.length();
		boolean c = count==count2;
		System.out.println("count==count : "+c);
		
		System.out.println("count ���ڼ�: "+count);
		for(char i : charStr) {
			System.out.print(i + ":");
		}
		System.out.println();
		
		System.out.println("count2 ���ڼ�: "+count2);
		for(int i=0;i<str.length();i++) {
			System.out.print(str.substring(i, i+1)+ ":");
		}
		System.out.println();
		
		
	}
	
	
	public static int readInt() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է�:");
		return input.nextInt();
	}
	
	public static Double readDouble() {
		Scanner input = new Scanner(System.in);
		System.out.print("�Ǽ��� �Է�:");
		return input.nextDouble();
	}
	
	public static String readString() {
		Scanner input = new Scanner(System.in);
		System.out.print("���ڿ��� �Է�:");
		return input.nextLine();
	}

}
