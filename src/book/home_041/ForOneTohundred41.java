package book.home_041;

public class ForOneTohundred41 {

	public static void main(String[] args) {
		int toNum=100;
		
		try {
			toNum=ScannerInput.readInt();
		} catch (Exception e) {
			System.out.println("예외: 타입확인 요망");
			System.exit(1);
			return;
		}
		
		int summs=0;
		for(int i=1; i<=toNum;i++) {
			summs+=i;
		}
		System.out.println("1 to "+toNum+" summation= "+summs);
		
		int sum = summation(1,toNum);
	}
	
	public static int summation(int start, int end) {
		if(start>end) {
			return-1;
		}
		int sum=0;
		for (int i = 0; i <=end; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int summation(int end) {
		return summation(1,end);
				
	}
}
