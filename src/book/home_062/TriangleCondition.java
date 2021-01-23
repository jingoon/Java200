package book.home_062;

public class TriangleCondition {
	public static void main(String[] args) {
		// �ﰢ���� ������ �Ѻ��� ���̰� ���Ӵ� �� ���� ������ �պ��� �۾ƾ� �Ѵ�
		// Encoding change utf-8
		
		for(int a=1; a<5;a++) {
			for(int b=1; b<5;b++) {
				for(int c=1; c<5;c++) {
					if(a+b>c && b+c>a && c+a>b) {
						System.out.printf(" a=%d,b=%d,c=%d\n",a,b,c);
					}
				}
			}
		}
		System.out.println();
		System.out.println("================================");
		
		printTriCons(5);
		printTriConUp(5);
	}
	private static void printTriConUp(int i) {
		int co=0;
		for(int a=1; a<i;a++) {
			for(int b=1; b<i;b++) {
				for(int c=1; c<i;c++) {
					if(isABCTri(a,b,c) && isABCTri(b,c,a) && isABCTri(c,a,b)) {
						if(isABCTriUp(a*a,b*b,c*c) || isABCTriUp(b*b,c*c,a*a) || isABCTriUp(c*c,a*a,b*b)) {
							System.out.printf("�а��ﰢ���� ���� a=%d,b=%d,c=%d\n", a,b,c);
							co++;
						}
					}
				}
			}
		}
		System.out.println(co+"��");
	}
	private static void printTriCons(int i) {
		int co=0;
		for(int a=1; a<i;a++) {
			for(int b=1; b<i;b++) {
				for(int c=1; c<i;c++) {
					if(a+b>c && b+c>a && c+a>b) {
						System.out.printf("�ﰢ���� ���� a=%d,b=%d,c=%d\n",+a,b,c);
						co++;
					}
				}
			}
		}
		System.out.println(co+"��");
	}
	public static boolean isABCTri(int a, int b, int c) {
		boolean isL = false;
		if(a+b>c) {
			isL=true;
		}
		return isL;
	}
	public static boolean isABCTriUp(int a, int b, int c) {
		boolean isL = false;
		if(a+b<c) {
			isL=true;
		}
		return isL;
	}
	

}
