package book.home_037;

public class DoWhileBreakChapt37 {
	
	public static void main(String[] args) {
		int i = 0;
		do {
			i++;
			if(i%2==0) {
				System.out.println("¦��: "+i);
			}else {
				System.out.println("Ȧ��: "+i);
			}
			if(i==10) break;
		}while(true);
		
	}

}
