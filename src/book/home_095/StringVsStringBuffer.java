package book.home_095;

public class StringVsStringBuffer {
	
	public static void main(String[] args) {
		String str = new String();
		StringBuffer sb = new StringBuffer();
		
		System.out.println(str.hashCode());//0
		str.concat("I").concat(" go").concat("to shcool.");
		System.out.println(str.hashCode());//0
		str = str.concat("I").concat(" go").concat("to shcool.");
		System.out.println(str.hashCode());//1374105994
		
		System.out.println(sb.hashCode());//523429237
		sb.append("I");
		sb.append(" go");
		sb.append("to shcool.");
		System.out.println(str.toString());
		System.out.println(sb.hashCode());//523429237
		
		replaces(str);
		reverse(sb);
		System.out.println(str);//I goto shcool. 
		System.out.println(sb.toString());//.loochs otog I
		
		
	}
	
	public static void reverse(StringBuffer sb) {
		sb.reverse();
	}
	
	public static void replaces(String str) {
		str.concat("GoGo");
	}

}
