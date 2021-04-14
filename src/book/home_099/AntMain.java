package book.home_099;

import book.home_098.Ant;
import book.home_098.WaterAnt;

public class AntMain {
	
	public static void main(String[] args) {
		
		Ant ant = new Ant(); // name = Ant
		ant.print();
		System.out.println(ant.toString());
		
		WaterAnt want = new WaterAnt();
		//Ant want2 = new WaterAnt();	다형성 : 부모객체 타입으로 자식객체 생성
		want.print();	//오버라이드 : 부모 메서드 재정의 사용
		want.show();
		System.out.println(want.toString());// 부모(Ant) 메서드 사용
		
		WoodAnt dant = new WoodAnt();
		dant.print();	//@Override
		dant.hate();
		System.out.println(dant.toString()); // 부모메서드 사용
		
		
		
	}

}
