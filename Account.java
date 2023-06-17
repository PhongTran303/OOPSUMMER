package bai6;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	
	
	public Account() {
	}


	public Account(long accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}


	public Account(long accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getRATE() {
		return RATE;
	}


	public boolean deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			System.out.println("Gửi tiền thành công!!!");
			System.out.println(balance);
			return true;
		}else {
			System.out.println("Gửi tiền thất bại!!!");
			System.out.println(balance);
			return false;
		}
	}
	public boolean withdraw(double amount, double fee) {
		if(amount>0 || amount + fee <= balance) {
			balance = balance - (amount + fee);
			System.out.println("Rút tiền thành công!!!");
			System.out.println(balance);
			return true;
		}else {
			System.out.println("Rút tiền thất bại");
			System.out.println(balance);
			return false;
		}
	}
	public double addInterest() {
		return balance + balance * RATE;
	}
	public boolean transfer(Account account, double amount) {
		double	balance2 = account.getBalance();
		if(amount > 0) {
			balance = balance - amount;
			balance2 =  balance2 + amount;
			account.setBalance(balance2);
			System.out.println("Chuyển tiền thành công!!!");
			return true;
		}else {
			System.out.println("Chuyển tiền không thành công");
			return false;
		}
		
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + ", RATE=" + RATE
				+ "]";
	}
	
	
}