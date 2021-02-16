package book.home_084;

import book.home_081.Account;

public class AccountReferencing {
	public static void main(String[] args) {
		Account acc1 = new Account(1000);
		Account acc2 = new Account(1000);
		System.out.println(acc1.hashCode());
		System.out.println(acc1);
		System.out.println(acc2);
		acc1.deposit(3000);
		System.out.println(acc1);
		
		
	}

}
