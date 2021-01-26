package book.home_068;

public class Amicable {
	// 친화수
	// 자신을 제외한 약수의 합이 서로를 가르키는 두 수
	// a의 약수의 합-a = b 일때 b의 약수의 합-b = a이면 두 수는 서로의 친화수
	public static void main(String[] args) {
		//1. 약수의 합을 구하는 메서드
		//2. 친화수를 확인하는 메서드
		//3. 중첩 반복문으로 범위의 수를 적용
		//4. 서로 같은 수 제외
		
		Amicable am = new Amicable();
		am.amicable(100,5000);
		
	}
	//3.
	public void amicable(int n, int m) {
		for (int i = n; i < m; i++) {
			if(amicableOk(i)) {
				System.out.println(i+","+sumDivisor(i));
				printDivisor(i);
				printDivisor(sumDivisor(i));
			}
			
		}
	}
	//2.
	public boolean amicableOk(int n) {
		boolean a = false;
		int m = sumDivisor(n);
		if(sumDivisor(n)==m && n!=m) {//4
			if(sumDivisor(m)==n) {
				a= true;
			}
		}
		return a;
	}
	//1.print
	public void printDivisor(int n) {
		String str ="";
		int sum =0;
		for (int i = 1; i < n; i++) {
			if(n%i == 0) {
				str += i +" ";
				sum +=i;
			}
		}
		str += "= 합은:"+sum;
		System.out.println(str);
	}
	//1.
	public int sumDivisor(int n) {
		int sum =0;
		for (int i = 1; i < n; i++) {
			if(n%i == 0) {
				sum +=i;
			}
		}
		return sum;
	}

}
