package book.home_093;

public class StringMethodMain1 {

	public static void main(String[] args) {
		// 1 String immutable
		
		String st = "hello";
		System.out.println(st+st.hashCode());
		st.replace('h', 'H');
		System.out.println(st+st.hashCode());
		st= st.replace('h', 'H');
		System.out.println(st+st.hashCode());
		
		//2 String의 위치 메서드 인덱스는 0부터
		String test1 = "Hello my nick name is dr.park.\n"
						+ "i,m 29 years old. \n";
				test1 +=  "i'm a good boy.";
		System.out.println("이글의 길이: " +test1.length());
		System.out.println("첫 .위치: "+test1.indexOf('.'));
		System.out.println("마지막 .위치: "+test1.lastIndexOf('.'));
		System.out.println("첫 years의 위치: "+test1.indexOf("years"));
		
		//3 위치에 있는 한글자씩 호출
		for(int i=0; i<test1.length(); i++) {
			System.out.println(test1.charAt(i));
		}
		
		//4 원하는 문자열 배열
		String [] a = test1.split("\n");
		System.out.println(a.length);
		System.out.println(a[0]);
		
		//5 문자열 나누기 index는 0부터 시작한다
		String b= test1.substring(4,8);
		String c = test1.substring(0,5);
		String bb = test1.substring(4);
		System.out.println(b);	// 4 ~ 8-1 
		System.out.println(c);	// 0 ~ 5-1
		System.out.println(bb); // 0 ~ 4-1
		
		//6 대소문자로
		b= "Hello, I love you.";
		String d = b.toUpperCase();
		System.out.println(d);
		String e = b.toLowerCase();
		System.out.println(e);
		
		//7 양쪽 공백제거
		System.out.println("           안녕하세    요      ".trim());
		
		// 8 String <----> int
		int intStr = Integer.parseInt("37");
		String strInt = String.valueOf(intStr);
		String sI = ""+intStr;
		
		// 9 대소문자 상관없이 비교
		System.out.println("Good".equalsIgnoreCase("good"));
		System.out.println("Good".equalsIgnoreCase("Good"));
		System.out.println("Hello".compareToIgnoreCase("hello"));
		System.out.println("Hello".compareToIgnoreCase("Hello"));

		// 10 +와 같은 concatenation
		System.out.println(strInt+"hello");
		strInt =strInt.concat("hello");
		System.out.println(strInt);
		
		//11 문자열 <---> char 배열
		char[] chs = b.toCharArray();
		String copy1 = String.copyValueOf(chs);
		String copy2 = new String(chs);
		for(char ch : chs) System.out.print(ch);
		System.out.println();
		
		//12 String format
		String ss = String.format("%s %d %c %f","hello",78,'c',8.6);
		System.out.println(ss);
		
		//13 문자를 포함하는가?
		System.out.println("Hello".contains("el"));
		System.out.println("hello".indexOf("el")>0? true:false);
		
	}
}
