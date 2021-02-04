package book.home_074;

public class ArrayInit {

	public static void main(String[] args) {
		// 기본 타입의 배열 사용 방법 
		// 1 선언
		int [] a=null;	//선언
		a=new int[5];	//정의
		a[0]=2;			//초기화	
		a[1]=5;
		a[2]=3;
		a[3]=9;
		a[4]=8;
		
		int[] aa = new int [5];
		
		// 2 선언 정의 초기화
		int[] b= new int[] {2,5,3,9,8};
		
		// 3 선언 정의 초기화
		int[] c= {2,5,3,9,8};
		int cc[]= {2,5,6,2,3};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}	
		System.out.println();
		
		int[]d =a;
		a[4]=55;// 값의 변경
		for (int val : d) {
			System.out.print(val+" ");
		} 
		System.out.println();
		
		int []e=new int[5];
		System.arraycopy(d, 0, e, 0, d.length);	//value assignment 0은 숫자
		d[4]=100;	//d의 값을 변동시키면 e의 값이 변할까
		for (int val : e) {
			System.out.print(val+ " ");
		}
		System.out.println();
		reString();
		
	}
	
	public static void reString() {
		String a="가나다라마바사4eawdadasd23w아자ew차a카타esdfaffbqv23b453qbv6aesdaqwd파하";
		String b="";
	
		for (int i =0; i < a.length(); i++) {
			b += a.charAt(a.length()-1-i);
		}
		System.out.println(b);
		
	}
}
