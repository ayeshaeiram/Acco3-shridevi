package com.tnsif.Inheritanceprogram;


class Bank{
	void bankname() {
		System.out.println("ABC Bank");
	}
}
class SavingBank extends Bank{
	void interest() {
		System.out.println("saving account gives interest");
	}
}
class CurrentAccount extends Bank {
	void overdraft() {
		System.out.println("current account provides overdraft");
	}
}
public class HierarchicalDemo {
	public static void main(String[] args) {
		SavingBank s = new SavingBank();
		s.interest();
		s.bankname();
		CurrentAccount c = new CurrentAccount();
		c.bankname();
		c.overdraft();
	}

}
