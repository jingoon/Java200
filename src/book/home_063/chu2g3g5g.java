package book.home_063;

public class chu2g3g5g {
	//2g,3g,5g �� �� 10���� �߸� �����Ͽ� ���ϴ� ���� �����
	public static void main(String[] args) {
		
		chu2g3g5g c = new chu2g3g5g();
		c.chu(5, 3, 2, 81);
		
		System.out.println("===========");
		// �� ���� ����
		int i = 7; 
		int j = 6;
		int k = 3;
		// ���ϴ� ���� ����
		int n = 150;
		c.chu(i, j, k, n);
		System.out.println("============");
		// �� ���� ������ ���� �Է�
		c.chu(10, 5, 9, 10, 4, 15, 164);// 10g(5��),9g(10��),4g(15��)�� 164g �����
		
		
	}
	
	public void chu(int chu1,int chu2,int chu3, int weight) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				for (int k = 0; k < 11; k++) {
					if(chu1*i + chu2*j + chu3*k == weight) {
						System.out.print(chu1+"g: "+i+"�� - ");
						System.out.print(chu2+"g: "+j+"�� - ");
						System.out.println(chu3+"g: "+k+"�� ");
					}
					
				}
			}
		}
	}
	//�����ε�
	public void chu(int chu1,int chu1Max, int chu2, int chu2Max, int chu3, int chu3Max, int weight) {
		for (int i = 0; i < chu1Max; i++) {
			for (int j = 0; j < chu2Max; j++) {
				for (int k = 0; k < chu3Max; k++) {
					if(chu1*i + chu2*j + chu3*k == weight) {
						System.out.print(chu1+"g: "+i+"�� - ");
						System.out.print(chu2+"g: "+j+"�� - ");
						System.out.println(chu3+"g: "+k+"�� ");
					}
					
				}
			}
		}
	}
}
