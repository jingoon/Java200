package book.home_081;

public class AccountsMain {
	
	public static void main(String[] args) {
		Account acc1= new Account(1000);	//1000 ���� ����	
		acc1.deposit(3000);					//�Ա� 3000
		acc1.deposit(2000);					//�Ա� 2000
		acc1.withdraw(500);					//��� 500
		System.out.println(acc1.getMoney());//�ܾ���ȸ 
	}

}
