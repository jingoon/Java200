package book.home_081;

public class AccountsMain {
	
	public static void main(String[] args) {
		Account acc1= new Account(1000);	//1000 계좌 생성	
		acc1.deposit(3000);					//입금 3000
		acc1.deposit(2000);					//입금 2000
		acc1.withdraw(500);					//출금 500
		System.out.println(acc1.getMoney());//잔액조회 
	}

}
