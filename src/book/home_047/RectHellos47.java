package book.home_047;

public class RectHellos47 {
	private static char w1 = '─';//9472
	private static char w2 = '│';//9474
	private static char w3 = '┌';//9484
	private static char w4 = '┐';//9488
	private static char w5 = '┘';//9496
	private static char w6 = '└';//9492
	
	public static void main(String[] args) {
		
		printRectString("Hello ", true);
		printRectString("Go java ", true);
		printRectString("서울", false);
		printRectString("반갑습니다", false);
		System.out.println();
		
		System.out.println("w1: "+w1+" : "+Integer.valueOf(w1));
		System.out.println("w2: "+w2+" : "+Integer.valueOf(w2));
		System.out.println("w3: "+w3+" : "+Integer.valueOf(w3));
		System.out.println("w4: "+w4+" : "+Integer.valueOf(w4));
		System.out.println("w5: "+w5+" : "+Integer.valueOf(w5));
		System.out.println("w6: "+w6+" : "+Integer.valueOf(w6));
		
		
	}

	public static void printRectString(String str, boolean isE) {
		int count = str.length();
		System.out.println(count);
		int width = count;
		if(!isE) {
			width=count*2;
		}else {
			width=(count);
		}
			
		System.out.print(w3);
		for (int i = 0; i < width; i++) {
			System.out.print(w1);
		}
		System.out.println(w4);
		System.out.print(w2);
		if(!isE) {
			System.out.print(" "+str+" ");
		}else {
			System.out.print(str);
		}
		System.out.println(w2);
		System.out.print(w6);
		for (int i = 0; i < width; i++) {
			System.out.print(w1);
		}
		System.out.println(w5);
	}

}
