package pkg3;

public class BankAccount {
	private String acc_number;
	private double balance;
	public BankAccount(String ac_number, double balance) {
		this.acc_number=ac_number;
		this.balance=balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
		}
	}
	public void withdraw(double amount) throws InsufficientFundException {
		//2000 -  withdraw 3000
		if(amount>balance) {
			throw new InsufficientFundException("Insufficient Funds. Your Bank Balance is = "+balance+" But you tried to withdraw "+amount); 
		}
		balance=balance-amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public String getAccNumber() {
		return acc_number;
	}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount("33982621312",500);
		System.out.println("Initial Balance = "+ba.getBalance());
		ba.deposit(10000);
		System.out.println("Balance after deposit = "+ba.getBalance());
		try{
			ba.withdraw(15000);
		}
		catch(InsufficientFundException ife){
			System.out.println("Insufficient Fund Exception "+ife.getMessage());
		}
	}
	
}
