package book.home_039;

public class ArgsInputChapt39 {
	
	public static void main (String args[]) {
		
		String ar[] = {"hello", "wolrd", "good"};
		System.out.println(ar);
		args=ar;
		
		if(args.length<=0) {
			System.out.println("�ƱԸ�Ʈ�� ����.");
		}else if(args.length==1) {
			System.out.println("�ƱԸ�Ʈ�� 1��: "+args[0]);
		}else if(args.length==2) {
			System.out.println("�ƱԸ�Ʈ�� 2��: "+args[0] +", "+ args[1]);
		}else {
			for(String i : args) {
				System.out.println(i);
			}
		}
	}
	

}
