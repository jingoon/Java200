package book.home_040;

public class TypeConversion1Chapt40 {
	public static void main(String[] args) {
		
		// parse***(), valueOf(), concat()
		// ���ڷ� ��ȯ, Ÿ�Ժ�ȯ, ���ڿ� ���̱�
		
		String strNum1 = "12345";
		int tempNum1=2345;
		
		//String ->int, double
		int intNum1=Integer.parseInt(strNum1);
		int intN=Integer.valueOf(strNum1);
		
		double douNum1=Double.parseDouble(strNum1);
		double douN = Double.valueOf(strNum1);
				
		//String <-->char
		String h = "hello";
		char[] charStr=h.toCharArray();
		String strChar=new String(charStr);
		char[] charStr2 = strChar.toCharArray();
		char charChar = strChar.charAt(4);
		String sv = String.valueOf(charStr2);
		System.out.println(sv);
		
		//String Concatenation
		String s = "Get";
		s+=" java ";
		s+="this time";
		System.out.println(s);
		
		String st="";
		st.concat("java ").concat("this time.");
		System.out.println("??=>"+st);
		st = st.concat("java ").concat("this time.");
		System.out.println("??<="+st);

		//byte <-->String
		String stss="�ȳ��ϼ���";
		byte[] byteStr = stss.getBytes();
		System.out.print(" �Ϲ� fot��: ");
		for (int i=0; i<byteStr.length;i++) {
			System.out.print(byteStr[i]+" ");
		}
		System.out.println();
		
		System.out.print("���� for��: ");
		for(int i : stss.getBytes()) {
			System.out.print(i+ " ");
		}
		System.out.println();
		String strByte = new String(byteStr);
		System.out.println(strByte);
			
	}

}
