package book.home_037;

public class WhileBreakChapt37 {
	
	public static void main(String[] args) {
		// 1~10±îÁö È¦¼ö¿Í Â¦¼ö¸¦ ±¸ºÐ
		int i=0;
		
		while(true) {
			i++;
			if(i%2==0) {
				System.out.println("Â¦¼ö: "+i);
			}else {
				System.out.println("È¦¼ö: "+i);
			}
			if(i==10) {
				break;
			}

		}
	}

}
