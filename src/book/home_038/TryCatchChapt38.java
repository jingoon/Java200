package book.home_038;

public class TryCatchChapt38 {
	
	public static void main(String[] args) {
		String sNum ="123";
		String nNum ="h";
		
		try {
			int a=Integer.parseInt(nNum);
			System.out.println(a);
		} catch (NumberFormatException e) {
			System.out.println("int���� Ȯ���� ��!!!!");
			System.err.println(e);
			e.printStackTrace();
			System.err.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("�� �� �� �־�");
			System.err.println(e.getMessage());
			System.err.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("�� ����Ǿ�߸� ��!!!!");
		}
 	}

}
