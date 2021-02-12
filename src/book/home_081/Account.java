package book.home_081;

public class Account {
	
	private double money=500;	//����� �ʱ�ȭ
	
	public Account(double money) {	//�����ڿ� ���� �ʱ�ȭ
		this.money=money;
	}
	
	public Account() {		//default �����ڿ� ���� �ʱ�ȭ
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
