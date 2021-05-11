package book.home_102;

import java.io.IOException;

public class SystemInputTest2 {
	public static void main(String[] args) {
		char cin='0';
		try {
			while (cin!='/') {
				do {
					cin = (char) System.in.read();	// read -> return int
				} while (cin=='\n'| cin=='\r');
			}
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
