package book.home_034;

public class SwitchEnumChapt34 {

	public static void main(String[] args) {
		Season thisSeason =Season.SPRING;
		
		switch(thisSeason) { //case에서 Season.SPRING하면 에러
			case SPRING: System.out.println("Spring");break;
			case SUMMER: System.out.println("Spring");break;
			case AUTUMN: System.out.println("Spring");break;
			case WINTER: System.out.println("Spring");break;
		}
		
		//Season 안에 있는 모든 것
		Season[] thisSeasons=Season.values();
		for (int i = 0; i < thisSeasons.length; i++) {
			System.out.println(i+" "+thisSeasons[i]);
		}
		//String을 enum으로
		Season thisSeason1=Season.valueOf("AUTUMN");
		System.out.println(thisSeason1);
	}
}
