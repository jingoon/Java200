package book.home_067;

public class PerpectionNumber {

	public static void main(String[] args) {
		//������ ���ϱ�
		// �ڽ��� ������ ����� ���� �ڽŰ� ������ ã��
		
		
		
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
			System.out.println(n+"�� ������ �̴�.");
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
		System.out.println(" 0~"+n+"���� "+count+"��");
	}
}
