package book.home_081;

public class Account {
	
	private double money=500;	//명시적 초기화
	
	public Account(double money) {	//생성자에 의한 초기화
		this.money=money;
	}
	
	public Account() {		//default 생성자에 의한 초기화
		// TODO Auto-generated constructor stub
	}
	
	public double getMoney() {
		return money;
	}
	
	public void withdraw(double amount) {
		if(amount>0 && money>=amount) {
			money-=amount;
		}
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			money+=amount;
		}
	}
	
	
	

}
