package book.home_067;

public class PerpectionNumber {

	public static void main(String[] args) {
		//완전수 구하기
		// 자신을 제외한 약수의 합이 자신과 같은수 찾기
		
		
		
		PerpectionNumber per = new PerpectionNumber();
		per.printPer(28);
		per.countPer(1000);
		
	}
	
	public boolean perpectNum(int n) {
		boolean perpect = false;
		int sum = 0;
		for(int i =1 ; i<n ;i++) {
			if(n%i == 0) {
				sum +=i;
			}
		}
		if(sum == n) {
			perpect = true;
		}
		return perpect;
	}
	
	public void printPer(int n) {
		if(perpectNum(n)) {
			System.out.println(n+"은 완전수 이다.");
		}
	}
	public void countPer(int n) {
		int count = 0;
		for(int i=1;i<n;i++) {
			if(perpectNum(i)) {
				System.out.print("["+i+"]");
				count++;
			}
		}
		System.out.println(" 0~"+n+"까지 "+count+"개");
	}
}
