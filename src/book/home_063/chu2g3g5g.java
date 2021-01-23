package book.home_063;

public class chu2g3g5g {
	//2g,3g,5g 의 각 10개의 추를 조합하여 원하는 무게 만들기
	public static void main(String[] args) {
		
		chu2g3g5g c = new chu2g3g5g();
		c.chu(5, 3, 2, 81);
		
		System.out.println("===========");
		// 추 무게 설정
		int i = 7; 
		int j = 6;
		int k = 3;
		// 원하는 무게 설정
		int n = 150;
		c.chu(i, j, k, n);
		System.out.println("============");
		// 각 추의 갯수도 따로 입력
		c.chu(10, 5, 9, 10, 4, 15, 164);// 10g(5개),9g(10개),4g(15개)로 164g 만들기
		
		
	}
	
	public void chu(int chu1,int chu2,int chu3, int weight) {
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				for (int k = 0; k < 11; k++) {
					if(chu1*i + chu2*j + chu3*k == weight) {
						System.out.print(chu1+"g: "+i+"개 - ");
						System.out.print(chu2+"g: "+j+"개 - ");
						System.out.println(chu3+"g: "+k+"개 ");
					}
					
				}
			}
		}
	}
	//오버로드
	public void chu(int chu1,int chu1Max, int chu2, int chu2Max, int chu3, int chu3Max, int weight) {
		for (int i = 0; i < chu1Max; i++) {
			for (int j = 0; j < chu2Max; j++) {
				for (int k = 0; k < chu3Max; k++) {
					if(chu1*i + chu2*j + chu3*k == weight) {
						System.out.print(chu1+"g: "+i+"개 - ");
						System.out.print(chu2+"g: "+j+"개 - ");
						System.out.println(chu3+"g: "+k+"개 ");
					}
					
				}
			}
		}
	}
}
