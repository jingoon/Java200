package book.home_094;

public class StringBufferMain {
	public static void main(String[] args) {
		
		//StringBuffer ����
		StringBuffer sb1 = new StringBuffer();
		
		// 1 ��� ���̴� �Լ� mutable
		sb1.append("�ȳ��ϼ���")
		.append("�� ������.")
		.append("��θ� ����ؿ�. ��ٷ���.");
		System.out.println(sb1.toString()+sb1.hashCode());//�ȳ��ϼ���� ������.��θ� ����ؿ�. ��ٷ���.523429237
		
		// 2 replace
		sb1.replace(0, 2, "�� ���Ⱑ ���ܿ�");
		System.out.println(sb1.toString()+sb1.hashCode());//�� ���Ⱑ ���ܿ��ϼ���� ������.��θ� ����ؿ�. ��ٷ���.523429237
		
		// 3 reverse
		sb1.reverse();
		System.out.println(sb1.toString()+sb1.hashCode());//.�����ٱ� .���ض��� ���θ�.�䳪�� �ǿ似�Ͽ��ܿ� ���⺸ ��523429237
		
		// 4 delete
		sb1.delete(10,15);
		System.out.println(sb1.toString());//.�����ٱ� .���ض�.�䳪�� �ǿ似�Ͽ��ܿ� ���⺸ ��
		
		// 5 cal by reference, shallow copy
		replaces(sb1);
		System.out.println(sb1.toString());//GoGo�Ⱑ ���ܿ��ϼ���� ������.���ؿ�. ��ٷ���.
		
	}
	
	public static void replaces(StringBuffer sb) {
		sb.reverse();
		sb.replace(0, 3, "GoGo");
		
	}

}
