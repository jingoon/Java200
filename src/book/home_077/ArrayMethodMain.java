package book.home_077;

public class ArrayMethodMain {

	public static void main(String[] args) {
		int a=5;
		int b=6;
		ArrayMethod am = new ArrayMethod();
		am.copyVInt(a, b); //immutable
		System.out.println(a);
		System.out.println(b);
		
		am.multi(a); 	//immutable
		System.out.println(a);
		
		int aa[]= {5,4,7,1,9,12,0,3,2,6};
		int []bb= new int[aa.length];
		int []cc=aa;
		int dd[]=new int[cc.length];
		System.out.println("--------------");
		am.copyR(aa, bb);//�ȹٲ�	
		am.print(bb);
		am.copyRChange(aa, bb);//����� �ȵ� ���� �ٲ�
		am.print(bb);
		am.print(aa);
		
		am.bbsort(aa);//���� �ٲ�
		am.print(aa);
		
		am.copyV(cc, dd);//�ٱ�
		am.print(dd);
	}
}
