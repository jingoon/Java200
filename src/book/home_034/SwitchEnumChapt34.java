package book.home_034;

public class SwitchEnumChapt34 {

	public static void main(String[] args) {
		Season thisSeason =Season.SPRING;
		
		switch(thisSeason) { //case���� Season.SPRING�ϸ� ����
			case SPRING: System.out.println("Spring");break;
			case SUMMER: System.out.println("Spring");break;
			case AUTUMN: System.out.println("Spring");break;
			case WINTER: System.out.println("Spring");break;
		}
		
		//Season �ȿ� �ִ� ��� ��
		Season[] thisSeasons=Season.values();
		for (int i = 0; i < thisSeasons.length; i++) {
			System.out.println(i+" "+thisSeasons[i]);
		}
		//String�� enum����
		Season thisSeason1=Season.valueOf("AUTUMN");
		System.out.println(thisSeason1);
	}
}
