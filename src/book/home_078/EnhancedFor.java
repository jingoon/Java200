package book.home_078;

import java.util.ArrayList;
import java.util.List;

import book.home_034.Season;

public class EnhancedFor { //advanced for

	public static void main(String[] args) {
		
		int[]aa = {5,4,7,1,9,12,0,3,2,6};
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
		}
		System.out.println();
		
		for(int i: aa) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		String[] sNames = {"¼ÒÃ¶", "¹«±ÃÈ­", "°³³ª¸®", "Ã¶Âß"};
		for(String name : sNames) {
			System.out.print(name+" ");
		}
		System.out.println();
	
		int[][]bb= {{3,4,5},{7,8,9},{1,2,3} };
		for(int[] outs : bb) {
			for(int ins : outs) {
				System.out.print(ins+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		List<String> list = new ArrayList<String>();
		for(String name : sNames) {
			list.add(name);
		}
		for(String kkk : list) {
			System.out.print(kkk+" ");
		}
		System.out.println();
		
		for(Season se: Season.values()) {
			System.out.println(se);
		}
		
		
				
	}
	
}
