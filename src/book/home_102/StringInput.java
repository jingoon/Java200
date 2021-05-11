package book.home_102;

import java.io.IOException;

public class StringInput {
	
	public static int readInt() {
		int temp = Integer.parseInt(readString());
		return temp;
	}
	
	public static String readString() {
		byte[] b = new byte[40];
		int len=0;
		try {
			len= System.in.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = new String(b, 0, len-2); //	'\n'�� '\r'�� �پ� �־ 2�� ���� 
		return str;
	}

}
