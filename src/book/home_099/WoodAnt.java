package book.home_099;

import book.home_098.Ant;

public class WoodAnt extends Ant{

	private String where ="wood";
	
	public void hate() {
		System.out.println(where+"새");
	}

	@Override
	public void print() {
		System.out.println(getName()+"은 "+where+"에 산다.");
	}
	
	
}
