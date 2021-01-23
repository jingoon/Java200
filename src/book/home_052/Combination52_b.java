package book.home_052;

public class Combination52_b {
	
	public static void main(String[] args) {
		int count = 0;
		for(int i =1; i<6;i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					count++;
				//	System.out.println(i+" "+j+" "+k);
				}
			}
		}
		
		System.out.println("1. 5C3="+count);
		
		int combiCount = getCombiCount(5);
		System.out.println("2. 5C3=" +combiCount);
		
		printCombi(6);
	}

	private static void printCombi(int m) {
		for (int i = 1; i <= m ; i++) {
			for (int j = 1; j <= m ; j++) {
				for (int k = 1; k <=m ; k++) {
					if((i<j) && (j<k) && (i<k)) {
						System.out.printf("[%d,%d,%d]%n",i,j,k);
					}
				}
			}
		}
		System.out.println("3. "+m+"C3= "+ getCombiCount(m));
	}

	private static int getCombiCount(int m) {
		int count = 0;
		for (int i = 1; i <= m ; i++) {
			for (int j = 1; j <= m ; j++) {
				for (int k = 1; k <=m ; k++) {
					if((i<j) && (j<k) && (i<k)) {
						count++;
					}
				}
			}
		}
		return count;
	}
	
	

}
