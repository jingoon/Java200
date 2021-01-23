package book.home_032;

public class ifTest1Chart32 {
	
	//점수에 따라 등급 매기기(중첩 if문)
	//90점 이상이면 A, 80~89점이면 B를 주는 식으로 성적을 매겨보자
	public static void main(String[] args) {
		
		// myself
		int score = 78;
		System.out.println("점수:"+score+"의 성적은 "+mySelf(score));
		
		//study book
		int valuA=90;
		int valuB=80;
		int valuC=70;
		int valuD=60;
		
		int a=78;
		if(a>=valuA) {
			System.out.println("A");
		}else if(a>=valuB) {
			System.out.println("B");
		}else if(a>=valuC) {
			System.out.println("C");
		}else if(a>=valuD) {
			System.out.println("D");
		}else  {
			System.out.println("F");
		}
		
		
		int b=78;
		if(b>=valuA) {
			System.out.println("A");
		}else {
			if(b>=valuB) {
				System.out.println("B");
			}else {
				if(b>=valuC) {
					System.out.println("C");
				}else {
					if(b>=valuD) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		
		}
		
		
		
	}
	public static String mySelf(int a) {
		if(a>100 || a<0) {
			return "성적범위 벗어남";
		}else if(a>=90) {
			return "A";
		}else if(a>=80) {
			return "B";
		}else if(a>=70) {
			return "C";
		}else if(a>=60) {
			return "D";
		}else if(a>=50) {
			return "E";
		}else {
			return "F";
		}
	}
	

}
