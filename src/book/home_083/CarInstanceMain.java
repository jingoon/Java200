package book.home_083;

import java.lang.reflect.*;

import book.home_080.Car;

public class CarInstanceMain {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car1);	// car1.toString()
		System.out.println(Integer.toHexString(car1.hashCode()));
		//java.lang.reflect.* --> Reflect class에 대한 정보
		
		Class ca = car1.getClass();
		Field[] fie = ca.getDeclaredFields();
		for (int i = 0; i < fie.length; i++) {
			System.out.println(fie[i].getName());
		}
		
		Method [] me= ca.getDeclaredMethods();// static 메서드 포함
		for (int j = 0; j < me.length; j++) {
			System.out.print(me[j].getName()+" ");
			System.out.print(Modifier.isStatic(me[j].getModifiers())+" ");
			System.out.println(Modifier.isPublic(me[j].getModifiers()));
		}

		Constructor [] con = ca.getDeclaredConstructors();
		for (int i = 0; i < con.length; i++) {
			System.out.println(con[i].getName());
		}
		
		
	}

}
