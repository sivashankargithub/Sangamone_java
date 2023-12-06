package com.sangamone;
//class Penalty{
//	public int charges(String bank_name, double penalty) {
//		penalty=29;
//		return penalty;
//		
//	}
//}
public class Bank_Acc {
	private long acc_no;
	private String name;
	private double balance;
	private final int penalty=29;
	private String bank_name="ICICI";
	private final double rate_of_int=0.03;
	private final double time = 0.083;
	private final int min_balance=1000;
	
	public Bank_Acc(long acc_no, String name, double balance) {
		this.acc_no = acc_no;
		this.name = name;
		this.balance = balance; 
	}
	
	public void deposit(double amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("Deposit of Rs : " +amt+ " successfully");
		}
		else {
			System.out.println("Failed to depost your amount");
		}
	}
	public  void withdraw(double amt) {
		if(amt > 0 && balance >= amt) {
				balance-=amt;
				System.out.println("Withdraw of Rs : " +amt+ " successsfully");
		}
		if(balance<1000) {
			balance-=penalty;
		}
		if(amt>balance) {
			balance-=penalty;
		}
		else {
			System.out.println("Transaction Declined");
		}
	}
	public void printPassBook() {
		System.out.println("account number  : "+acc_no);
		System.out.println("Name            : "+name);
		System.out.println("Current Balance : "+balance);
	}
	public void clacuate_interest() {
		if(balance>=min_balance) {
			double interest=(balance*time*rate_of_int);
			balance=balance+interest;
			System.out.println("The interest has been credited in the month of Janaury of Rs : "+interest);
		}
	}
		public static void main(String[] args) {
		System.out.println("---------Account Information--------");
		Bank_Acc bank_acc=new Bank_Acc(21313, "Sivashankar",0);
		bank_acc.deposit(2500);
		bank_acc.withdraw(600);
		bank_acc.clacuate_interest();
		bank_acc.printPassBook();
	}
}