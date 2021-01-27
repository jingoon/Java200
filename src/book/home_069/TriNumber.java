package book.home_069;

public class TriNumber {
	public static void main(String[] args) {
		// 등차수열과 삼각수
		printTriNumber(10);
		printTriTower(10);
		printRectTower(10);
		
	}
	
	public static void printTriNumber(int stage) {
		for (int i = 0; i <= stage; i++) {
			int sum=0;
			for (int j = 0; j <= i; j++) {
				sum += j;
			}
			System.out.print("["+sum+"]");
		}
		System.out.println();
	}
	
	public static void printTriTower(int stage) {
		for (int i = 0; i <= stage; i++) {
			int j = 1;
			System.out.print("[");
			for ( ; j <i; j++) {
				System.out.print(j+"+ ");
			}
			System.out.println(j+"]");
		}
	}
	
	public static void printRectTower(int stage) {
		for (int i = 0; i <= stage; i++) {
			int j=1;
			System.out.print("[");
			for ( ; j <i; j++) {
				System.out.print((2*j-1)+"+ ");
			}
			System.out.println((2*j-1)+"]");
		}
	}

}
