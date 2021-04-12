package book.home_097;

public class StringBuilderMain {
	
	public static void main(String[] args) {
		// synchronized ภฮวั StringBuffer
		StringBuilder sbu = new StringBuilder();
		sbu.append("I")
		.append(" go")
		.append(" to the shcool.");
		System.out.println(sbu);
		
		sbu.replace(7, 11, "");
		System.out.println(sbu);
		
		sbu.reverse();
		System.out.println(sbu);
		
		sbu.deleteCharAt(3);
		System.out.println(sbu);
		
		sbu.delete(1, 3);
		System.out.println(sbu);
		
		String sbu1 = sbu.substring(0);
		System.out.println(sbu);
		System.out.println(sbu1);
		
		String sbu2 = sbu.substring(0, 8);
		System.out.println(sbu);
		System.out.println(sbu2);
		
	}

}
