package book.home_099;

import book.home_098.Ant;
import book.home_098.WaterAnt;

public class AntMain {
	
	public static void main(String[] args) {
		
		Ant ant = new Ant(); // name = Ant
		ant.print();
		System.out.println(ant.toString());
		
		WaterAnt want = new WaterAnt();
		//Ant want2 = new WaterAnt();	������ : �θ�ü Ÿ������ �ڽİ�ü ����
		want.print();	//�������̵� : �θ� �޼��� ������ ���
		want.show();
		System.out.println(want.toString());// �θ�(Ant) �޼��� ���
		
		WoodAnt dant = new WoodAnt();
		dant.print();	//@Override
		dant.hate();
		System.out.println(dant.toString()); // �θ�޼��� ���
		
		
		
	}

}
