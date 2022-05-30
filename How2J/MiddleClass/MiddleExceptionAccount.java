package MiddleClass;

public class MiddleExceptionAccount {
	
	protected double balance;
	
	public MiddleExceptionAccount(double account) {
		this.balance = account;
	}
	
	protected double getBalance() {
		return balance;
	}
	
	protected void despoit (double awt) {
		this.balance += awt;
	}
	
	protected void withdraw (double awt) throws OverdraftException{
		if(awt > this.balance)
			throw new OverdraftException("余额不足",awt - this.balance);
		this.balance -= awt;
		
	}

}
