package book.home_102;

import java.io.IOException;

public class SystemInputTest1 {
	public static void main(String[] args) {
		char cin='/';
		try {
			cin=(char) System.in.read();	// read -> return int
			System.out.println(cin);		
			System.out.println((int)cin);	// A65, a97
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
