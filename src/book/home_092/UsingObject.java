package book.home_092;

import java.lang.reflect.Constructor;

public class UsingObject {
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1.hashCode()); 	//native : c/c++로 만들어졌다.
		System.out.println(obj1==obj2); 		//객체는 고유하다
		System.out.println(obj1.equals(obj2)); 	//객체는 고유하다
		System.out.println(obj1);
		System.out.println(obj2.toString());
		
		System.out.println(obj1.getClass().getName());
		String str = obj1.getClass().getName()+ "@"+Integer.toHexString(obj1.hashCode());
		System.out.println(str);
		
		Object objstr = new String("Good");		// 다형성
		System.out.println(objstr.toString());
		System.out.println(objstr instanceof Object);
		System.out.println(objstr instanceof String);
		
		Class classes = obj1.getClass();
		System.out.println(classes.getName());
		
		System.out.println("-------constructor---------");
		Constructor [] cons = classes.getDeclaredConstructors();
		for(Constructor con : cons) {
			System.out.println(con.getName());
		}
		
	}
	
	

}
