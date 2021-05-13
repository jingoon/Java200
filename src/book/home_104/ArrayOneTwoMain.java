package book.home_104;

public class ArrayOneTwoMain {
	public static void main(String[] args) {
		int[] arrays1 = {1,2,3,4,5,6,7,8,9,10,11,12};	//12
		ArrayOneTwo aot = new ArrayOneTwo();
		aot.setArray(arrays1);
		int[][] arrays2 = aot.oneToTwo(3, 4);	// 3x4
		ArrayPrint.print(arrays1);
		System.out.println();
		ArrayPrint.print(arrays2);
		
	}
}
