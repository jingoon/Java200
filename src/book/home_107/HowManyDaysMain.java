package book.home_107;

public class HowManyDaysMain {
	
	public static void main(String[] args) {
		HowManyDays how = new HowManyDays();
		System.out.println(how.howManyDays());
		how.setFrom(HowManyDays.makeDay(1999, 7, 1));
		how.setTo(HowManyDays.makeDay(2021, 7, 1));
		System.out.println(how.howManyDays());	// ¿œ
		System.out.println(how.howManyDays()*24);// Ω√
		System.out.println(how.howManyDays()*24*60);// ∫–
		
		
		System.out.println(how.howManyDays()/365);
	}

}
