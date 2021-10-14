package application;

import entities.Account;
//import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAccount {

	public static void main(String[] args) {
		
		//Polimorfismo
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1021, "Rita", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		/*
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//sobreposi��o no metodo account
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//Sobreposi��o usando SUPER
		Account acc3 = new BusinessAccount(1001, "Alex", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING - objeto da subclasse para a superclasse
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
				
		//DOWNCASTING - objeto da superclasse para a subclasse - casting manual
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; d� erro de compila��o acc3 � SavingsAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
			
		}
		*/
	}

}
