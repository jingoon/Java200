package book.home_068;

public class Amicable {
	// ģȭ��
	// �ڽ��� ������ ����� ���� ���θ� ����Ű�� �� ��
	// a�� ����� ��-a = b �϶� b�� ����� ��-b = a�̸� �� ���� ������ ģȭ��
	public static void main(String[] args) {
		//1. ����� ���� ���ϴ� �޼���
		//2. ģȭ���� Ȯ���ϴ� �޼���
		//3. ��ø �ݺ������� ������ ���� ����
		//4. ���� ���� �� ����
		
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
		str += "= ����:"+sum;
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
