package book.home_088;

public class WarMain {

	public static void main(String[] args) {
		Platoon platoon = new Platoon("Cobra");
		
		Squad firstSquad = new Squad();
		firstSquad.setPlatoonName(platoon.getPlatoonName());
		
		Squad secondSquad = new Squad("Stinger");
		secondSquad.setPlatoonName(platoon.getPlatoonName());
		
		Squad thirdSquad = new Squad(platoon);
		thirdSquad.setPlatoonName("Abangardo");
		
		Squad fourthSquad = new Squad(platoon, "Tiger");
		
		platoon.showPlatoonName();
		firstSquad.showSquad();
		secondSquad.showSquad();
		thirdSquad.showSquad();
		fourthSquad.showSquad();
		
		
	}
}
