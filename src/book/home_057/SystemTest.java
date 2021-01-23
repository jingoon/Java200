package book.home_057;

import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

public class SystemTest {
	public static void main(String[] args) {
		long ltime = System.currentTimeMillis();
		System.out.println(ltime);
		for (int i = 0; i < 100000; i++) {
			System.out.print("");
		}
		
		long ltime2  = System.currentTimeMillis();
		System.out.println(ltime2-ltime);
		System.out.println(ltime2/1000/60/60/24/365+"≥‚");//2021≥‚ - 1970≥‚
		java.util.Properties pro = System.getProperties();
		
		System.out.println(pro.getProperty("java.vm.version"));
		System.out.println(pro.getProperty("file.separator"));
		
		System.out.println(new Date(System.currentTimeMillis()));
		
		Enumeration<Object> en = pro.keys();
		int i =0;
		while(en.hasMoreElements()) { // ø§∏Æ∏‡∆Æ∞° ¿÷¥Ÿ∏È
			String keys =(String) en.nextElement(); // ¥Ÿ¿Ωø§∏Æ∏‡∆Æ∏¶ ¥Î¿‘
			System.out.println((++i+" - ")+keys+" : "+pro.getProperty(keys));
		}
		System.out.println("====================================");
		systemT();
	}
	
	private static void systemT() {
		long nanotime = System.nanoTime();
		System.out.println(nanotime);
		System.out.println(nanotime/1000/60/60/24/365+"1000πË");
		System.out.println(System.getenv("JAVA_HOME"));
		Map<String, String>  map = System.getenv();
		Iterator<String> iter = map.keySet().iterator();
		int j=1;
		while(iter.hasNext()) {
			String keys =(String) iter.next();
			System.out.println(((j++)+" - ")+keys+ "=="+map.get(keys));
		}
	}

}
