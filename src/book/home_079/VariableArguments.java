package book.home_079;

public class VariableArguments {

	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.print(3,4,5,6);
		
		int[]aa= {5,4,7,1,9,12,0,3,2,6};
		va.print(aa);
		
		int a=4;
		va.print(a,a,a,8888);
		
		String[] sNames= {"��ö","����ȭ","������","ö��"};
		va.print(sNames);
		va.print("����");
		
		Flower flo = Flower.LILY;
		va.print(flo);
		va.print(Flower.values());
		
		String s = "Welcome to the java";
		//String [] ss= s.split(" ");
		va.print(s.split(" "));
		
	}
	
	public void print(int ...p) {
		for(int en:p) {
			System.out.printf("[%d]",en);
		}
		System.out.println();
	}
	public void print(String ...p) {
		for(String en:p) {
			System.out.printf("[%s]",en);
		}
		System.out.println();
	}
	public void print(Flower ...p) {
		for(Flower en:p) {
			System.out.printf("[%s]",en);//en.toString()-> en.name()
		}
		System.out.println();
	}
}
